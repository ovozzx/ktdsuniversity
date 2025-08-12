package com.ktdsuniversity.edu.fp.dish.joining;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.dish.Dish;
import com.ktdsuniversity.edu.fp.dish.DishList;

public class JoiningTest {

	
	public static void main(String[] args) {
		
		List<Dish> dishList = DishList.get();
		
		// toString이 return name이라서, get(index)로 뽑으면 이름만 나옴
		
		// Case 중 뭐가 좋은 지는 데이터 수로 판단 -> 데이터 많으면 Case 3. stream 사용 
		// 데이터 적으면 코어끼리 경쟁하다 시간 다 감
	
		// 1. Best Case
		String dishString = dishList.toString();
		System.out.println(dishString);
		System.out.println(dishString.substring(0, 1));
		System.out.println(dishString.substring(dishString.length() - 1));
		System.out.println(dishString.substring(1, dishString.length() - 1));
		
		// 2. Case : for
		String connectString = "";
		for(Dish dish : dishList) {
			connectString += dish.getName() + ", ";
		}
		connectString = connectString.substring(0, connectString.length() - 2);
		System.out.println(connectString);
		
		// 3. Case : stream
		String connStr = dishList.stream()
								 .map((dish) -> dish.getName())
								 .collect(Collectors.joining(", "));
		System.out.println(connStr);
							
	}
	
	
}
