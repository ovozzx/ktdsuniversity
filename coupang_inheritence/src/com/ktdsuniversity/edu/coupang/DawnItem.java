package com.ktdsuniversity.edu.coupang;

import java.util.Objects;

public class DawnItem extends WowItem {

	private boolean isDawnDelevery;

	public DawnItem(int number, String name, int price, int shippingFee, String rocketType, double dcRatio,
			boolean isRocket, boolean isDawnDelevery) {
		super(number, name, price, shippingFee, rocketType, dcRatio, isRocket);
		this.isDawnDelevery = isDawnDelevery;
	}

	public boolean getIsDawnDelevery() {
		return this.isDawnDelevery;
	}

	public void setIsDawnDelevery(boolean isDawnDelevery) {
		this.isDawnDelevery = isDawnDelevery;
	}

	@Override
	public void printItem(User user) {
		super.printItem(user); // 여기서 super는 WowItem
		if (user instanceof WowUser) {
			System.out.println("새벽배송 여부: " + this.isDawnDelevery);
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDawnItem [isDawnDelevery=" + this.isDawnDelevery + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.isDawnDelevery);
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
		DawnItem other = (DawnItem) obj;
		return this.isDawnDelevery == other.isDawnDelevery;
	}

}