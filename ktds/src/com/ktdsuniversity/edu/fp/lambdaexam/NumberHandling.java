package com.ktdsuniversity.edu.fp.lambdaexam;

import com.ktdsuniversity.edu.fp.lambdaexam.functions.Handler;
import com.ktdsuniversity.edu.fp.lambdaexam.functions.ReturnableHanler;

public class NumberHandling {
	
	public static void printEvenNumber(int eachNumber) { // static이어야 함
		if(eachNumber > 00 && eachNumber % 2 ==0) {
			System.out.println(eachNumber);
		}
	}
	
	public void print(int number, ReturnableHanler handler) {
		
		for(int i = 0 ; i <= number ; i++) {
			if(handler.test(i)) { // 조건문에 대한 값을 main의 람다식을 통해 구현하는 것
				System.out.println(i);
			}
		}
		
	}
	
	public void printHandler(int number, Handler handler) {
		
		for(int i = 0 ; i <= number ; i++) {
			handler.handle(i);
		}
	}

}
