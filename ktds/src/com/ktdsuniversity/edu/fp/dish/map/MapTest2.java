package com.ktdsuniversity.edu.fp.dish.map;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Function;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class MapTest2 {

	public static void main(String[] args) {
		
		// 바탕화면 경로 : C:\Users\User\Desktop
		List<String> dijkstra = null;
		try {			
			dijkstra = Files.readAllLines(new File("C:\\Users\\User\\Desktop\\dijkstra.txt").toPath());
			// readAllLines -> 줄을 List<String> 형태로 반환
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(dijkstra);
		
		
		System.out.println("=".repeat(50));
		// 1. 라인이 비어있는 것은 추출하지 않는다.
		// 2, (필수아님) 한글로 이루어진 것만 (띄어쓰기 포함) 추출한다 regex ==> 가-힣
		//			   숫자와 띄어쓰기로만 이루어져있나? ^[0-9 ]+$
		// 3. 라인의 길이가 7 글자 이상인 것만 추출
		// 4. 라인 문자열로 변환 (예) 데이크스트라 -> 데이크스트라(6)
		// 5. 출력
//		dijkstra.stream()
//				.peek((str) -> {
//					if(str.trim().length() > 0) {		
//						System.out.println(str);
//					}
//				})
//			    .peek((str) -> {
//			    	   System.out.println("------------");
//			       })
//				.filter((str) -> str.trim().length() > 0)
////			    .peek((str) ->{
////			    
////			    	   if(str.matches("^[가-힣]*$") || str.matches("^[0-9 ]+$")) {
////			    		   System.out.println(str);
////			    		   
////			    	   }
////			    }	   )
////			    .peek((str) -> {
////		    	   System.out.println("------------");
////		       })
//				.filter((str) -> str.matches("^[가-힣]*$") || str.matches("^[0-9 ]+$"))
//				.map(String::length)
//				.filter((len) -> len >= 7)
//				.map((len)-> "(" + len.toString() + ")")
//				.forEach(System.out::println);
//				;
				
				
				System.out.println("=".repeat(50) + "1");
				
				
				dijkstra.stream()
				.filter((str) -> str.trim().length() > 0)
				.filter((str) -> str.trim().matches("^[가-힣\\s]+$"))
				.filter((str) -> str.trim().length() >= 7)
				.map((str) -> "%s(%d)".formatted(str.trim(), str.trim().length()))
				.forEach(System.out::println);
				; 
				
				// 검증
				
				System.out.println("=".repeat(50));
				// 다익스트라 리스트에서 띄어쓰기와 한글로만 이루어진 라인이 몇개인가?
				long count = dijkstra.stream()
									 .filter((line) -> line.trim().matches("^[가-힣 ]+$"))
									 .count();
				System.out.println(count);
				
				String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "H"};		
				List<String> letterList = Arrays.asList(letters);
				
				letterList.stream()	
				 		  .distinct() // 중복요소 제거
				 		  .forEach(System.out::println);
				
				System.out.println("=".repeat(50));
				
				// Array (String[]) -> Stream (Stream<String>)
				Stream.of(letters);
				
				//  <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
				
				dijkstra.stream() // Stream<String>
						.map((line) -> line.split(" ")) // Stream<Stirng[]>
						// ????? // Stream<String>
//						.map((array) -> Stream.of(array)) // Stream<Stream<String> -> 이상한 값나옴
						.flatMap((array) -> Stream.of(array)) // Stream<String> = 반환되는 값 자체를 쓰겠다 (잘 안씀)
						// 단어들 중에서 한글로만 이루어진 것만 추출한다
						.filter((word) -> word.matches("^[가-힣]+$")) // 제네릭이 String
						.distinct()
					    .forEach(System.out::println);
				
				
	}
	
}
