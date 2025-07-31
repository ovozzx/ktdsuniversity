package com.ktdsuniversity.edu.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class ExecptionTest {
	
	public static void main(String[] args) {
		
//		String numberString = "128.ads";
		
		String numberString = "1280000000000000000"; // 엄청 큰 값이면 에러나긴 함
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
		
		long longNumber = 0;
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
		
	}

}

