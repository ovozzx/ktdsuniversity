package com.ktdsuniversity.edu.fp.cartoon;


/**
 * 만화책
 * 데이터 클래스 (기능 X)
 */
public class Cartoon {

	private String name;
	private boolean isRental;
	private int rentalFee;


	
	public Cartoon(String name, boolean isRental, int rentalFee){ // 생성자는 모두 접근 가능해야하므로 public
		this.name = name;
		this.isRental = isRental;
		this.rentalFee = rentalFee;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public int getRentalFee() {
		return this.rentalFee;
	}
	
	public void setIsRental(boolean isRental) {
		this.isRental = isRental;
	}

	public boolean getIsRental() {
		// TODO Auto-generated method stub
		return this.isRental;
	}
}
