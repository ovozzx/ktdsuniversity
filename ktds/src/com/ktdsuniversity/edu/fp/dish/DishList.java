package com.ktdsuniversity.edu.fp.dish;

import java.util.Arrays;
import java.util.List;


public class DishList {
	
	public static List<Dish> get(){
		
		List<Dish> menu = Arrays.asList( 
				new Dish("돼지고기", false, 800, Dish.Type.MEAT), 
				new Dish("소고기", false, 700, Dish.Type.MEAT), 
				new Dish("치킨", false, 400, Dish.Type.MEAT), 
				new Dish("프렌치 프라이", true, 530, Dish.Type.OTHER), 
				new Dish("쌀밥", true, 350, Dish.Type.OTHER), 
				new Dish("계절 과일", true, 120, Dish.Type.OTHER), 
				new Dish("피자", true, 550, Dish.Type.OTHER), 
				new Dish("새우", false, 300, Dish.Type.FISH), 
				new Dish("연어", false, 450, Dish.Type.FISH)
				);
		return menu;
		
	}

}
