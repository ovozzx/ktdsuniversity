package practice.inheritence.interfaces;

//Animal 인터페이스 구현 
//Animal 내, 모든 메서드 오버라이딩(함수 내용 재정의) 필요
public class Dog implements Animal{

	public void sound() {
		System.out.println("멍멍!");
	}
	
	public void move() {
		System.out.println("강아지가 네발로 달립니다.");
	}
	
}
