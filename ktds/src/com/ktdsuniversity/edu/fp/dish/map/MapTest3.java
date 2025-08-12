package com.ktdsuniversity.edu.fp.dish.map;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.dish.Dish;
import com.ktdsuniversity.edu.fp.dish.DishList;



public class MapTest3 {

	public static void main(String[] args) {
	
		List<Dish> dishList = DishList.get();
		
		// MEAT 요리만 추출해서 List로 변환시켜라
		List<Dish> meatDishes = dishList.stream() // Stream<Dish>
										.filter((dish) -> dish.getType() == Dish.Type.MEAT) // Stream<Dish>
										.collect(Collectors.toList()) // Since Java 1.8
										// .toList() // Since Java 16				
										;
		System.out.println(meatDishes);
		
		
		// other 요리중에 아무거나 하나 가져와라
		Optional<Dish> otherDish = dishList.stream() // Stream<Dish>
								 .filter((dish) -> dish.getType() == Dish.Type.OTHER) // Stream<Dish>
								 .filter((dish) -> dish.getName().length() >= 100)
								 .findAny(); // 아무거나 하나 -> 반환값 : Optional<T> -> Optional<Dish>
								
	
		Dish otherDish_ = dishList.stream() // Stream<Dish>
				 .filter((dish) -> dish.getType() == Dish.Type.OTHER) // Stream<Dish>
				 .filter((dish) -> dish.getName().length() >= 100)
				 .findAny() // 아무거나 하나 -> 반환값 : Optional<T> -> Optional<Dish>
				 //.findFirst() // Optional <Dish> 첫번째 거
				 .orElse(null); // 반환 값 : Dish or null
		
		System.out.println(otherDish); // Optional<T> -> null pointer exception에 유연하도록 만듦 -> Optional 클래스로
		// 있을 수도 Optional[데이터]
		// 없을 수도 Optional.empty
		
		Dish dish_ = otherDish.orElse(null); // 값이 있으면 변수에 넣어주고, 없으면 null을 할당해라
		
		// 데이터 적어거 같은 것만 나올 것
		if(dish_ != null){
			System.out.println(dish_.getName());
		}
		else {
			System.out.println("요리가 없습니다");
		}
		
		if(otherDish.isPresent()) {
			Dish dish = otherDish.get();
//			System.out.println(otherDish.get().getName());
			System.out.println(dish.getName());
		}
		else {
			System.out.println("요리가 없습니다.");
		}
		
	}
	
}
