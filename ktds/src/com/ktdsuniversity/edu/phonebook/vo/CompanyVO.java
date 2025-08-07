package com.ktdsuniversity.edu.phonebook.vo;

/**
 * 연락처의 직장 정보
 */
public class CompanyVO {

	private String position;
	private String dept;
	private String name;
	
	public CompanyVO() {}
	// nothing...
	
	public CompanyVO(String position, String dept, String name) {
		super();
		this.position = position;
		this.dept = dept;
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CompanyVO [position=" + this.position + ", dept=" + this.dept + ", name=" + this.name + "]";
	}
	
	
	
	
}
