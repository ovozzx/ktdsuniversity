package problem;

public class Employee {
	
	String name;
	int id;
	int basicPay;
	int com;
	int totalPay;
	
	/**
	 * 
	 * @param name
	 * @param id
	 * @param basicPay
	 * @param com
	 * @param totalPay
	 */
	public Employee(String name, int id, int basicPay, int com, int totalPay) {
		this.name = name;
		this.id = id;
		this.basicPay = basicPay;
		this.com = com;
		this.totalPay = totalPay;
	}
	
	public void calcPay() {
		totalPay = basicPay + com;
	}
 
}
