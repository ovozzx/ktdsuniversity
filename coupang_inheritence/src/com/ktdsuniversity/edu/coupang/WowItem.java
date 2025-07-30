package com.ktdsuniversity.edu.coupang;

import java.util.Objects;

public class WowItem extends Item {

	/**
	 * S: 판매자 로켓 C: 쿠팡 직배송 로켓
	 */
	private String rocketType;
	private double dcRatio;
	private boolean isRocket;

	public WowItem(int number, String name, int price, int shippingFee, String rocketType, double dcRatio,
			boolean isRocket) {
		super(number, name, price, shippingFee);
		this.rocketType = rocketType;
		this.dcRatio = dcRatio;
		this.isRocket = isRocket;
	}

	public String getRocketType() {
		return this.rocketType;
	}

	public void setRocketType(String rocketType) {
		this.rocketType = rocketType;
	}

	public double getDcRatio() {
		return this.dcRatio;
	}

	public void setDcRatio(double dcRatio) {
		this.dcRatio = dcRatio;
	}

	public boolean getIsRocket() {
		return this.isRocket;
	}

	public void setIsRocket(boolean isRocket) {
		this.isRocket = isRocket;
	}

	
	public int calculatePrice(WowUser user) {
		int price = (int) (super.calculatePrice(user) * ((100 - this.dcRatio) / 100));
		// 와우 회원 추가할인
		price = (int) (price * ((100 - 5d) / 100));
		return price;
	}
	
	@Override
	public int calculateShippingFee(User user) {
		return 0;
	}
	
//	@Override
//	public int calculatePrice(User user) {
//		if ( user instanceof WowUser ) {
//			int price = (int) (super.calculatePrice(user) * ((100 - this.dcRatio) / 100));
//			// 와우 회원 추가할인
//			price = (int) (price * ((100 - 5d) / 100));
//			return price;
//		}
//		
//		return super.calculatePrice(user);
//	}
	
	@Override
	public void printItem(User user) {
		if (user instanceof WowUser wowUser) { // true면 User를 wowUser로 넣는다 -> Wowuser가 user라면
			this.printItem( wowUser );
		}
		else {
			super.printItem(user); // super는 Item 클래스
		}
		
	}
	
	private void printItem(WowUser user) {
		int price = this.calculatePrice(user);
		String itemInfo = "할인 후 가격: %d, 로켓배송 여부: 로켓배송, 로켓 배송 종류: %s, 할인율: %.1f";
		
		String rocketType = "";
		if (this.isRocket && this.rocketType.equals("S")) {
			rocketType = "판매자 로켓 배송";
		}
		else if (this.isRocket && this.rocketType.equals("C")) {
			rocketType = "쿠팡 로켓 배송";
		}
		
		double dcRatio = this.dcRatio + 5;
		super.printItem(user);
		System.out.println(itemInfo.formatted(price, rocketType, dcRatio));
	}
	
	@Override
	public boolean canBuy(User user) {
		return user instanceof WowUser;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nWowItem [rocketType=" + this.rocketType 
				+ ", dcRatio=" + this.dcRatio 
				+ ", isRocket=" + this.isRocket + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.dcRatio, this.isRocket, this.rocketType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		WowItem other = (WowItem) obj;
		return Double.doubleToLongBits(this.dcRatio) == Double.doubleToLongBits(other.dcRatio) 
				&& this.isRocket == other.isRocket
				&& Objects.equals(this.rocketType, other.rocketType);
	}
	
	

}