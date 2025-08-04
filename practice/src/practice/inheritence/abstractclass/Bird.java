package practice.inheritence.abstractclass;

// 추상 클래스 내, 추상 메서드(구현이 없는 메서드)의 경우 상속받을 때 반드시 오버라이딩 되어야 함
// 자식 클래스도 추상 클래스면 오버라이딩 안해도 ㄱㅊ
public class Bird extends Animal{

	public Bird(String name){
		super(name);
	}
	
	@Override
	void sound() {
		System.out.println("짹짹");
	}
}
