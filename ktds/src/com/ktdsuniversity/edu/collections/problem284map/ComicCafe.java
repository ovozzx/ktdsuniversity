package com.ktdsuniversity.edu.collections.problem284map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComicCafe implements Cafe {

	private int money; // 소지금
	private Map<String, Book> books;
	
	public ComicCafe() {
		this.money = 100000;
		this.books = new HashMap<>();
		this.books.put("슬램덩크 1화", new Book("슬램덩크 1화", false, 300));
		this.books.put("슬램덩크 2화", new Book("슬램덩크 2화", false, 300));
		this.books.put("슬램덩크 3화", new Book("슬램덩크 3화", false, 300));	
	}
	
	
	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public Map<String, Book> getBooks() {
		return books;
	}


	@Override
	public void borrowBook(String name, int price) {
		//만화책을 대여하면, 만화책의 대여 상태가 “대여 중“ 으로 변환되며 만화책 대여비만큼 소지금이 증가합니다.	
		
		if(!this.books.containsKey(name)) {
			System.out.println("보유하지 않은 책입니다.");
		}
		else {
			this.books.forEach((k,v) -> { // 맵 for 문
				
				if(this.books.get(k).getName().equals(name)){
					if(!this.books.get(k).isBorrow()) {
						if(this.books.get(k).getPrice() > price) {
							System.out.println("대여금이 부족합니다.");
						}
						else {
							int money = price; // 대여비 
							this.setMoney(this.money + money); // 현재 소지금 + 대여비
							this.books.get(k).setBorrow(true);
							System.out.println("대여 완료하였습니다.");
						}
					}
					else {
						System.out.println("현재 대여중으로 대여 불가능합니다.");
					}
					//////
					return; // forEach 문만 빠져나오는지???
				}
				
			});
		}
		
		
	}
	
	@Override
	public void returnBook(String name) {
		
		this.books.forEach((k,v) -> {
			if(this.books.get(k).getName().equals(name)){ // 대여 중이 아닌데 반납한 경우
				this.books.get(k).setBorrow(false);
				System.out.println("반납 완료하였습니다.");
			}
		});
		
	}
	
	public void printAllBooks() {
		this.books.forEach((k,v) -> {
			System.out.println(this.books.get(k).getName() + " " + this.books.get(k).isBorrow());
		});
		System.out.println("만화카페 소지금 : " + this.money);
	}
	
}
