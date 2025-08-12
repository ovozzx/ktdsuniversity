package com.ktdsuniversity.edu.fp.dish.finding;

import java.util.stream.IntStream;

public class FindExam {
	
	public static void main(String[] args) {
		
		IntStream decimals = IntStream.range(1, Integer.MAX_VALUE);
		
		int value = decimals.parallel() // 모든 CPU 코어가 Stream을 분해해서 검색 (병렬처리하겠다)
							.findAny() // 랜덤하게 나와야하는데 같은 값이 나옴..
							.orElse(-1);
		System.out.println(value);
		//decimals.forEach(System.out::println);
		
		
	}

}
