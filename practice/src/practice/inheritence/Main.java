package practice.inheritence;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("홍길동", 20);
		person.introduce();
		
		Student student = new Student("이소영", 30, "11");
		student.introduce();
		
	}
}
