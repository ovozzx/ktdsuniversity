package practice.inheritence.interfaces;

// Animal 인터페이스 구현 
// Animal 내, 모든 메서드 오버라이딩(함수 내용 재정의) 필요
public class Bird implements Animal{

	public void sound() {
		System.out.println("짹짹");
	}
	
	public void move() {
		System.out.println("새가 훨훨 날아갑니다.");
	}
}
