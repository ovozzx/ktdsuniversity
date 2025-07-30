package com.ktdsuniversity.edu.abstractclass;

// 서비스 자체를 추상화
// 계산기                             
public abstract class AbstractCalculator { // 클래스에도 추상 표시 -> 추상 클래스 생성

	private int numberOne; // protected로 바꾸면, 상속된 클래스에선 사용 가능
	private int numberTwo;
	
	public AbstractCalculator() {
		
	}
	
	public AbstractCalculator(int numberOne, int numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	public int getNumberOne() {
		return this.numberOne;
	}
	
	public int getNumberTwo() {
		return this.numberTwo;
	}

	//public abstract int calculator(); // {}는 동작을 알 때 사용 -> 그냥 쓰면 에러나서 추상된 메소드라는 것을 알려줘야 함
	protected abstract int calculator();
	// 보통 public으로 사용 안 함 -> private로 하면 상속에서 못 씀 -> protected로 바꿔서 상속된 클래스에서만 접근할 수 있게 함
	
	public void printResult() {
		int result = this.calculator(); // 어떤 식으로 계산될 지 모름
		System.out.println("결과 : " + result);
	}
}
