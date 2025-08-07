package com.ktdsuniversity.edu.phonebook;

import java.time.LocalDate;

public class Person extends Name{

	private String company;
	private String phoneNumber;
	private String email;
	private String address;
	private LocalDate birthday;
	
	public Person(String nickName, 
				String lastName, 
				String surName, 
				String name,
				String company,
				String phoneNumber,
				String email,
				String address,
				LocalDate birthday
				) {
		super(nickName, lastName, surName, name);
		this.company = company;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		
	}

	public String getCompany() {
		return this.company;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public LocalDate getBirthday() {
		return this.birthday;
	}
	

}
