package pjt.expense_tracker;


public class Main {

	public static void main(String[] args) {
		
		ExpenseManager manager = new ExpenseManager();
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		//manager.addExpense(2, "2025-09-11", 4000, "expense", "meal", "");
		manager.printExpense();
		
	}
	
}
