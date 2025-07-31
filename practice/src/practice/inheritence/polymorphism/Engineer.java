package practice.inheritence.polymorphism;

public class Engineer extends Employee{
	
	String major;
	
	/**
	 * 
	 * @param name
	 * @param age
	 * @param grade
	 * @param major
	 */
	public Engineer(String name, int age, String grade, String major) {
		super(name, age, grade);
		this.major = major;
	}
	
	@Override
	public void work() {
		super.work();
		System.out.println(this.major + " 관련 트러블슈팅을 진행합니다.");
	}

}
