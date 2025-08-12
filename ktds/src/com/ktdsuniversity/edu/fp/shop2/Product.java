package com.ktdsuniversity.edu.fp.shop2;

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

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [name=" + this.name + ", price=" + this.price + ", stock=" + this.stock + "]";
	}

}