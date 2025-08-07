package com.ktdsuniversity.edu.phonebook.vo;

public class SuperNameVO {
	
	private String lastName;
	private String MiddleName;
	private String FirstName;
	
	public SuperNameVO(String lastName, String middleName, String firstName) {
		super();
		this.lastName = lastName;
		MiddleName = middleName;
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	@Override
	public String toString() {
		return "SuperNameVO [lastName=" + this.lastName + ", MiddleName=" + this.MiddleName + ", FirstName=" + this.FirstName + "]";
	}
	
	
	

}
