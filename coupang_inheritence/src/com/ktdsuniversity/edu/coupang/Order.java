package com.ktdsuniversity.edu.coupang;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

	private String location;
	private String payType;
	private int amount;
	private int dcAmount;
	private int shippingFee;
	private LocalDate deliveryDate;
	
	public Order(String location, String payType, 
			int amount, int dcAmount, int shippingFee, Item item) {
		this.location = location;
		this.payType = payType;
		this.amount = amount;
		this.dcAmount = dcAmount;
		this.shippingFee = shippingFee;
		if (item instanceof DawnItem) {
			this.deliveryDate = LocalDate.now(); 
		}
		else if(item instanceof WowItem) {
			this.deliveryDate = LocalDate.now().plusDays(1);
		}
		else {
			this.deliveryDate = LocalDate.now().plusDays(3);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getDcAmount() {
		return this.dcAmount;
	}

	public void setDcAmount(int dcAmount) {
		this.dcAmount = dcAmount;
	}

	public int getShippingFee() {
		return this.shippingFee;
	}

	public void setShippingFee(int shippingFee) {
		this.shippingFee = shippingFee;
	}

	public LocalDate getDeliveryDate() {
		return this.deliveryDate;
	}
	
	@Override
	public String toString() {
		return "Order [location=" + this.location + ", payType=" 
				+ this.payType + ", amount=" + this.amount 
				+ ", dcAmount=" + this.dcAmount
				+ ", shippingFee=" + this.shippingFee + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.amount, this.dcAmount, this.location, this.payType, this.shippingFee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Order other = (Order) obj;
		return this.amount == other.amount 
				&& this.dcAmount == other.dcAmount 
				&& Objects.equals(this.location, other.location)
				&& Objects.equals(this.payType, other.payType) 
				&& this.shippingFee == other.shippingFee;
	}

}