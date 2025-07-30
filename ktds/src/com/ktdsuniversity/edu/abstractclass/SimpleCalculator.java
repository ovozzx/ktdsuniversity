package com.ktdsuniversity.edu.abstractclass;

// 더하기만 하는 계산기
public class SimpleCalculator extends AbstractCalculator { // 부모에 생성자 있을 경우, 자식에서도 생성자 만들어줘야 함
	// 에러 발생 이유 : (1) 생성자 미존재, (2) 추상 메소드 존재 (오버라이딩 필요)
	
	public SimpleCalculator() {
		super();
	}
	
	public SimpleCalculator(int numberOne, int numberTwo) {
		super(numberOne, numberTwo);
	}
	
	@Override // 왼쪽 A 표시 -> 추상 뜻
	protected int calculator() {
		// TODO Auto-generated method stub
		return super.getNumberOne() + super.getNumberTwo();

	}
	
}
