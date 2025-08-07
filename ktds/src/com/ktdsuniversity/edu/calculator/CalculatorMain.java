package com.ktdsuniversity.edu.calculator;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		// 아래는 지역 상수라서 해당 블럭에서만 쓸 수 있음
		final String ADD = "+"; // 상수는 대문자 
		final String SUB = "-"; // 상수는 대문자 
		final String MUL = "*"; // 상수는 대문자 
		final String DIV = "/"; // 상수는 대문자 
		
		Calculator calc = new Calculator();
		
		// 의미를 명확하게 직관적으로 사용하기 위해 상수 사용!
		calc.compute(Type.ADD, 10, 3); // compute를 통해 동작
		System.out.println(calc.getResult());
		
		calc.compute(Type.SUB, 10, 3); 
		System.out.println(calc.getResult());
		
		calc.compute(Type.MUL, 10, 3); 
		System.out.println(calc.getResult());
		
		calc.compute(Type.DIV, 10, 3); 
		System.out.println(calc.getResult());
		
	}

}
