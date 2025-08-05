package com.ktdsuniversity.edu.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); // 제네릭 => Integer
		// 생성자에 있는 제네릭은 생략 가능
		
		// list에 값을 추가한다.
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(50);
		System.out.println(list);
		System.out.println(list.size());
		
		int value = list.get(0);
		System.out.println(value);

		value = list.get(1);
		System.out.println(value);

		value = list.get(2);
		System.out.println(value);
		
		try {			
			value = list.get(4); // IndexOutOfBoundsException
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("over index bound");
		}
		
		for(int i = 0 ; i < list.size() ; i++) {
			int eachValue = list.get(i);
			System.out.println(eachValue);
		}
		
		for(int eachValue : list) { // List는 iterable이 구현된 클래스이기 때문에 이렇게 for문 사용 가능
			System.out.println("for each > " + eachValue);
		}
		
		// 		  0   1   2
		// list [30, 40, 50]
		// 1번 인덱스 제거.
		// 			 0   1
		// ==> list [30, 50]
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.remove(0)); // 반환값 : 지운 값
		
		// List 복사
		// getter, setter 사용에서 메모리 관계 끊어줘야 함 (참조 잘못 일어날 수 있음)
		// 복사하려는 제네릭 = 복다 대상 제네릭
		List<Integer> copyList = new ArrayList<Integer>();
		
		// List 복사 (addAll)
		copyList.addAll(list); // 메모리 끊어서 받기 (이렇게 하면 메모리 역참조에 대한 문제 발생하지 않음)
		list.add(60);
		System.out.println(list); // 40,50,60
		System.out.println(copyList); // 40,50
		
		// List 복사 (생성자)
		List<Integer> copyList2 = new ArrayList<>(list);
		list.add(70);
		System.out.println(list);
		System.out.println(copyList2);
		
		// List 비우기
		System.out.println("비우기 전");
		System.out.println(list);
		System.out.println(copyList);
		System.out.println(copyList2);
		
		list.clear();
		copyList.clear();
		copyList2.clear();
		
		System.out.println("비우기 후");
		System.out.println(list);
		System.out.println(copyList);
		System.out.println(copyList2);
		
		
	}

}
