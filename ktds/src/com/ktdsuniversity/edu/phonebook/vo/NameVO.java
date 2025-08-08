package com.ktdsuniversity.edu.phonebook.vo;

import com.ktdsuniversity.edu.contact.util.InputUtil;
import com.ktdsuniversity.edu.contact.util.StringUtil;

/**
 * 연락처의 이름
 */
public class NameVO {
	
	private String 호칭;
	private String lastName;
	private String middleName;
	private String firstName;
	private String 경칭;
	
	public NameVO() {} // 외부 솔루션과의 연동
	// nothing...
	
	public NameVO(String 호칭, String lastName, String middleName, String firstName, String 경칭) {
		super();
		this.호칭 = 호칭;
		this.lastName = lastName;
		this.middleName = middleName;
		this.firstName = firstName;
		this.경칭 = 경칭;
	}

	public String get호칭() {
		return 호칭;
	}

	public void set호칭(String 호칭) {
		this.호칭 = 호칭;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String get경칭() {
		return 경칭;
	}

	public void set경칭(String 경칭) {
		this.경칭 = 경칭;
	}

	
	public static NameVO createNewInstance() {
		NameVO newInstance = new NameVO();
		String 호칭 = InputUtil.next("호칭을 입력하세요. > ");
		if(! StringUtil.isEmpty(호칭)) {
			newInstance.set호칭(호칭);
		}
		String firstName = InputUtil.next("성을 입력하세요. > ");
		if(! StringUtil.isEmpty(firstName)) {
			newInstance.setFirstName(firstName);
		}
		String middleName = InputUtil.next("중간이름을 입력하세요. > ");
		if(! StringUtil.isEmpty(middleName)) {
			newInstance.setMiddleName(middleName);
		}
		return newInstance;
	}
	
	@Override
	public String toString() {
		return "NameVO [호칭=" + 호칭 + ", lastName=" + this.lastName + ", middleName=" + this.middleName + ", firstName=" + this.firstName
				+ ", 경칭=" + 경칭 + "]";
	}
	
	
	
	

}
