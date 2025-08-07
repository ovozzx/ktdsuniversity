package com.ktdsuniversity.edu.calculator;

public interface Type {

	/**
	 * 실무 환경에서 상수가 필요할 경우
	 * 인터페이스에서 생성을 시킨다.
	 */
	String ADD = "+";// (public static final) String ADD = "+"; 인터페이스에서는 앞에 생략 가능
	String SUB = "-";
	String MUL = "*";
	String DIV = "/";
	
}
