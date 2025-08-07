package problem;

public class Main {

	public static void main(String[] args) {
		
		Employee[] e = new Employee[4];
		e[0] = new Employee("일", 1, 100, 100, 100);
		e[1] = new Manager("이", 2, 200, 200, 200, 200);
		e[2] = new Employee("삼", 3, 300, 300, 300);
		e[3] = new Manager("사", 4, 400, 400, 400, 400);
		
		for(Employee employee : e) {
			employee.calcPay();
			System.out.println("총 급여 : " + employee.totalPay);
		}
	}
}
  