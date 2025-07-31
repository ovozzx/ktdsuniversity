package com.ktdsuniversity.edu.exceptions;

import java.io.Console;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecptionTest_ {
	
	public static void main(String[] args) {
		
		int number = NumberUtil.parseInt("9999999999999999999999999999999999999999999999999999999");
		System.out.println(number); // 0으로 나옴
		
		number = NumberUtil.parseInt(null);
		System.out.println(number);
		
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("회원 가입 프로세스");
		System.out.println("나이를 입력하세요.");
		System.out.print("> ");
		int age = 0;

		while(true) {
			try {
				age = consoleInput.nextInt();
				break;
			}
			catch (InputMismatchException ime)
			{
			 System.out.println("> ");	
			 consoleInput.nextLine(); // \n 제거
			}
		}
		System.out.println(age);
		
		// 통장 개설 적정 연령대 : 10 ~ 100
		if(age >= 10 && age <= 100) {
			System.out.println("통장을 개설하겠습니다.");
		}
		else {
			throw new RuntimeException("올바른 나이를 다시 입력해주세요, 적정 연령대는 10 ~ 100세 입니다."); // 에러는 내보자
			// 내가 원하는 값이 아니라면 예외를 던져서 -> 다시 입력하게끔..
		}
//		while(true) {
//			System.out.println("숫자를 입력하세요.");
//			try {				
//				number = consoleInput.nextInt(); // InputMismatchException
//				System.out.println(number);
//			}
//			catch(InputMismatchException ime){
//				System.out.println("숫자를 입력하세요.");
//				consoleInput.nextLine(); // \n 제거용
//			}
//		}
//	
	
		// if로 예외 처리가 불가능한 것
//		Integer.parseInt("99999999999999999999999");
//		Long.parseLong("99999999999999999999999");
		
		/*
		String numberString = "2908129999999999999999999";
		long longNumber = 0;
		try {
			longNumber = Long.parseLong(numberString); // NumberFormatException
			System.out.println("변환이 완료되었습니다!");
			System.out.println("변환 결과 : " + longNumber);
		}
		catch(NumberFormatException nfe) {
			System.out.println("숫자 형태가 아닌 문자이거나, 너무 큰 숫자입니다.");
		}
		
		Scanner consoleInput = new Scanner(System.in);
		//Scanner.consoleInput = new Scanner(System.in);
		//int number__ = consoleInput.nextInt();
		
		// if로 예외 처리가 불가능한 것
		int number__ = 0;
		
		try { 
			// 예외가 발생할 예정이거나, 예외가 발생할 가능성이 높은 코드 작성
			// consoleInput.nextInt() <-- InputMismatchException이 발생할 가능성이 존재
			number__ = consoleInput.nextInt(); // 예외 발생 작시, try 내부 코드는 즉시 종료됨
		}
		catch(InputMismatchException ime) {
			// try 내부에서 InputMismatchException이 발생했다면
			// 이 영역에서 처리한다
			// JVM은 APP을 종료시키지 않는다.
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println(number__);
		
//		String numberString = "128.ads";
		
		//String numberString = "1280000000000000000"; // 엄청 큰 값이면 에러나긴 함
		//int number = NumberUtil.parseInt(numberString);
		long number = NumberUtil.parseLong(numberString);
		System.out.println(number);
		
		numberString = "128.000000001"; // 엄청 큰 값이면 에러나긴 함
		//int number = NumberUtil.parseInt(numberString);
		double numberd = NumberUtil.parseDouble(numberString);
		System.out.println(numberd);
		
		numberString = "128.000000001"; // 엄청 큰 값이면 에러나긴 함
		//int number = NumberUtil.parseInt(numberString);
		float numberf = NumberUtil.parseFloat(numberString);
		System.out.println(numberf);
		
		numberString = "1280000000";
		number = 0; 
		if(numberString.matches("^[0-9]+$")) { // 숫자로만 이루어져 있는가
			number = Integer.parseInt(numberString);
		}
		System.out.println(number);
		
		//long longNumber = 0;
		if(numberString.matches("^[0-9]+$")) {
			longNumber = Long.parseLong(numberString);

		}
		System.out.println(longNumber);
//		String name = null;
//		
//		if(name != null && name.length() >= 10) { // A 조건 && B 조건 => 빠른 연산 : A 조건 충족할 경우, B 조건 안보기 때문에 => 해당 코드 에러 안 남 
//			System.out.println(name.length());
//		}
		
//		String numberString = "10.5"; // 더블로 바꿔주기
//		double number = Double.parseDouble(numberString);
//		System.out.println(number);
//	
		numberString = "10d"; // 더블로 바꿔주기,d 붙이면 바뀜
		double number_ = Double.parseDouble(numberString);
		System.out.println(number_);
//
//		numberString = "0000010";
//		number = Integer.parseInt(numberString);
//		System.out.println(number);
//		
//		numberString = "3000000000"; // int의 범위를 넘어서 에러
//		number = Integer.parseInt(numberString);
//		System.out.println(number);
//		
//		numberString = "300_00"; // _ 안됨
//		number = Integer.parseInt(numberString);
//		System.out.println(number);
		
//		String numberString = "10";
//		int number = Integer.parseInt(numberString);
//		System.out.println(number);
//		
//		String numberString_ = "열";
//		number = Integer.parseInt(numberString_);
//		System.out.println(number);
				
		int[] numbers = new int[3];
		// 접근 인덱스 >= 0 && 접근 인덱스 < 배열의 길이
		
		ArrayUtil.add(numbers, 0, 10);
		ArrayUtil.add(numbers, 1, 20);
		ArrayUtil.add(numbers, 2, 30);
		ArrayUtil.add(numbers, 3, 40);
		System.out.println(Arrays.toString(numbers));
//		if (0 >= 0 && 0 < numbers.length) {
//			numbers[0] = 1;
//		}
//		if (1 >= 0 && 1 < numbers.length) {
//			numbers[1] = 2;
//		}
//		if (2 >= 0 && 2 < numbers.length) {
//			numbers[2] = 3;
//		}
//
//		numbers[-1] = 4; // ArrayIndexOutOfBoundsException
//		numbers[3] = 4; // ArrayIndexOutOfBoundsException
//		System.out.println(Arrays.toString(numbers));
		
//		String name = null;
//		System.out.println(name.length());
		
//		Scanner consoleInput = new Scanner(System.in);
//		while(true) {
//			System.out.println("숫자를 입력하세요.");
//			int number = consoleInput.nextInt();
//			System.out.println(number);
//			
//		}
///
 */
		
	}

}

