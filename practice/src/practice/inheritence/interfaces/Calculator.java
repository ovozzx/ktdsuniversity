package practice.inheritence.interfaces;


public interface Calculator {

	// 인터페이스 필드는 상수만 가능 -> public static final 자동 적용
	int ERROR_CODE = -9999;
	double PI = 3.141592;
	
	// 추상 메서드
	int getArea(int length);
}
