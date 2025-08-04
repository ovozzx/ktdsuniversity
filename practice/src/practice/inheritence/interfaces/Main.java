package practice.inheritence.interfaces;

public class Main {

	public static void main(String[] args) {
		
		// (1) 동물 예제
		// 다형성 가능 
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		dog.sound();
		dog.move();
		
		bird.sound();
		bird.move();
		
		// (2) 넓이 계산 예제
		Calculator circle = new Circle(); // 인스턴스의 메서드가 실행된다
		Calculator square = new Square();
		
		System.out.println(circle.getArea(10));
		System.out.println(square.getArea(10));
		
	}
}
