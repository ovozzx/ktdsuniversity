package com.ktdsuniversity.edu.fp.anonymousclass;

public class Calculator {

	private int numberOne;
	private int numberTwo;
	
	public Calculator(int numberOne, int numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	public int calc(Computable computable) {
		return computable.calc(this.numberOne, this.numberTwo);
	}
	
}
