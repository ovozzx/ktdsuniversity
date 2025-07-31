package practice.inheritence.polymorphism;

public class Manager extends Employee{

	boolean isOutside; // 외근 여부 
	
	/**
	 * 
	 * @param name
	 * @param age
	 * @param grade
	 * @param isOutside
	 */
	public Manager(String name, int age, String grade, boolean isOutside) {
		super(name, age, grade);
		this.isOutside = isOutside;
	}
	
	@Override
	public void work() {
		super.work();
		if(this.isOutside) {
			System.out.println("외근 중입니다.");
		}
		else {
			System.out.println("사무실에 있습니다..");
		}
	}
}
