package com.ktdsuniversity.edu.collections.problem284;

import java.util.ArrayList;
import java.util.List;


public class ComicCafe implements Cafe {

	private int money; // 소지금
	private List<Book> books;
	
	public ComicCafe() {
		this.money = 100000;
		this.books = new ArrayList<>();
		this.books.add(new Book("슬램덩크 1화", false, 300));
		this.books.add(new Book("슬램덩크 2화", false, 300));
		this.books.add(new Book("슬램덩크 3화", false, 300));	
	}
	
	
	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}


	@Override
	public void borrowBook(String name, int price) {
		//만화책을 대여하면, 만화책의 대여 상태가 “대여 중“ 으로 변환되며 만화책 대여비만큼 소지금이 증가합니다.	
		
		for(Book book : this.books) {
			
			if(book.getName().equals(name)){
				if(!book.isBorrow()) {
					if(book.getPrice() > price) {
						System.out.println("대여금이 부족합니다.");
					}
					else {
						int money = price; // 대여비 
						this.setMoney(this.money + money); // 현재 소지금 + 대여비
						book.setBorrow(true);
						System.out.println("대여 완료하였습니다.");
					}
				}
				else {
					System.out.println("현재 대여중으로 대여 불가능합니다.");
				}
				//////
				return;
			}
			
		}
		System.out.println("보유하지 않은 책입니다.");
		
	}
	
	@Override
	public void returnBook(String name) {
		
		for(Book book : this.books) {
			if(book.getName().equals(name)){ // 대여 중이 아닌데 반납한 경우
				book.setBorrow(false);
				System.out.println("반납 완료하였습니다.");
			}
		}
		
	}
	
	public void printAllBooks() {
		for(Book book : this.books) {
			System.out.println(book.getName() + " " + book.isBorrow());
		}
		System.out.println("만화카페 소지금 : " + this.money);
	}
	
	
}
