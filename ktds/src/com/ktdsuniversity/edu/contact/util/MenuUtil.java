package com.ktdsuniversity.edu.contact.util;

import java.util.List;
import java.util.Scanner;

public class MenuUtil { // 모든 입출력 담당

	public static final Scanner INPUT;
	private static List<Integer> menuList;
	private static List<Integer> phoneList;
	private static List<Integer> emailList;
	private static List<Integer> addressList;
	private static List<Integer> specialDateList;
	private static List<Integer> relationshipList;
	
	static {
		INPUT = new Scanner(System.in);
		menuList = List.of(1, 99); // 불변 리스트 생성
		phoneList = List.of(1, 2, 3, 4, 5, 6, 99); 
		emailList = List.of(1, 2, 99);
		addressList = List.of(1, 2, 99);
		specialDateList = List.of(1, 2, 99);
		relationshipList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
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
	

	public static boolean isValidAddressMenu(int menu) {
		return addressList.contains(menu);
	}
	
	public static boolean isValidSpecialMenu(int menu) {
		return specialDateList.contains(menu);
	}
	
	public static boolean isValidRelationshipMenu(int menu) {
		return relationshipList.contains(menu);
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
	
	public static int printAndSelectAddressMenu() {
		System.out.println("주소 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 집");
		System.out.println("2. 회사");
		System.out.println("99. 기타");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
	}

	public static int printAndSelectSpecialMenu() {
		System.out.println("중요한 날 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 생일");
		System.out.println("2. 기념일");
		System.out.println("99. 기타");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
	}

	public static int printAndSelectRelationshipMenu() {
		System.out.println("관계 종류를 선택하세요.");
		System.out.println("-".repeat(30));
		System.out.println("1. 부모님");
		System.out.println("2. 어머니");
		System.out.println("3. 아버지");
		System.out.println("4. 남자형제");
		System.out.println("5. 여자형제");
		System.out.println("6. 배우자");
		System.out.println("7. 자녀");
		System.out.println("8. 친구");
		System.out.println("9. 친척");
		System.out.println("10. 동거인");
		System.out.println("11. 파트너");
		System.out.println("12. 상사");
		System.out.println("13. 비서");
		System.out.println("14. 추천인");
		System.out.println("-".repeat(30));
		System.out.print("> ");
		return INPUT.nextInt();
	}

	

	
}
