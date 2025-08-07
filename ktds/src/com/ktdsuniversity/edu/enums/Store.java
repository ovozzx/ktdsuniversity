package com.ktdsuniversity.edu.enums;

public class Store {
	
	/**
	 * 금고
	 */
	private int safe = 0;
	/**
	 * 판매 상품의 가격
	 */
	private int price;
	/**
	 * 판매 상품의 재고
	 */
	private int stock;
	
	public Store(int price, int stock) {
		this.price = price;
		this.stock = stock;
	}
	
	int getSafe() {
		return this.safe;
	}
	
	int getPrice() {
		return this.price;
	}
	
	int getStock() {
		return this.stock;
	}
	
	void setSafe(int safe) {
		this.safe = safe;
	}
	
	void setStock(int stock) {
		this.stock = stock;
	}
	
	void printAll()
	{
		System.out.println("현재 금고는 %d 원 입니다.".formatted(this.safe));
		System.out.println("현재 재고는 %d 개 입니다.".formatted(this.stock));
	}
}



