package com.ktdsuniversity.edu.enums;

public class Person {

	/**
	 * 지갑의 돈
	 */
	private int wallet;
	/**
	 * 장바구니
	 * 구매할 때마다 증가
	 */
	private int cart;

	public Person(int wallet) {
		this.wallet = wallet;
	}

	void buy(Store mart, int buyCount, Payments PayType) {
		// 카드, 계좌이체, 포인트별 한도 필요 
		if(mart.getStock() >= buyCount && this.wallet >= (buyCount * mart.getPrice())) {
			mart.setSafe(mart.getSafe() + (buyCount * mart.getPrice()));
			mart.setStock(mart.getStock() - buyCount);		
			System.out.println(PayType.toString() + " 로 결제 시도!"); // toString 없어도 됨
			System.out.println(mart.getPrice() + " 원, " + buyCount + " 개를 '구매' 완료하였습니다.");
		}
		else {
			System.out.println("구매할 수 없습니다.");
		}
	}
	
	void refund(Store mart, int buyCount, Payments PayType) {
		mart.setSafe(mart.getSafe() - (buyCount * mart.getPrice()));
		mart.setStock(mart.getStock() + buyCount);	
		System.out.println(PayType.toString() + " 로 환불 시도!");
		System.out.println(mart.getPrice() + " 원, " + buyCount + " 개를 '환불' 완료하였습니다.");
	}

}
