package practice.inheritence;

/**
 * ✅ GPT 예제
상속 다형성 예제 (오버라이딩 포함)
추상 클래스 / 인터페이스 예제
 */

/**
 * 상속 : 기존 "부모" 클래스를 기반으로 새로운 "자식" 클래스를 만드느 기능
 */
public class Person {
	String name;
	int age;
	
	/**
	 * 아래처럼 부모 클래스에 기본 생성자가 아닌 생성자가 있을 경우, 컴파일러가 기본 생성자 안 만듦
	 * @param name
	 * @param age
	 */
	public Person(String name, int age){ 
		// 매개변수 name, age가 멤버 변수와 이름이 같기 때문에 구분 필요
		// 아래처럼 이름이 겹칠 때만 this로 명확하게 구분
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		//System.out.println("이름 : %s, 나이 : %s".formatted(this.name, this.age));
		System.out.println("이름 : %s, 나이 : %s".formatted(name, age));
	}

}
