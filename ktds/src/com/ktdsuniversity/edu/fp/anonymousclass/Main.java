package com.ktdsuniversity.edu.fp.anonymousclass;

public class Main {
	
	public static class SubMain{
		
	}

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(10, 20);
		Computable addComputer = new AddComputer();
		int result = calculator.calc(addComputer);
		System.out.println(result);
		
		//Computable subComputer = new Computable(); // 인터페이스라서 인스턴스(객체)화 할 수 없음
		Computable subComputer = new Computable() { 
			// 익명클래스를 이용하면 인스턴스도 클래스 만들 수 있음 (오버라이딩 필요)
			@Override
			public int calc(int numberOne, int numberTwo) {
				return numberOne - numberTwo;
			}
		};
		
		System.out.println("=".repeat(30));
//		System.out.println(addComputer);
//		System.out.println(subComputer); 
		// $ : 클래스 내부의 클래스 -> Main$SubMain (중첩 클래스)
		// 익명 클래스는 이름이 존재하지 않으므로 숫자로 표기 -> Main$1 (첫번째) 
				
//		SubMain subMain = new SubMain();
//		System.out.println(subMain);
		
		
		Computable mulComputer = new Computable() { 
			// 익명클래스를 이용하면 인스턴스도 클래스 만들 수 있음 (오버라이딩 필요)
			@Override
			public int calc(int numberOne, int numberTwo) {
				return numberOne * numberTwo;
			}
		};
		//System.out.println(mulComputer); // Main$2
		
		int subResult = calculator.calc(subComputer);
		System.out.println(subResult);
		int mulResult = calculator.calc(mulComputer);
		System.out.println(mulResult);
		
		Computable subFunction = (int numberOne, int numeberTwo) -> numberOne + numeberTwo; // 함수를 변수에 할당
		// 람다란? (= 함수)
		// => 익명 클래스 단순화
		// => 객체는 아님, 함수임
		//System.out.println("subFunction > " + subFunction);
		
		subResult = calculator.calc(subFunction);
		System.out.println(subResult);
		
		/**
		 * 람다 실습
		 */
		
		// 1. 파라미터 하나와 반환 값 있는 함수
		Computable fn1 = (int n1, int n2) -> n1 + n2; 
		int fn1result = fn1.calc(1, 2);
		System.out.println(fn1result);
	
		// 2. 파라미터 하나와 반환 값이 없는 함수 (= {} 있음)
		VoidInterface fn2 = (String msg) -> {
			System.out.println("Hello, " + msg); // printMessage(String msg)에 대한 함수
		};
		fn2.printMessage("소영");
		
		// 3. 파마리터가 없고 반환 값도 없는 함수
		NoparanNoReturnInterface fn3 = () -> {
			System.out.println("출력!"); // print()에 대한 함수
		};
		fn3.print(); 
		
		// 4. 파라미터가 두 개고 반환 값도 있고, 함수가 여러 라인으로 구성된 경우 ({} 필요)
		Computable fn4 = (int n1, int n2) -> {
			int rst = n1 + n2;
			System.out.println(rst);
			return rst;
		};
		
		int fn4Result = fn4.calc(50, 60);
		System.out.println(fn4Result);
		
		
	}
	
}
