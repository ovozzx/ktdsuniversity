package com.ktdsuniversity.edu.extend;


/**
 * 상속 : 클래스를 변경해야할 때 편리해짐 
 * 
 * 상속 -> 📌다형성, override
 * 
 * 생성자 : 기본 형태의 생성자가 없으면 자바 컴파일러가 기본 형태의 생성자를 만들어 준다!
 * 어떠한 형태의 생성자가 하나라도 있으면, 자바 컴파일러가 생성자를 만들어주지 않는다.
 */
public class EmailContact extends Contact { // 확장 : Contact를 그대로 가져와서 생성 (생성자 포함) -> 생성자 안 만들어 줌
	// base class = super class => 여기서 Contact
	private String email;
	
	public EmailContact(String firstName, String lastName, String phone, String email) {
		super(firstName, lastName, phone); // base class 생성자 실행해야 함 (Contact 생성자 실행 (데이터 초기값 할당)) ⚠ 항상 1번째 줄에 기입k
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public void printContact() {
			// TODO Auto-generated method stub
			super.printContact();
			System.out.println("***" + this.email);
	}
	
	/*public void printContact() {
		System.out.println(this.getFirstName() + this.getPhone() + this.email);
	}*/
	

	/*public void printEmailContact() {
		System.out.println(this.email);
	}*/
	
	/*
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void printContact() {
		System.out.println(this.firstName + this.lastName + this.phone + this.email);
	}*/

}
