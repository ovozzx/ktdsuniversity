────────────────────────────────────────

📌 1. 상수 (final)

────────────────────────────────────────

💡 특징
- 값 변경 불가 (고정)
- 보통 static과 함께 사용 (클래스 전체 공유) -> public static final 자료형 변수명(대문자) = 값;
- 이름은 대문자+언더바 권장

💻 예시
<pre>
class Constants {
    public static final double PI = 3.14159;
}
System.out.println(Constants.PI); // 3.14159
</pre>

---
---

────────────────────────────────────────

📌 2. 클래스 변수 (static)

────────────────────────────────────────

💡 특징
- 모든 인스턴스가 공유
- 객체 생성 없이 클래스명.변수로 접근
- 메모리에 1개만 존재
- 애플리케이션이 종료되어야 메모리에서 지워짐 (다른 메모리 영역) = JVM 실행 중일 때 메모리에 유지

💻 예시
<pre>
class Counter {
    public static int count = 0;
    public Counter() { count++; }
}

new Counter();
System.out.println(Counter.count); // 2
</pre>
---
---


────────────────────────────────────────

📌 3. 인터페이스 (interface)

────────────────────────────────────────

💡 특징
- 메서드 시그니처만 정의 (규격을 정의함)
	- abstract 생략되어 있음 -> 모두 추상 메서드
	
- 다중 구현 가능
- **구현 강제** (오버라이딩 필수)
- 값에 해당하는 상수로도 사용 
- 자바 8 이후 default / static 메서드 가능

💻 예시
<pre>
interface Movable {
    void move(); // abstract 생략
}
class Car implements Movable {
    public void move() { System.out.println("Car is moving"); }
}
Movable m = new Car();
m.move(); // Car is moving
</pre>
---
---


────────────────────────────────────────

📌 4. 추상 클래스 (abstract class)

────────────────────────────────────────

💡 특징
- 구현된 메서드(일반 공통 기능) + 추상 메서드(abstract) 혼합 가능
	- 추상 메서드의 경우 구현 강제 (오버라이딩 필수)
- 단일 상속만 가능
- 공통 기능 제공 + 일부 구현 강제

💻 예시
<pre>
abstract class Animal {
    void eat() { System.out.println("Eating"); }
    abstract void sound(); // 구현 강제되는 추상 메서드
}
class Dog extends Animal {
    void sound() { System.out.println("Woof!"); }
}
Animal a = new Dog();
a.eat();   // Eating
a.sound(); // Woof!
</pre>
---
---


────────────────────────────────────────

📌 5. 열거형 (enum)

────────────────────────────────────────

💡 특징
- 미리 정의된 상수 집합
	- 액션으로서의 상수의 경우 사용
- 타입 안전성 보장
- 필드/메서드도 가질 수 있음

💻 예시
<pre>
enum Direction { NORTH, SOUTH, EAST, WEST }
Direction d = Direction.NORTH;
System.out.println(d); // NORTH
</pre>
---
---



