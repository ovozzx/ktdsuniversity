package generics;

// public class GenericPrintMessage<T> { // 클래스 레벨에서 제네릭 정의
 public class GenericPrintMessage{ 


	// 함수명 print
	// 반환값 없음
	// 파라미터 제네릭
	// 구현 : 파라미터 출력
	
	public <T> void print(T message) {
		System.out.println(message);
	}
}
