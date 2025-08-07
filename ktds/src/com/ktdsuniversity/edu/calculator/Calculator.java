package com.ktdsuniversity.edu.calculator;

public class Calculator {

	private long result;
	
	public long getResult() {
		return this.result;
	}
	
	public void compute(String operator, int numberOne, int numberTwo) {
		// operator == "+" ==> numberOne + numberTwo ==> result
		// operator == "-" ==> numberOne + numberTwo ==> result
		// operator == "*" ==> numberOne + numberTwo ==> result
		// operator == "/" ==> numberOne + numberTwo ==> result
		// 아래는 지역 상수라서 해당 블럭에서만 쓸 수 있음 (코드의 중복)
		//final String ADD = "+"; // 상수는 대문자 
		//final String SUB = "-"; // 상수는 대문자 
		//final String MUL = "*"; // 상수는 대문자 
		//final String DIV = "/"; // 상수는 대문자 
		
		
		if(operator.equals(Type.ADD)) {
			this.add(numberOne, numberTwo);
		}
		else if(operator.equals(Type.SUB)) {
			this.sub(numberOne, numberTwo);
		}
		else if(operator.equals(Type.MUL)) {
			this.mul(numberOne, numberTwo);
		}
		else if(operator.equals(Type.DIV)) {
			this.div(numberOne, numberTwo);
		}
	}
	
	private void add(int numberOne, int numberTwo) { // 가리고 싶은 기능을 private로 설정
		this.result = numberOne + numberTwo;
	}
	
	private void sub(int numberOne, int numberTwo) {
		this.result = numberOne - numberTwo;
	}
	
	private void mul(int numberOne, int numberTwo) {
		this.result = numberOne * numberTwo;
	}
	
	private void div(int numberOne, int numberTwo) {
		this.result = numberOne / numberTwo;
	}
}
