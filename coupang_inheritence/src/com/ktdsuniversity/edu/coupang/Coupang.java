package com.ktdsuniversity.edu.coupang;

import java.time.LocalDate;
import java.util.Scanner;

public class Coupang {

	private Scanner consoleInput;
	private User[] coupangUsers;
	private Item[] coupangItems;
	
	private User loginUser;
	
	public Coupang() {
		this.consoleInput = new Scanner(System.in);
		
		this.coupangUsers = new User[3];
		this.coupangUsers[0] = new User("user01", "user01password", "사용자1");
		this.coupangUsers[1] = new WowUser("user02", "user02password", "사용자2", 
									LocalDate.parse("2025-07-01"), 
									LocalDate.parse("2025-08-31"));
		this.coupangUsers[2] = new WowUser("user03", "user03password", "사용자3", 
									LocalDate.parse("2025-07-01"), 
									LocalDate.parse("2025-08-31"));
		// 내 생각 : Item, WowItem, DawnItem 배열을 각각 만드는 것이 아니라, Item 배열에 종류별 상속 클래스 인스턴스를 넣어줌 => 다형성?
		// User에 User, WowUser를 넣음 -> 생성자 사용 -> 자식(WowUser)에 없으면 부모 거(User) 사용
		// 인스턴스의 타입과 실제로 들어가는 값이 다를 수 있다. (어떤 값이 들어가는지는 디버깅해서 봐야 앎)
		this.coupangItems = new Item[10];
		this.coupangItems[0] = new Item(1, "Item1", 10_000, 3000);
		this.coupangItems[1] = new Item(2, "Item2", 20_000, 3000);
		this.coupangItems[2] = new Item(3, "Item3", 30_000, 3000);
		this.coupangItems[3] = new WowItem(4, "Item4", 40_000, 3000, "S", 0, true); // Item이 WowItem의 멤버변수에 값을 채워주는 역할 (new WowItem)
		this.coupangItems[4] = new WowItem(5, "Item5", 50_000, 3000, "C", 3.5, true);
		this.coupangItems[5] = new WowItem(6, "Item10", 50_000, 3000, "C", 3.5, true);
		this.coupangItems[6] = new DawnItem(7, "Item6", 50_000, 3000, "C", 3.5, true, true); // this는 DawnItem
		this.coupangItems[7] = new DawnItem(8, "Item7", 50_000, 3000, "C", 3.5, true, true);
		this.coupangItems[8] = new DawnItem(9, "Item8", 50_000, 3000, "C", 3.5, true, true);
		this.coupangItems[9] = new DawnItem(10, "Item9", 50_000, 3000, "C", 3.5, true, true);
	}
	
	private int printAndSelectMenu() {
		System.out.println("=".repeat(30));
		if (this.loginUser == null) {
			System.out.println("1. 로그인");
		}
		else {
			System.out.println("1. 로그아웃");
		}
		System.out.println("2. 상품 조회");
		System.out.println("3. 주문");
		System.out.println("99. 종료");
		System.out.println("=".repeat(30));
		System.out.print("> ");
		return consoleInput.nextInt();
	}
	
	private void login() {
		System.out.println("로그인을 진행합니다.");
		System.out.print("아이디를 입력하세요.");
		String id = consoleInput.next();
		
		System.out.print("비밀번호를 입력하세요.");
		String pwd = consoleInput.next();
		
		// coupangUsers 에서 id와 pwd가 일치하는 사용자를 찾아서 loginUser에 할당한다.
		for (int i = 0; i < this.coupangUsers.length; i++) {
			User eachUser = this.coupangUsers[i];
			if ( eachUser.isCorrect(id, pwd) ) { // WowUser에 isCorrect가 없기 때문에 User의 isCorrect을 사용 ⚠but 여기서 this는 WowUser
				this.loginUser = eachUser;
				break;
			}
		}
		
		if (this.loginUser == null) {
			System.out.println("아이디 또는 비밀번호를 잘못 입력했습니다.");
		}
		else {
			System.out.println("로그인을 완료했습니다.");
			System.out.println(this.loginUser.getName() + "님, 환영합니다.");
		}
	}
	
