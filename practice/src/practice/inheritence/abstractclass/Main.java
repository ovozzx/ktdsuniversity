package practice.inheritence.abstractclass;

public class Main {
	public static void main(String[] args) {
		
		Animal dog = new Dog("우유");
		Animal bird = new Bird("짹짹이");
		
		dog.move();
		dog.sound();
		
		bird.move();
		bird.sound();
		
	}
}
