package com.ktdsuniversity.edu.fp.dish.slicing;

import java.util.List;

import com.ktdsuniversity.edu.fp.dish.Dish;
import com.ktdsuniversity.edu.fp.dish.DishList;

public class DishSlicing {

	public static void main(String[] args) {
	
		List<Dish> menu = DishList.get();
		
		// 1. 메뉴 중에서 3개만 출력
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(menu.get(i)); // 리스트 적어서 아래보다 이게 훨씬 빠름
		}
		
		System.out.println("=".repeat(30));
		
		// 1. Stream을 이용해서 메뉴 3개만 출력
		menu.stream() // Stream<Dish>
			.limit(3) // Stream<Dish>
			.forEach(System.out::println);
		
		System.out.println("=".repeat(30));
		// 2. for을 이용해서 처음부터 끝까지 반복을 하는데 
		// 앞에 2개는 건너뛰고 3개만 출력해라
		int printCount = 0;
		for(int i = 0 ; i < menu.size() ; i++) {
			if(i > 1 && printCount < 3) {
				System.out.println(menu.get(i));
				printCount++;
			}
		}
		
		System.out.println("=".repeat(30));
		menu.stream()
			.skip(2)
			.limit(3)
			.forEach(System.out::println);
		
		System.out.println("=".repeat(30));
		// Filtering + Slicing 
		menu.stream()
			.filter((dish) -> !dish.isVegetarian())
			.skip(2)
			.limit(3)
			.forEach(System.out::println); // 순서가 중요하다 

		System.out.println("=".repeat(30));
		menu.stream()
			.limit(3)
			.filter((dish) -> !dish.isVegetarian())
			.skip(2)
			.forEach(System.out::println); // 순서가 중요하다 (. 맞춰서 엔터치기)
	}
	
}
