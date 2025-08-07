package problem;

public class Manager extends Employee{
	
	int managerPay;

	/**
	 * 
	 * @param name
	 * @param id
	 * @param basicPay
	 * @param com
	 * @param totalPay
	 * @param managerPay
	 */
	public Manager(String name, int id, int basicPay, int com, int totalPay, int managerPay) {
		super(name, id, basicPay, com, totalPay);
		this.managerPay = managerPay;
	}
	
	@Override
	public void calcPay() {
		// TODO Auto-generated method stub
		//super.calcPay();
		this.totalPay = basicPay + com + managerPay;
	}
}
