package com.ktdsuniversity.edu.fp.dish.map;

import java.util.Arrays;
import java.util.List;


public class MapTest {

	public static void main(String[] args) {
		
		// Array -> List 변환
		// 						6		7			3 		...
		String[] strArray = {"Filter", "Slicing", "Map", "FlatMap", "Lambda"};
		List<String> strList = Arrays.asList(strArray); // 리스트로 바뀜
		System.out.println(strList);
		
		
		System.out.println("=".repeat(30));
		
		// 각 글자들을 숫자로 변환(글자의 길이)해서 출력
		// Stream은 List에서 사용 가능
		strList.stream() // Stream<String>
			   .map(String::length) // Stream<Integer>
			   .forEach(System.out::println);
			   //.map((str) -> String::length); // Function<T, R> T ==> String, Integer
			   // map 함수를 통해서 형태 또는 값이 변경되면, 원래의 값은 찾을 수 없다.
		
		System.out.println("=".repeat(30));
		
		// strList를 반복시킨다
		strList.stream() // Stream<String>
		// "F"로 시작하는 문자열만 추려낸다
		       .filter((str) -> str.startsWith("F"))
		// 해당 문자열을 길이로 변환시킨다
		       .peek(System.out::println) // peek은 Stream의 변화를 주지 않는다
		       .peek((str) -> {
		    	   System.out.println(str.length());
		       })
		       .map(String::length) // Stream<Integer>
		// 길이가 짝수인 것만 추려낸다 
		       .filter((len) -> len % 2 == 0) // 직전의 것이 들어감
		// 출력한다
		       .forEach(System.out::println);
	}
	
}
