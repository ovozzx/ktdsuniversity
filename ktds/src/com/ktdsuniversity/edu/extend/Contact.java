package com.ktdsuniversity.edu.extend;

public class Contact {

	private String firstName;
	private String lastName;
	private String phone;
	
	public Contact(String firstName, String lastName, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public int getAge() {
		return (int) (Math.random() * 100);
	}
	
	public void printContact() {
		System.out.println(this.getFirstName() + this.getLastName() + this.phone);
	}
	
	/**
	 * 현재 클래스의 슈퍼 클래스(Object)가 가지고 있는
	 * toString()이라는 메소드의 기능을 다시 정의하겠따!(만들겠다!)
	 * Object의 메소드를 덮어쓰기
	 */
	@Override
	public String toString() { // 녹색 세모 기호 : 오버라이딩 기호
		// TODO Auto-generated method stub
		return "이름 : %s, 성 : %s, 연락처 : %s" .formatted(this.firstName, this.lastName, this.phone);
	} // 많이 사용함
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Contact other) {
			return this.firstName.equals(other.getFirstName())
					&& this.lastName.equals(other.getLastName())
					&& this.phone.equals(other.getPhone());
		}
		return false;
	}
	
}
