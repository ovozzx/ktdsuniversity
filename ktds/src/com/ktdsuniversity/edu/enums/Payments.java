package com.ktdsuniversity.edu.enums;

public enum Payments {

	CARD("카드"),
	BANKING("계좌이체"),
	POINT("포인트");
	
	String value;
	
	Payments(String value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
}
