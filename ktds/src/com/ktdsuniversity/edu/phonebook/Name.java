package com.ktdsuniversity.edu.phonebook;

public class Name {
	
	private String nickName;
	private String lastName; // 성
	private String surName; // 성 제외한 이름
	private String name; // 전체 이름
	
	public Name(String nickName, String lastName, String surName, String name) {
		this.nickName = nickName;
		this.lastName = lastName;
		this.surName = surName;
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
