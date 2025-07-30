package com.ktdsuniversity.edu.coupang;

import java.util.Objects;

public class User {

	private String id;
	private String password;
	private String name;
	
	public User(String id, 
				String password, 
				String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCorrect(String id, String password) {
		return this.id.equals(id) && this.password.equals(password);
	}

	@Override
	public String toString() {
		return "User [id=" + this.id 
				+ ", password=" + this.password 
				+ ", name=" + this.name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		return Objects.equals(this.id, other.id) 
				&& Objects.equals(this.name, other.name)
				&& Objects.equals(this.password, other.password);
	}
	
}