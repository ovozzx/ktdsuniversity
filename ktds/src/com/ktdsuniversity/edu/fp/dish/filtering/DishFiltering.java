package com.ktdsuniversity.edu.fp.dish.filtering;

import java.util.List;

import com.ktdsuniversity.edu.fp.dish.Dish;
import com.ktdsuniversity.edu.fp.dish.DishList;

public class DishFiltering {

	public static void main(String[] args) {
		
		List<Dish> menu = DishList.get();
		System.out.println(menu);
		
		// Stream 없이 300 칼로리 미만의 Dish만 출력
		for(Dish m : menu) {
			if(m.getCalories() > 300) {
				System.out.println(m);
			}
		}
		
		System.out.println("=".repeat(30));
		
		// Stram을 이용해서 300 칼로리 초과인 Dish만출력
		// 1. menu : List<Dish> ==> Stream<Dish>
		menu.stream() // stream은 제네릭이 자동 변환 : Dish 제네릭이 들어감
			.peek((dish) -> {
				System.out.println("Filter 전 디버깅 : " + dish);
				System.out.println("Filter 전 디버깅 : " + dish.getCalories());
			}) // 필터 전의 디버깅
		    .filter((dish) -> dish.getCalories() > 300) // -> true이면 모든 것을 pass
		    .peek((dish) -> {
				System.out.println("Filter 후 디버깅 : " + dish);
				System.out.println("Filter 후 디버깅 : " + dish.getCalories());
		    }) // 필터 후의 디버깅
			.forEach(System.out::println);
		
		System.out.println("=".repeat(30));
		
		// Stream을 이용하지 않고 채식 요리만 출력
		for(Dish m : menu) { // Dish의 2번째 참고
			if(m.isVegetarian()) {
				System.out.println(m);
			}
		}
		
		System.out.println("=".repeat(30));
		
		// Stream을 이용해서 채식 요리만 출력
		menu.stream()
			.filter((dish) -> dish.isVegetarian())
			.forEach(System.out::println);
		
		System.out.println("=".repeat(30));
		menu.stream()
			.filter(Dish::isVegetarian) // 메소드 레퍼런스 (파리미터가 Dish 였음)
			.forEach(System.out::println);
		
	}
}
