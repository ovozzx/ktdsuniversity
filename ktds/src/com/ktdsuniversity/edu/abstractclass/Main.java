package com.ktdsuniversity.edu.abstractclass;

public class Main {

	public static void main(String[] args) {
		
		// AbstractCalculator = new AbstractCalculator(); 
		// 에러 발생 -> 추상 클래스 or 인터페이스는 인스턴스로 만들 수 없음
		// 추상 메소드가 존재하기 때문 (어떤 식으로 동작할 지 모름)
		// 인스턴스로 만들 수 있는 대상은 모든 메소드가 구현된 것만 가능
		// 상속 시켜서 만들어야 함
		AbstractCalculator calc = new SimpleCalculator(10, 50); // 이렇게 하면 만들어짐, simple에는 모든 내용이 있기 때문
		calc.printResult(); // 부모(Abstract)의 printResult 실행 -> 자식 (Simple)의 calulator 실행
		//calc.calculator() -> protected는 같은 패키지에서도 보이긴 함
		AbstractCalculator calc2 = new PowerCalculator(30, 3);
		calc2.printResult();
		// 다양한 종류의 계산기를 만들 수 있다!
		
		BetterCalculator calc3 = new ArithmaticCalculator(40, 20);
		calc3.printResult("+");
		calc3.printResult("-");
		calc3.printResult("*");
		calc3.printResult("/");
		calc3.printResult("**");
		
		
	}
	
}
