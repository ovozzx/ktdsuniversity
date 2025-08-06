package com.ktdsuniversity.edu.collections.problem284.file;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.collections.problem284.file.db.FileHandler;



public class ComicCafe implements Cafe {

	private int money; // 소지금
	private List<Book> books;
	private FileHandler database;
	
	public ComicCafe() {
		this.money = 100000;
		this.database = new FileHandler("C:\\Users\\User\\Desktop\\cafe", "cafe.db");
		this.books = new ArrayList<>();
		
		List<String> bookLine = this.database.readFile();
		// 생성 시, db 값 읽어오기 위함
		for(String line : bookLine) {
			String[] splitted = line.split("```");
			this.books.add(new Book(splitted[0], 
					Boolean.parseBoolean(splitted[1]),
					Integer.parseInt(splitted[2])));
		}
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
	public void addBook(Object object) {
		// TODO Auto-generated method stub
		Book book = (Book) object;
		this.books.add(book);
		//System.out.println(this.books);
		
		List<String> bookLine = new ArrayList<>();
		
		for(Book bk : this.books) {
			bookLine.add("%s```%b```%d```".formatted(bk.getName(), bk.isBorrow(), bk.getPrice()));
		}
		this.database.writeFile(bookLine);
		
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
						
						List<String> bookLine = new ArrayList<>();
					    // for문 안쓰면 리셋됨 -> 쌓이는 거 확인
						for(Book bk : this.books) {
							bookLine.add("%s```%b```%d```".formatted(bk.getName(), 
									bk.isBorrow(), 
									bk.getPrice()));
							
						}
						this.database.writeFile(bookLine);
						
						
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
