package com.ktdsuniversity.edu.phonebook.util;

import java.util.List;
import java.util.Scanner;

public class MenuUtil { // 모든 입출력 담당

	public static final Scanner INPUT;
	private static List<Integer> menuList;
	private static List<Integer> phoneList;
	private static List<Integer> emailList;
	private static List<Integer> bellList;
	private static List<Integer> pronounList;
	private static List<Integer> urlList;
	private static List<Integer> addressList;
	
	static {
		INPUT = new Scanner(System.in);
		menuList = List.of(1, 99); // 불변 리스트 생성
		phoneList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 99); 
		emailList = List.of(1, 2, 3, 4, 99); 
		bellList = List.of(1, 2, 3);
		pronounList = List.of(1, 2, 3);
		urlList = List.of(1, 2, 3, 4, 99);
		addressList = List.of(1, 2, 3, 99);
	}
	
	public static boolean isValidMenu(int selectMenu) {
		return menuList.contains(selectMenu);
	}
	
	public static boolean isValidPhoneMenu(int selectMenu) {
		return phoneList.contains(selectMenu);
	}
	
	public static boolean isValidEmailMenu(int selectMenu) {
		return emailList.contains(selectMenu);
	}
	
	public static boolean isValidBellMenu(int selectMenu) {
		return bellList.contains(selectMenu);
	}
	
	public static boolean isValidPronounMenu(int selectMenu) {
		return pronounList.contains(selectMenu);
	}
	
	public static boolean isValidUrlMenu(int selectMenu) {
		return urlList.contains(selectMenu);
	}
	
	public static boolean isValidAddressMenu(int selectMenu) {
		return addressList.contains(selectMenu);
	}
	
	public static boolean isQuitApp(int selectMenu) {
		return selectMenu == 99;
	}
	
	public static boolean addContact(int selectMenu) {
		return selectMenu == 1;
	}
	
	public static int printAndSelectContactAppMenu() {
		
		System.out.println("연락처 App");
		System.out.println("-".repeat(30));
		System.out.println("1. 연락처 추가");
		System.out.println("99. 종료");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		
		return INPUT.nextInt();
	}

	public static int printAndSelectPhoneMenu() {
		
		System.out.println("연락처 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 휴대전화");
		System.out.println("2. 회사");
		System.out.println("3. 집");
		System.out.println("4. 회사 팩스");
		System.out.println("5. 집 팩스");
		System.out.println("6. 호출기");
		System.out.println("99. 기타");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
		
	}

	public static int printAndSelectEmailMenu() {
		
		System.out.println("이메일 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 개인");
		System.out.println("2. 회사");
		System.out.println("99. 기타");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
	}
	
	public static int printAndSelectBellMenu() {
		
		System.out.println("벨소리 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 반향");
		System.out.println("2. 걸음");
		System.out.println("3. 골짜기");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
	}
	
	public static int printAndSelectPronounMenu() {
		
		System.out.println("대명사 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 한국어");
		System.out.println("2. 영어");
		System.out.println("3. 중국어");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
	}
	
	public static int printAndSelectUrlMenu() {
		
		System.out.println("대명사 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 홈페이지");
		System.out.println("2. 집");
		System.out.println("3. 회사");
		System.out.println("4. 학교");
		System.out.println("99. 기타");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
	}
	
	public static int printAndSelectAddressMenu() {
		
		System.out.println("주소 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 집");
		System.out.println("2. 회사");
		System.out.println("3. 학교");
		System.out.println("99. 기타");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
	}
	
	
	
}
