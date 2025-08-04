package com.ktdsuniversity.edu.market;

public class Customer {
	
	/**
	 * 지갑
	 * */
	int wallet;
	/**
	 * 구매 개수 
	 */
	int buyCount;
	
	public Customer(){
		this.wallet = 3_500_000;
		this.buyCount = 0;
	}
	
	/*
	void get(구매개수, 지출할 돈) {
		구매개수만큼 증가
		지출할 돈만큼 감소
	}*/
	
	/**
	 * (int count, Store other)
	 * */
	/*
	void get(int count, Store other) {
		if(this.wallet >= (count * other.price)) {
		this.wallet -= (count * other.price);
		this.buyCount += count;
		System.out.println("Customer가 " + other.price + " (원) 가격의 " + buyCount 
				+ " 개를 구매하여, " + "지갑에는 " + wallet + " (원)이 남았습니다." );
		System.out.println("누적 구매 개수는 " + this.buyCount + " 개 입니다.");
		}
		else {
			System.out.println("지갑에 돈이 부족합니다.");
		}
	}*/
	
	
	 void get(int count, int amount){ // amount : 총 지불비용
	 	this.buyCount += count;
	 	this.wallet -= amount; 
	 }
	 
}
