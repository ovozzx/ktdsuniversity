package com.ktdsuniversity.edu.calculator.constants;

public enum OperationType { // 상수 그자체

	/**
	 * 더하기 연산
	 */
	ADD("더하기"), 
	/**
	 * 빼기 연산
	 */
	SUB("빼기"), 
	/**
	 * 나누기 연산
	 */
	DIV("곱하기"),
	/**
	 * 곱하기 연산
	 */
	MUL("곱하기"), 
	/**
	 * 나머지 연산
	 */
	MOD("나머지"),
	/**
	 * 제곱 연산
	 */
	POWER("제곱"); // 모두 상수
	
	String value;
	
	OperationType(String value){ // Enum도 클래스처럼 생성자 쓸 수 있지만, 접근 제어 지시자가 붙으면 안됨
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value; // => 더하기, 빼기 ...
	}
	
}
