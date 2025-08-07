package com.ktdsuniversity.edu.contact;

/**
 * 연락처
 */
public class PhoneVO {
	// 구분자 필요
	
	/**
	 * 연락처 종류
	 * @see com.ktdsuniversity.edu.contact.constants.PhoneType
	 * 
	 */
	private int phoneNumberType;
	private String phoneNumber; // 값이기에 상수 
	
	public PhoneVO() {}
	// Nothing...
	
	public PhoneVO(int phoneNumberType, String phoneNumber) {
		super();
		this.phoneNumberType = phoneNumberType;
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneNumberType() {
		return phoneNumberType;
	}

	public void setPhoneNumberType(int phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "PhoneVO [phoneNumberType=" + this.phoneNumberType + ", phoneNumber=" + this.phoneNumber + "]";
	}
	
	
	
	
}
