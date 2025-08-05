package com.ktdsuniversity.edu.collections.list.shop;

public interface Seller {
	
	/**
	 * 판매 기능
	 * @param productName : 판매 상품명
	 * @param orderQuantity : 주문 수량
	 */
	void sell(String productName, int orderQuantity);

}
