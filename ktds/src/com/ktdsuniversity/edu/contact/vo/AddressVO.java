package com.ktdsuniversity.edu.contact.vo;

import com.ktdsuniversity.edu.contact.util.InputUtil;
import com.ktdsuniversity.edu.contact.util.MenuUtil;

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
	
	public static AddressVO createNewInstance() {
		int menu = 0; 
		while (true) {
			menu = MenuUtil.printAndSelectAddressMenu();
			if (MenuUtil.isValidAddressMenu(menu)) {
				break;
			}
		}
		
		AddressVO addressVO = new AddressVO();
		addressVO.setAddressType(menu);
		
		String address = InputUtil.next("주소를 입력하세요.", true);
		addressVO.setAddress(address);
		return addressVO;
	}
	
	@Override
	public String toString() {
		return "AddressVO [addressType=" + this.addressType + ", address=" + this.address + "]";
	}

	public boolean match(String searchKeyword) {
		if ( ( this.address != null && this.address.contains(searchKeyword)) ) {
			return true;
		}
		return false;
	}


	
	
	
}
