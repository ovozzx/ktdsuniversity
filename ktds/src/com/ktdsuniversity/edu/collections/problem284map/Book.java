package com.ktdsuniversity.edu.collections.problem284map;

public class Book {

	private String name;
	private boolean isBorrow; // 대여여부 -< 대여 중 : true 
	private int price;
	
	public Book(String name, boolean isBorrow, int price) {
		this.name = name;
		this.isBorrow = isBorrow;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBorrow() {
		return isBorrow;
	}

	public void setBorrow(boolean isBorrow) {
		this.isBorrow = isBorrow;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
