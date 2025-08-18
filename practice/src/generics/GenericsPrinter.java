package generics;

public class GenericsPrinter<R, T> {
	// 반환값 R, 파라미터 : String a, E e
	// 함수명 getMessage
	public R getMessage(String message, T t) {
		return (R) (message + t);
	}

}
