package com.ktdsuniversity.edu.collections.problem284map;

public class Main {

	public static void main(String[] args) {
		
		ComicCafe toonCafe = new ComicCafe();
		
		toonCafe.borrowBook("슬램덩크 1화", 100);
		toonCafe.printAllBooks();
		
		toonCafe.borrowBook("슬램덩크 4화", 300);
		toonCafe.printAllBooks();
		
		toonCafe.borrowBook("슬램덩크 2화", 300);
		toonCafe.printAllBooks();
		
		toonCafe.borrowBook("슬램덩크 2화", 300);
		toonCafe.printAllBooks();
		
		toonCafe.returnBook("슬램덩크 2화");
		toonCafe.printAllBooks();
	}
}
