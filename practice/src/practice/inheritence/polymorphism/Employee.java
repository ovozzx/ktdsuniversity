package practice.inheritence.polymorphism;

public class Employee {
	String name;
	int age;
	String grade; // 직급
	
	/**
	 * 
	 * @param name
	 * @param age
	 * @param grade
	 */
	public Employee(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public void work() {
		System.out.println("%s %s (%d)가 일을 합니다."
				.formatted(this.name, this.grade, this.age));
	}
}
