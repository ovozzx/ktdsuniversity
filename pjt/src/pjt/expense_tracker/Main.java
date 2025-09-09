package pjt.expense_tracker;


public class Main {

	public static void main(String[] args) {
		
		ExpenseManager manager = new ExpenseManager();
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		manager.addExpense(1, "2025-09-09", 1000, "expense", "cafe", "");
	}
	
}
