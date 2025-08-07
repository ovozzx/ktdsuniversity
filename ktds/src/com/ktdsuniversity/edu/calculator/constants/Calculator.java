package com.ktdsuniversity.edu.calculator.constants;

public class Calculator {

	private long result;
	
	public long getResult() {
		return this.result;
	}
	
	public void compute(OperationType type, int numberOne, int numberTwo) {
		// operator == "+" ==> numberOne + numberTwo ==> result
		// operator == "-" ==> numberOne + numberTwo ==> result
		// operator == "*" ==> numberOne + numberTwo ==> result
		// operator == "/" ==> numberOne + numberTwo ==> result
		// 아래는 지역 상수라서 해당 블럭에서만 쓸 수 있음 (코드의 중복)
		//final String ADD = "+"; // 상수는 대문자 
		//final String SUB = "-"; // 상수는 대문자 
		//final String MUL = "*"; // 상수는 대문자 
		//final String DIV = "/"; // 상수는 대문자 
		
		System.out.println(type + " 연산 결과");
		
		if(type == OperationType.ADD) {
			this.add(numberOne, numberTwo);
		}
		else if(type == OperationType.SUB) {
			this.sub(numberOne, numberTwo);
		}
		else if(type == OperationType.MUL) {
			this.mul(numberOne, numberTwo);
		}
		else if(type == OperationType.DIV) {
			this.div(numberOne, numberTwo);
		}
		else if(type == OperationType.MOD) {
			this.result = numberOne % numberTwo;
		}
		else if(type == OperationType.POWER) {
			this.result = (long) Math.pow(numberOne, numberTwo);
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
