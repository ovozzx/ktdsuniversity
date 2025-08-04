package com.ktdsuniversity.edu.generics;

// R : Return, E : Element
public class GenericsPrinter<R, E> {
	
	public R getMessage(String message, E element) {
		return (R) (message + element); // R 타입으로 캐스팅 필요
	}
	


}
