package practice.inheritence.polymorphism;

/*
 *
 * Employee : name, work 
 * Manager, Engineer... 
 */
public class Main {

	public static void main(String[] args) {
		
		// 다형성
		Employee[] employees = new Employee[3];
		// 부모 타입으로 자식 객체를 참조 (업캐스팅)
		employees[0] = new Manager("홍길동", 40, "부장", true);
		employees[1] = new Engineer("김철수", 30, "대리", "컴퓨터");
		employees[2] = new Intern("이영희", 24, "인턴", false);
		
		for(Employee employee : employees) { // 다형성: 같은 메서드 호출 → 다른 동작
		// 다형성이 아닌, 각 자식 클래스 타입이면 위 for문처럼 일반화해서 사용하기 어려움 (다형성 => 일반화 관리 가능_
			employee.work(); // 각 자식 클래스(인스턴스)에서 오버라이딩한 메서드 호출 (동적 바인딩)
			System.out.println("-----------");
		}
	}
	
}
