package com.ktdsuniversity.edu.fp.cartoon;

import java.util.List;

import com.ktdsuniversity.edu.fp.cartoon.db.FileHandler;



/**
 * 만화카페
 * */
public class Cafe {

	private List<Cartoon> books;
	private int safe;
	private FileHandler database;
	
	public Cafe() { 
		// 인터페이스 만들기?
		this.database = new FileHandler("C:\\Users\\User\\Desktop\\cafe", "cafe.db");
		this.books = this.database.readFile(
				(arr) -> new Cartoon(arr[0],
									 Boolean.parseBoolean(arr[1]),
									 Integer.parseInt(arr[2]))
				);
		this.safe = 0;
		
	}
	
	public void printAllCartoons() {
		this.books.stream() // 내생각 : Stream<Cartoon>
				  .forEach(
						  (cartoon) -> {
							  System.out.println(
									  "%s / %s / %d" 
									  .formatted(cartoon.getName(), cartoon.getIsRental() + "", cartoon.getRentalFee())
									  );
						  }
						  );
		System.out.println(this.safe + " 원");
		
	}
	
	public Cartoon searchCartoon(String cartoonName) {
		return this.books.stream()
				   .filter((cartoon) -> cartoon.getName().equals(cartoonName)) // 이름 일치
				   //.filter((cartoon) -> !cartoon.getIsRental()) // 대여 가능 여부 확인
				   .findFirst()
				   .orElse(null);
	}
	
	public void rent(String cartoonName) {
		Cartoon cartoon = this.searchCartoon(cartoonName);
		
		if(cartoon != null && !cartoon.getIsRental()) {
			this.safe += cartoon.getRentalFee();
			cartoon.setIsRental(true);			
		}
		else {
			
		}
		
	}
	
	public void returnBook(String cartoonName) {
		Cartoon cartoon = this.searchCartoon(cartoonName);
		
		if(cartoon != null && cartoon.getIsRental()) {
			cartoon.setIsRental(false);			
		}
		else {
			
		}
		
	}
	
	// db save
}
