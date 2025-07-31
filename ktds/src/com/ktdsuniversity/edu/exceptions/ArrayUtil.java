package com.ktdsuniversity.edu.exceptions;

// 유틸리티 클래스 : 메소드만
public class ArrayUtil {
	
	public static void add(int[] array, int index, int value) {
		if(index >= 0 && index < array.length) {
			array[index] = value;
		}
	}

} 