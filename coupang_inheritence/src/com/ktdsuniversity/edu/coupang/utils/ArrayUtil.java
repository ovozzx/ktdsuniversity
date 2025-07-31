package com.ktdsuniversity.edu.coupang.utils;

import com.ktdsuniversity.edu.coupang.Item;
import com.ktdsuniversity.edu.coupang.User; // 패키지가 달라 오류나서 import 필요


public class ArrayUtil {
	
public static <T> void add(T[] Array, int index, T value) { // 제네릭 (T) : 레퍼런스의 별칭 (레퍼런스 타입을 모두 T로 퉁침)
		
		if(Array != null && value != null) {
			
			if(index >= 0 && index < Array.length) {
				Array[index] = value;
			}
		}
		
	}
	

//	public static void addUser(User[] userArray, int index, User user) { //
//		
//		if(userArray != null && user != null) {
//			
//			if(index >= 0 && index < userArray.length) {
//				userArray[index] = user;
//			}
//		}
//		
//	}
//	
//	public static void addItem(Item[] itemArray, int index, Item item) {
//		
//		if(itemArray != null && item != null) {
//			
//			if(index >= 0 && index < itemArray.length) {
//				itemArray[index] = item;
//			}
//		}
//		
//	}
//	
}
