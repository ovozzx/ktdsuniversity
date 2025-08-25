package com.ktdsuniversity.edu.generics;

// R : Return, E : Element
public class GenericsPrinter<R, E> {
	
	public R getMessage(String message, E element) {
		return (R) (message + element); // R 타입으로 캐스팅 필요
		// 문자열 + 어떤 객체 -> String 됨 => return 타입 = String ==> R 타입 캐스팅 필요 
		// String -> R 변환은 R이 String이라고 보장할 수 없기 때문에 
		// -> 업캐스팅이 될 수도 있고 안 될 수도 있음 => 자동 변환 불가능 (명시 필요)
	}

}

