package com.ktdsuniversity.edu.abstractclass;

// 제곱만 하는 계산기
public class PowerCalculator extends AbstractCalculator{
	
	public PowerCalculator() {
		super();
	}
	
	public PowerCalculator(int numberOne, int numberTwo) {
		super(numberOne, numberTwo);
	}
	
	@Override
	protected int calculator() {
		// TODO Auto-generated method stub
		return (int) Math.pow(super.getNumberOne(), super.getNumberTwo()); //  Math.pow(,) => 매개변수 & 반환값 모두 double
	}

}
