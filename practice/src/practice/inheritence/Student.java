package practice.inheritence;

public class Student extends Person{
	String studentId;
	
	Student(String name, int age, String studenId){
		super(name, age); // 부모 클래스 생성자 호출
		this.studentId = studenId;
	}
	
	@Override // 실제 코드 동작에 영향을 주지는 않지만, 컴파일러에게 알려주는 표시
	// 매개변수 동일, 메소드 내용이 다름
	void introduce() { // 동일 클래스 내에서는 중복 정의 불가
		super.introduce(); // 부모의 introduce 호출 => 없어도 됨
		System.out.println("학생 번호 : " + studentId);
	}
	

}
                                                       