package com.ktdsuniversity.edu.fp.shop2;

public interface Seller {

	/**
	 * 판매 기능
	 * @param productName 판매 상품 명
	 * @param orderQuantity 주문 수량
	 */
	void sell(String productName, int orderQuantity);
	
	void add(Object object);
	
	void addStock(String productName, int stock);
	
	void removeStock(String productName);
	
	void printItems();
}