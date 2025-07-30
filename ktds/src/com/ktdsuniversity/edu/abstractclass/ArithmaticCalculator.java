package com.ktdsuniversity.edu.abstractclass;

public class ArithmaticCalculator extends BetterCalculator{

	public ArithmaticCalculator(Object numberOne, Object numberTwo) {
		super(numberOne, numberTwo);
	}
	
	@Override
	protected double calculate(String operator) {
		// TODO Auto-generated method stub
		// Object result = super.getNumberOne() + super.getNumberTwo(); 
		// Object는 무엇이든 넣을 수 있지만, 위처럼 + 이런 게 안 됨
		// double result = Double.parseDouble(super.getNumberOne()); // String에 Object를 넣어서 오류
		double result = Double.parseDouble(super.getNumberOne().toString());
		// Object는 모든 클래스의 부모
		// String은 Object의 자식
		// String is a Object
		// Object isnt a String
		if(operator.equals("+")) {
			result += Double.parseDouble(super.getNumberTwo().toString());
		}
		else if(operator.equals("-")) {
			result -= Double.parseDouble(super.getNumberTwo().toString());
		}
		else if(operator.equals("*")) {
			result *= Double.parseDouble(super.getNumberTwo().toString());
		}
		else if(operator.equals("/")) {
			result /= Double.parseDouble(super.getNumberTwo().toString());
		}
		else if(operator.equals("**")) {
			result = Math.pow(result, Double.parseDouble(super.getNumberTwo().toString()));
		}
		
		//if (super.getNumberOne() instanceof Integer numberOne) { // primitive 타입은 인스턴스라고 부르지 않음
			// int를 레퍼런스 타입으로 만든 것 = Integer -> instanceof int 안됨
	
		return result;
	}
}
