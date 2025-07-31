package com.ktdsuniversity.edu.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public boolean createAccount() {
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("회원 가입 프로세스");
		System.out.println("나이를 입력하세요.");
		System.out.print("> ");
		int age = 0;
		while (true) {
			try {
				age = consoleInput.nextInt();
				break;
			}
			catch(InputMismatchException ime) {
				System.out.print("> ");
				consoleInput.nextLine(); // \n 제거
			}
		}
		System.out.println(age);
		// 통장 개설 적정 연령대 :10 ~ 100
		if (age >= 10 && age <= 100) {
			return true;
		}
		else {
			throw new InvalidAgeException("올바른 나이를 다시 입력해주세요. 적정 연령대는 10 ~ 100세 입니다.");
		}
	}
	
	public void run() {
		while(true) {
			boolean isCreated = false;
			try {
				isCreated = this.createAccount();
			}
			catch(InvalidAgeException iae) {
				System.out.println(iae.getMessage());
			}
			if (isCreated) {
				System.out.println("통장을 개설하겠습니다.");
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		ExceptionTest test = new ExceptionTest();
		test.run();
		
//		int number = NumberUtil.parseInt(null);
//		System.out.println(number);
		
		// if로 예외 처리가 불가능한 것.
//		Integer.parseInt("999999999999999999999999999999999999999999999");
//		Long.parseLong("999999999999999999999999999999999999999999999");
		
//		String numberString = "2908123";
//		long longNumber = 0;
//		try {
//			longNumber = Long.parseLong(numberString); // NumberFormatException
//			System.out.println("변환이 완료되었습니다!");
//			System.out.println("변환 결과: " + longNumber);
//		}
//		catch(NumberFormatException nfe) {
//			System.out.println("숫자 형태가 아닌 문자이거나, 너무 큰 숫자입니다.");
//		}
//		System.out.println(longNumber);
//		
//		
//		Scanner consoleInput = new Scanner(System.in);
////		int number = consoleInput.nextInt();
//		int number = 0;
//		try {
//			// 예외가 발생할 예정이거나, 예외가 발생할 가능성이 높은 코드 작성
//			// consoleInput.nextInt() <-- InputMismatchException 이 발생할 가능성이 존재.
//			number = consoleInput.nextInt();
//		}
//		catch(InputMismatchException ime) {
//			// try 내부에서 InputMismatchException 이 발생했다면
//			// 이 영역에서 처리한다
//			// JVM은 App을 종료시키지 않는다.
//			System.out.println("예외가 발생했습니다.");
//		}
//		
//		System.out.println(number);
		
		
//		String numberString = "128.123456789012345678f";
//		int number = NumberUtil.parseInt(numberString);
//		System.out.println(number);
//		
//		long longNumber = NumberUtil.parseLong(numberString);
//		System.out.println(longNumber);
//		
//		double doubleNumber = NumberUtil.parseDouble(numberString);
//		System.out.println(doubleNumber);
//		
//		float floatNumber = NumberUtil.parseFloat(numberString);
//		System.out.println(floatNumber);
		
//		int[] numbers = new int[3]; // 0, 1, 2
//		// 접근 인덱스 >= 0 && 접근 인덱스 < 배열의 길이
//		ArrayUtil.add(numbers, 0, 10);
//		ArrayUtil.add(numbers, 1, 20);
//		ArrayUtil.add(numbers, 2, 30);
//		ArrayUtil.add(numbers, -1, 40);
//		ArrayUtil.add(numbers, 3, 50);
		
//		if (0 >= 0 && 0 < numbers.length) {
//			numbers[0] = 10;
//		}
//		if (1 >= 0 && 1 < numbers.length) {
//			numbers[1] = 20;
//		}
//		if (2 >= 0 && 2 < numbers.length) {
//			numbers[2] = 30;
//		}
//		if (-1 >= 0 && -1 < numbers.length) {
//			numbers[-1] = 40; // ArrayIndexOutOfBoundsException
//		}
//		if (3 >= 0 && 3 < numbers.length) {
//			numbers[3] = 40; // ArrayIndexOutOfBoundsException
//		}
//		System.out.println( Arrays.toString(numbers) );
		
//		String name = null;
//		if (name != null && name.contains("s")) {
//			System.out.println(name.length());
//		}
		
		/*
		 * CONSOLE
		 * 
		 *  > a\n
		 *  > \n
		 * 
		 */
		
//		Scanner consoleInput = new Scanner(System.in);
//		while (true) {
//			System.out.println("숫자를 입력하세요.");
//			try {
//				int number = consoleInput.nextInt(); // InputMismatchException
//				System.out.println(number);
//			}
//			catch(InputMismatchException ime) {
//				System.out.println("숫자만 입력하세요.");
//				consoleInput.nextLine(); // \n 제거
//			}
//		}
		
	}
	
}