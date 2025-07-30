package com.ktdsuniversity.edu.coupang;

import java.util.Objects;

public class Order {

	private String location;
	private String payType;
	private int amount;
	private int dcAmount;
	private int shippingFee;
	
	/**
	 * 
	 * @param location
	 * @param payType
	 * @param amount
	 * @param dcAmount
	 * @param shippingFee
	 */
	public Order(String location, String payType, int amount, int dcAmount, int shippingFee) {
		this.location = location;
		this.payType = payType;
		this.amount = amount;
		this.dcAmount = dcAmount;
		this.shippingFee = shippingFee;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getDcAmount() {
		return dcAmount;
	}

	public void setDcAmount(int dcAmount) {
		this.dcAmount = dcAmount;
	}

	public int getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(int shippingFee) {
		this.shippingFee = shippingFee;
	}

	@Override
	public String toString() {
		return "Order [location=" + this.location + ", payType=" + this.payType + ", amount=" + this.amount + ", dcAmount=" + this.dcAmount
				+ ", shippingFee=" + this.shippingFee + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.amount, this.dcAmount, this.location, this.payType, this.shippingFee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return this.amount == other.amount && this.dcAmount == other.dcAmount && Objects.equals(this.location, other.location)
				&& Objects.equals(this.payType, other.payType) && this.shippingFee == other.shippingFee;
	}
	
	
	
	
}
