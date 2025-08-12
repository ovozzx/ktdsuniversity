package com.ktdsuniversity.edu.fp.cartoon;

import java.util.List;
import java.util.ArrayList;

/**
 * 만화카페 실행 클래스
 */
public class CartoonMain {
	public static void main(String[] args) {
			
		Cafe playCartoon = new Cafe();
		playCartoon.printAllCartoons();
		
		System.out.println("=".repeat(30) + 1);
		
		playCartoon.rent("슬램덩크 1화");
		playCartoon.printAllCartoons();
		
		System.out.println("=".repeat(30) + 2);
		
		playCartoon.rent("슬램덩크 2화");
		playCartoon.printAllCartoons();
		
		System.out.println("=".repeat(30) + 3);
		
		playCartoon.rent("슬램덩크 3화");
		playCartoon.printAllCartoons();
		
		System.out.println("=".repeat(30) + 4);
		
		playCartoon.returnBook("슬램덩크 1화");
		playCartoon.printAllCartoons();
		
		System.out.println("=".repeat(30) + 5);
		
		playCartoon.returnBook("슬램덩크 2화");
		playCartoon.printAllCartoons();
		
		System.out.println("=".repeat(30) + 6);
		
		playCartoon.returnBook("슬램덩크 3화");
		playCartoon.printAllCartoons();
	}
}


