package com.ktdsuniversity.edu.collections.list.shop;

import java.util.Objects;

public class Product {
	
	private String name;
	private int price;
	private int stock;
	
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price, stock);
	}


	@Override
	public boolean equals(Object obj) { // 이렇게 하려고 equals 오버라이딩 함
		if (this == obj) {
			return true;			
		}
		if (obj == null) {
			return false;			
		}
		if(obj instanceof Product other) {			
			return this.name.equals(other.getName());
		}
		else {
			return false;
		}
		
	}
	

}
