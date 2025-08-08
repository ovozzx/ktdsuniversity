package com.ktdsuniversity.edu.phonebook.vo;

import com.ktdsuniversity.edu.contact.util.InputUtil;
import com.ktdsuniversity.edu.contact.util.StringUtil;

public class SpeachNameVO {

	private String 호칭;
	private String lastName;
	private String middleName;
	private String firstName;
	private String 경칭;
	
	public SpeachNameVO() {} // 외부 솔루션과의 연동
	// nothing...
	
	public SpeachNameVO(String 호칭, String lastName, String middleName, String firstName, String 경칭) {
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

	public static SpeachNameVO createNewInstance() {
		SpeachNameVO speachNameVO = new SpeachNameVO();
		
		String firstName = InputUtil.next("소리나는 대로 성을 입력하세요. > ");
		if(! StringUtil.isEmpty(firstName)) {
			speachNameVO.setFirstName(firstName);
		}
		
		String middleName = InputUtil.next("소리나는 대로 중간 이름을 입력하세요. > ");
		if(! StringUtil.isEmpty(middleName)) {
			speachNameVO.setMiddleName(middleName);
		}
		
		String lastName = InputUtil.next("소리나는 대로 마지막 이름을 입력하세요. > ");
		if(! StringUtil.isEmpty(lastName)) {
			speachNameVO.setLastName(lastName);
		}
		
		return speachNameVO;
	}
}
