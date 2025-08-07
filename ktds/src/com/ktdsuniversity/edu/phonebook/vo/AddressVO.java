package com.ktdsuniversity.edu.phonebook.vo;

/**
 * 연락처의 주소 정보
 */
public class AddressVO {

	/**
	 * @see com.ktdsuniversity.edu.contact.constant.AddressType
	 */
	private int addressType;
	private String address;
	
	public AddressVO() {}
	// nothing ...
	
	public AddressVO(int addressType, String address) {
		super();
		this.addressType = addressType;
		this.address = address;
	}

	public int getAddressType() {
		return addressType;
	}

	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AddressVO [addressType=" + this.addressType + ", address=" + this.address + "]";
	}
	
	
	
	
}