	private int printAndSelectQueryMenu() {
		System.out.println("=".repeat(30));
		System.out.println("1. 전체 상품 조회");
		System.out.println("2. 상품명 검색");
		System.out.println("99. 검색 취소");
		System.out.println("=".repeat(30));
		System.out.print("> ");
		
		return this.consoleInput.nextInt();
	}
	
	private void showAllItems() {
		for (int i = 0; i < this.coupangItems.length; i++) {
			this.coupangItems[i].printItem(this.loginUser); 
			// 인스턴스에 따라감 : Item은 Item의 printItem 사용, WowItem은 WowItem의 printItem 사용
			// 파라미터 봐야 함 -> 파리미터에 따라 사용되는 게 달라짐
		}
	}
	
	private void showSearchItems() {
		System.out.println("상품명을 입력하세요.");
		System.out.print("> ");
		String keyword = this.consoleInput.next();
		
		for (int i = 0; i < this.coupangItems.length; i++) {
			if ( this.coupangItems[i].getName().contains(keyword) ) {
				this.coupangItems[i].printItem(this.loginUser);
			}
		}
		System.out.println("상품 검색이 완료되었습니다.");
	}
	
	private void queryItems() {
		if (this.loginUser == null) {
			System.out.println("로그인이 필요합니다!");
		}
		else {
			int queryMenu = this.printAndSelectQueryMenu();
			if (queryMenu == 1) {
				this.showAllItems();
			}
			else if (queryMenu == 2) {
				this.showSearchItems();
			}
		}
	}
	
	private void orderItem() {
		if (this.loginUser == null) {
			System.out.println("로그인이 필요합니다!");
		}
		else {
			// 상품의 번호를 입력하면, 해당 상품을 주문한다.
			System.out.println("주문하려는 상품의 번호를 입력하세요.");
			System.out.print("> ");
			int itemNumber = this.consoleInput.nextInt();
			
			Item orderItem = null;
			for (int i = 0; i < this.coupangItems.length; i++) {
				if (this.coupangItems[i].getNumber() == itemNumber) { // DawnItem의 경우 getNumber가 없어서 Item으로 감
					orderItem = this.coupangItems[i];
					break;
				}
			}
			
			if ( orderItem == null ) {
				System.out.println("존재하지 않는 상품입니다!");
				return;
			}
			
			// 와우회원은 모든 상품을 구매할 수 있다.
			// 일반회원은 로켓 배송 상품을 구매할 수 없다.
			if ( !orderItem.canBuy(this.loginUser) ) {
				System.out.println("일반 회원은 로켓 상품을 구매할 수 없습니다.");
				return;
			}
			
			int price = orderItem.calculatePrice(this.loginUser);
			int shippingFee = orderItem.calculateShippingFee(this.loginUser);
			
			// 배송비 여부. 일반회원은 배송비도 지불. 와우회원은 배송비 면제.
			Order newOrder = new Order(
						"집",
						"카드결제",
						orderItem.getPrice(), // 기존 가격
						price, // 할인된 가격
						shippingFee, // 배송비
						orderItem
					);
			System.out.println(newOrder);
			System.out.println("주문이 완료되었습니다.");
			System.out.println("배송 완료 예정일");
			System.out.println(newOrder.getDeliveryDate());
		}
	}
	
	private void runMenu(int menu) {
		if (menu == 1 && this.loginUser == null) {
			this.login();
		}
		else if (menu == 1 && this.loginUser != null) {
			System.out.println(this.loginUser.getName() + "님, 안녕히 가세요.");
			this.loginUser = null;
		}
		else if (menu == 2) {
			this.queryItems();
		}
		else if (menu == 3) {
			this.orderItem();
		}
		else if (menu == 99) {
			System.out.println("종료합니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	private void run() {
		while (true) {
			int selectedMenu = this.printAndSelectMenu();
			System.out.println(selectedMenu + "를 입력했습니다.");
			
			this.runMenu(selectedMenu);
			if (selectedMenu == 99) {
				System.out.println("안녕히 가세요.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Coupang coupang = new Coupang();
		coupang.run();
	}
	
}







