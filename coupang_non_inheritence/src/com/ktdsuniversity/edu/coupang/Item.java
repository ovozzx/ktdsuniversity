package com.ktdsuniversity.edu.coupang;

import java.util.Objects;

public class Item {

	private int number;
	private String name;
	private int price; // 최대 약 21.4억까지 표시 가능
	private int shippingFee;
	/**
	 * S : 판매자 로켓 C : 쿠팡 직배송 로켓
	 */
	private String rocketType;
	private double dcRatio;
	private boolean isRocket;

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getShippingFee() {
		return this.shippingFee;
	}

	public void setShippingFee(int shippingFee) {
		this.shippingFee = shippingFee;
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

	public void setRocket(boolean isRocket) {
		this.isRocket = isRocket;
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param price
	 * @param shippingFee
	 * @param rocketType
	 * @param dcRatio
	 * @param isRocket
	 */
	public Item(int number, String name, int price, int shippingFee, String rocketType, double dcRatio,
			boolean isRocket) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.shippingFee = shippingFee;
		this.rocketType = rocketType;
		this.dcRatio = dcRatio;
		this.isRocket = isRocket;
	}
	
	public int caculatePrice(User user) {
		int price = (int) (this.getPrice() * ((100 - this.getDcRatio()) / 100)); // 일반 할인률
		if (user.getIsSubsribe()){// 와우 회원 할인률
			price = (int) (price * ((100 - 5) / 100)); // 모든 제품 5% 할인
		}
		return price;
	}
	
	public int caculateShippingFee(User user) {
		int shippingFee = this.getShippingFee();
		if (user.getIsSubsribe()) {
			shippingFee = 0;
		}
		return shippingFee;
	}
	

	public void printItems(User user) {
		int price = (int) (this.price * ((100 - this.dcRatio) / 100)); // 일반 할인률
		if (user.getIsSubsribe()){// 와우 회원 할인률
			price = (int) (price * ((100 - 5) / 100)); // 모든 제품 5% 할인
		}
		
		String itemInfo = "상품번호 : %d, 상품명 : %s, 할인 전 가격 : %d, 할인 후 가격 : %d, 배송비 : %d, 로켓배송 여부 : %s, 로켓 배송 종류 : %s, 할인률 : %.1f";
		String deliveryType = "일반배송";
		if(this.isRocket) {
			deliveryType = "로켓배송";
		}
		String rocketType = "";
		if(this.isRocket && this.rocketType.equals("S")) {
			rocketType = "판매자 로켓 배송";
		}
		else if(this.isRocket && this.rocketType.equals("C")) {
			rocketType = "쿠팡 로켓 배송";
		}
		double dcRatio = this.dcRatio;
		if(user.getIsSubsribe()) {
			dcRatio += 5;
		}
		
		System.out.println(itemInfo.formatted(this.number, this.name, this.price, price, this.shippingFee, deliveryType, rocketType, dcRatio));
		
		// TODO 회원이 와우회원일 때, 추가 할인 적용.
		//System.out.println(this.toString());
	}
	
	
	
	@Override
	public String toString() {
		return "Item [number=" + this.number + ", name=" + this.name + ", price=" + this.price + ", shippingFee=" + this.shippingFee
				+ ", rocketType=" + this.rocketType + ", dcRatio=" + this.dcRatio + ", isRocket=" + this.isRocket + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.dcRatio, this.isRocket, this.name, this.number, this.price, this.rocketType, this.shippingFee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Double.doubleToLongBits(this.dcRatio) == Double.doubleToLongBits(other.dcRatio) && this.isRocket == other.isRocket
				&& Objects.equals(this.name, other.name) && this.number == other.number && this.price == other.price
				&& Objects.equals(this.rocketType, other.rocketType) && this.shippingFee == other.shippingFee;
	}

}
