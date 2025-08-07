package com.ktdsuniversity.edu.phonebook.vo;

public class EmailVO {

	/**
	 * 이메일 타입
	 * @see com.ktdsuniversity.edu.contact.constants.EmailType
	 */
	private int emailType;
	private String email;
	
	public EmailVO() {}
	// nothing..

	public EmailVO(int emailType, String email) {
		super();
		this.emailType = emailType;
		this.email = email;
	}

	public int getEmailType() {
		return emailType;
	}

	public void setEmailType(int emailType) {
		this.emailType = emailType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmailVO [emailType=" + emailType + ", email=" + email + "]";
	}
	
	
}
