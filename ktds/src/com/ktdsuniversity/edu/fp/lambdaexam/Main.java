package com.ktdsuniversity.edu.fp.lambdaexam;

public class Main {
	
	public static void main(String[] args) {
		
		NumberHandling nh = new NumberHandling();
	
		// 0 ~ 10까지 출력
		nh.printHandler(10, 
				(eachNumber) -> { // 인터페이스의 추상 메서드의 동작을 지정!
					System.out.println(eachNumber); // 내생각 : handle 함수 구현
					}); // 반환타입 void이므로 {}, handler 자체다!
		
		// 위 람다식 변형 (함수화)
		nh.printHandler(20, System.out::println); // ctrl 눌러서 into 보기
		
		// 0 보다 큰 수이면 짝수만 출려
		nh.printHandler(1000, 
				(eachNumber) -> { // 인터페이스의 추상 메서드의 동작을 지정!
					if(eachNumber > 0 && eachNumber % 2 == 0) {
						System.out.println(eachNumber);
					}
			
		});
		
		nh.printHandler(1000, NumberHandling::printEvenNumber); // handle(i) 함수가 이걸로 대체 
		// ⚠ static이어야 함
	
		// 2보다 큰 수이면서, 소수 (prime number)만 출력
		nh.printHandler(1000, 
				(eachNumner) -> {
					if(eachNumner > 2) {
						
						for(int i = 2 ; i < eachNumner; i++) {
							if(eachNumner % i == 0) {
								return;
							}
						}
					
						System.out.println("소수 : " + eachNumner);
						
					}
				});
		
	
	
	// 반복할 때마다, 자신의 수 아래의 모든 수를 출력한다
	// i == 0 > 출력없음
	// i == 1 > 0
	// i == 4 > 3 2 1 0
		nh.printHandler(20, (eachNumner) -> { // 반복문 이걸로 (i 값을 받음 = eachNumner)
					
				System.out.println("=".repeat(10));
				System.out.println("값 > " + eachNumner);
				for( int i = eachNumner - 1  ; i >= 0 ; i--) {	
					
					System.out.println(i);
				}
			
			
		});
		
		
		// 모든 숫자를 5의 배수로 만들어서 출력
		nh.printHandler(33, (eachNumber) -> {
			System.out.println("=".repeat(10));
			System.out.println("값 > " + eachNumber);
			if(eachNumber == 0) {
				System.out.println("5의 배수 변환 : " + (eachNumber + 5));
			}
			else {				
				System.out.println("5의 배수 변환 : " + eachNumber * 5);
			}
		});
		
		
		nh.print(5, (eachNumber) -> true);
		
		// 숫자가 홀수인것만 출력
		nh.print(30, (eachNumber) -> eachNumber % 2 != 0); // return 값 줘야 함
		nh.print(30, (eachNumber) -> eachNumber % 2 == 1); // return 값 줘야 함
		
	}	
}
