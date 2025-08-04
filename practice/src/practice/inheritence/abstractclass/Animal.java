package practice.inheritence.abstractclass;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	void move() {
		System.out.println("움직입니다.");
	}
	
	abstract void sound();

}
