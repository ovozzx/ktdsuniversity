package com.ktdsuniversity.edu.coupang;

import java.util.Objects;

public class Item {

	private int number;
	private String name;
	private int price;
	private int shippingFee;
	
	public Item(int number, String name, int price, int shippingFee) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.shippingFee = shippingFee;
	}

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

	public int calculatePrice(User user) {
		return this.price;
	}
	
	
	public int calculateShippingFee(User user) {
		int shippingFee = this.getShippingFee();
		return shippingFee;
	}
	
	public void printItem(User user) {
		String itemInfo = "상품번호: %d, 상품명: %s, 가격: %d, 배송비: %d";
		System.out.println(itemInfo.formatted(this.number, this.name, 
						this.price, this.shippingFee));
	}
	
	public boolean canBuy(User user) {
		return true;
	}

	@Override
	public String toString() {
		return "Item [number=" + this.number 
				+ ", name=" + this.name 
				+ ", price=" + this.price 
				+ ", shippingFee=" + this.shippingFee + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.number, this.price, this.shippingFee);
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
		Item other = (Item) obj;
		return Objects.equals(this.name, other.name) 
				&& this.number == other.number 
				&& this.price == other.price
				&& this.shippingFee == other.shippingFee;
	}
	
	

}