package com.ktdsuniversity.edu.fp.shop;

public interface Seller {
	
	/**
	 * 판매 기능
	 * @param productName : 판매 상품명
	 * @param orderQuantity : 주문 수량
	 * @param contains : 제품이 존재하는 확인하는 함수
	 * @param extracter : 제품을 가져오는 함수
	 */
	void sell(String productName, int orderQuantity, Contains contains, Extracter extracter);
	
	void add(Object obj);
	
	void addStock(String productName, int stock);
	
	void removeStock(String productName);

}
