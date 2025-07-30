package com.ktdsuniversity.edu.coupang;

import java.time.LocalDate;
import java.util.Scanner;


public class Coupang {

	private User loginUser;
	private Scanner consoleInput;
	private User[] coupangUsers;
	private Item[] coupangItems;

	public Coupang() {
		this.consoleInput = new Scanner(System.in);
		this.coupangUsers = new User[3];
		this.coupangUsers[0] = new User("user01", "user01password", "사용자1", LocalDate.parse("2022-01-01"), LocalDate.parse("2022-02-01")); //LocalDate.parse : str를 주면 날짜로 변환
		this.coupangUsers[1] = new User("user02", "user02password", "사용자2", LocalDate.parse("2025-07-01"), LocalDate.parse("2025-08-31")); //LocalDate.parse : str를 주면 날짜로 변환
		this.coupangUsers[2] = new User("user03", "user03password", "사용자3", LocalDate.parse("2025-07-01"), LocalDate.parse("2025-08-31")); //LocalDate.parse : str를 주면 날짜로 변환
		

		this.coupangItems = new Item[5];
		this.coupangItems[0] = new Item(1, "Item1", 10_000, 3000, null, 0, false);
		this.coupangItems[1] = new Item(2, "Item2", 20_000, 3000, "S", 0, true);
		this.coupangItems[2] = new Item(3, "Item3", 30_000, 3000, "C", 0, true);
		this.coupangItems[3] = new Item(4, "Item4", 40_000, 3000, "S", 0, true);
		this.coupangItems[4] = new Item(5, "Item5", 50_000, 3000, "C", 0, true);
	
	}
	
	private int printAndSelectMenu() {
		System.out.println("=".repeat(60));
		if(this.loginUser == null) {
			System.out.println("1. 로그인");
		}
		else {
			System.out.println("1. 로그아웃");
		}
		System.out.println("2. 상품 조회");
		System.out.println("3. 주문");
		System.out.println("99. 종료");
		System.out.println("=".repeat(60));
		System.out.print(">");
		return consoleInput.nextInt();
	}
	
	private void login() {
		System.out.println("로그인을 진행합니다.");
		System.out.print("아이디를 입력하세요.");
		String id = consoleInput.next();
		
		System.out.print("비밀번호를 입력하세요.");
		String pwd = consoleInput.next();
		
		// TO DO coupangUsers에서 id와 pwd가 일치하는 사용자를 찾아서 loginUser에 할당한다
		for(int i = 0 ; i < this.coupangUsers.length ; i++) {
			User eachUser = this.coupangUsers[i];
			if(eachUser.isCorrect(id, pwd)) {
				this.loginUser = eachUser;
				break;
			}
		}
		
		if(this.loginUser == null) {
			System.out.print("아이디 또는 비밀번호를 잘못 입력했습니다.");
		}
		else {
			System.out.print("로그인을 완료했습니다.");
			System.out.print(this.loginUser.getName() + " 님 환영합니다.");
		}
	}
	
	private int printAndSelectQueryMenu() {
		
		System.out.println("=".repeat(60));
		System.out.println("1. 전체 상품 조회");
		System.out.println("2. 상품명 검색");
		System.out.println("99. 검색 취소");
		System.out.println("=".repeat(60));
		System.out.print(">");
		return this.consoleInput.nextInt();
		
	}
	
	private void showAllItems() {
		for(int i = 0 ; i < this.coupangItems.length ; i++) {
			//System.out.println(coupangItems[i]);
			coupangItems[i].printItems(this.loginUser);
		}
	}
	
	private void showSerachItems() {
		System.out.println("상품명을 입력하세요.");
		System.out.print(">");
		String keyword = this.consoleInput.next();
		
		for(int i = 0 ; i < this.coupangItems.length ; i++) {
			if(this.coupangItems[i].getName().contains(keyword)) {
				this.coupangItems[i].printItems(this.loginUser);
			}
		}
		System.out.println("상품 검색이 완료되었습니다.");
		
	}
	
	private void queryItems() {
		if(this.loginUser == null) {
			System.out.println("로그인이 필요합니다!");
		}
		else {
			int queryMenu = this.printAndSelectQueryMenu();
			if(queryMenu == 1) {
				this.showAllItems();
				
			}
			else if(queryMenu == 2) {
				this.showSerachItems();
			}

		}
		
	}
	
	private void orderItem() {
		if(this.loginUser == null) {
			System.out.println("로그인이 필요합니다!");
		}
		else {
			// 상품의 번호를 입력하면, 해당 상품을 주문한다.
			System.out.println("주문하려는 상품의 번호를 입력하세요");
			System.out.print("> ");
			int itemNumber = this.consoleInput.nextInt();
			
			Item orderItem = null;
			for( int i = 0 ; i < this.coupangItems.length ; i++) {
				if (this.coupangItems[i].getNumber() == itemNumber) {
					orderItem = this.coupangItems[i];
					break;
				}
			}
			
			if(orderItem == null) {
				System.out.println("존재하지 않는 상품입니다!");
				return;
			}
			
			// 와우 회원은 모든 상품을 구매할 수 있다.
			// 일반 회원은 로켓 배송 상품을 구매할 수 없다.
			if(!this.loginUser.getIsSubsribe() && orderItem.getIsRocket()) {
				System.out.println("일반 회원은 로켓 상품을 구매할 수 없습니다.");
				return;
			}
			
			int price = orderItem.caculatePrice(this.loginUser);
			
			int shippingFee = orderItem.caculateShippingFee(this.loginUser);
					
			// 배송비 여부. 일반 회원은 배송비도 지불. 와우 회원은 배송비 면제
			Order newOrder = new Order("집", "카드결제", orderItem.getPrice(), // 기존 가격
								price, // 배송비
								shippingFee);
			System.out.println(newOrder);
			System.out.println("주문이 완료되었습니다.");
			System.out.println("배송 완료 예정일");
			// 주문이 완료되면 배송예정 일자.
			// 로켓 상품은 현재일 기준으로 하루 뒤 도착.
			// 일반 상품은 현재일 기준으로 3일 뒤 도착.
			LocalDate deliveryDate = LocalDate.now();
			if(orderItem.getIsRocket()) {
				deliveryDate = deliveryDate.plusDays(1);
			}
			else {
				deliveryDate = deliveryDate.plusDays(3);
			}
			System.out.println(deliveryDate);
			
		}
	
		
	}
	
	
	private void runMenu(int menu) {
		
		if(menu == 1 && this.loginUser == null) {
			this.login();
		}
		else if(menu == 1 && this.loginUser != null) {
			System.out.println( this.loginUser.getName() + " 님, 안녕히 가세요.");
			this.loginUser = null;
		}
		else if(menu == 2) {
			this.queryItems();
		}
		else if(menu == 3) {
			this.orderItem();
		}
		else if(menu == 99) {
			System.out.println("종료합니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
	}
	
	
	private void run() {
		System.out.println("실행 중입니다!");
		while(true){
			int selectMenu = this.printAndSelectMenu();
			
			System.out.println(selectMenu + "를 입력했습니다.");
			
			this.runMenu(selectMenu);
			if(selectMenu == 99) {
				System.out.println("안녕히 가세요.");
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// 내가 내 인스턴스를 만듦
		Coupang coupang = new Coupang();
		coupang.run();
		
	}
	
}
