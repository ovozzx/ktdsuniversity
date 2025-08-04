package com.ktdsuniversity.edu.market;

public class Store {
	
	/**
	 * 클래스의 내용을 작성하는 일반적인 순서 (실무 기준)
	 * 1. 상수
	 * 2. 멤버변수 (인스턴스 필드)
	 * 3. 생성자
	 * 4. Getter / Setter
	 * 5. Method
	 * 6. private Method
	 */
	
	/**
	 * 금고
	 */
	int safe; 
	/**
	 * 재고
	 */
	int stock; 
	/**
	 * 상품의 단가
	 */
	int price;
	/**
	 * 판매 개수
	 */
	int saleCount;
	
	// 생성자
	public Store(int safe, int stock, int price, int saleCount) {
		System.out.println("생성자가 실행되는 중입니다.");
		System.out.println(this);
		
		this.safe = safe;
		this.stock = stock;
		this.price = price;
		this.saleCount = saleCount;
	}
	/*
	public Store() {
		System.out.println("생성자가 실행되는 중입니다.");
		System.out.println(this);
		
		this.safe = 0;
		this.stock = 10;
		this.price = 1_000_000;
		this.saleCount = 0;
	}*/
	
	// 메소드 만드는 실습
	/**
	 * Customer에게 물건을 판매하는 기능
	 * 	1. Customer가 구매하려는 구매 개수보다 재고가 많아야 한다.
	 * 	2. Customer가 구매하려는 최종 금액보다 지갑에 돈이 많아야 한다.
	 * 	3. 1, 2가 만족이 되어서 판매가 완료되었을 경우, 판매 개수는 구매 개수만큼 증가해야 하고
	 * 	4. 구매 개수 X 단가만큼 safe가 증가되어야 하고
	 * 	5. 구매개수 만큼 stock이 감소해야 한다.
	 * 	6. Customer의 지갑에서는 구매개수 X 단가만큼이 감소되어야 하고
	 * 	7. Customer의 buyCount는 구매개수 만큼 증가되어야 한다.
	 */
	
	
	
	
	
	/**
	 * (int price, Customer other) 
	 * */
	
	/*void sell(int price, int count) {
		if(this.stock >= count) {
			this.safe += (count * this.price);
			this.stock -= count;
			this.saleCount += count;
			System.out.println("Store가 " + this.price + " (원) 가격의 " + count 
					+ " 개를 구매하여, " + "금고는 " + this.safe + " (원)이 되었습니다.." 
					+ " 재고는 " + this.stock + " 개가 되었습니다.");
		}
		else {
			System.out.println("재고가 부족합니다.");
		}
	}*/
	
	
	 
	 void sell(int count, Customer customer){
	 	int amount = count * this.price;
	 	if (this.stock >= count && customer.wallet >= amount){
	 		this.saleCount += count;
	 		this.safe += amount;
	 		this.stock -= count;
	 		customer.get(count, amount);
	 		
		 } 
		 // 포맷팅
		 //System.out.println("금고 : %d원, 재고수 : %d개, 단가 : %d원, 판매개수 : %d개"
		 //					.formatted(this.safe, this.stock, this.price, this,saleCount));
	 }
	 

}
