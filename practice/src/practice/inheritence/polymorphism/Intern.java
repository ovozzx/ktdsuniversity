package practice.inheritence.polymorphism;

public class Intern extends Employee{
	boolean isFullTime;
	
	/**
	 * 
	 * @param name
	 * @param age
	 * @param grade
	 * @param isFullTime
	 */
	public Intern(String name, int age, String grade, boolean isFullTime) {
		super(name, age, grade);
		this.isFullTime = isFullTime;
	}
	
	@Override
	public void work() {
		super.work();
		if(isFullTime) {
			System.out.println("정규직 전환자 입니다.");
		}
		else {
			System.out.println("정규직 비전환자 입니다.");
		}
	}
	
}
