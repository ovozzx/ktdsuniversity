package pjt.expense_tracker;

import java.util.Scanner;

public class Main {

	public Main() {

	}
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		ExpenseManager manager = new ExpenseManager();
		
		while(true) {
			
			System.out.print("기능을 입력하세요 (추가/조회) > ");
			
			String input = sc.next();
			
			if(input.equals("추가")) {
				System.out.println("추가" + "=".repeat(100));
				System.out.print("ID 정보를 입력하세요 > ");
				int id = sc.nextInt();
				System.out.print("거래 일자를 입력하세요 (yyyy-mm-dd) > ");
				String datetime = sc.next();
				System.out.print("금액을 입력하세요. > ");
				int amount = sc.nextInt();
				System.out.print("구분을 입력하세요 (지출/수입) > ");
				String type = sc.next();
				System.out.print("카테고리를 입력하세요 > ");
				String category = sc.next();
				System.out.print("메모를 입력하세요 > ");
				String memo = sc.next();
				manager.addExpense(id, datetime, amount, type, category, memo);
				
			}
			else if(input.equals("조회")) {
				manager.printExpense();
			}


			//manager.addExpense(2, "2025-09-11", 4000, "expense", "meal", "");
		
			
		}
	}
	
	public static void main(String[] args) {
		
		new Main().run();
		
	}
	
}
