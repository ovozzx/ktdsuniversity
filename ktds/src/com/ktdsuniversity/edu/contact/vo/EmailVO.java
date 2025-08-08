package com.ktdsuniversity.edu.contact.vo;

import com.ktdsuniversity.edu.contact.util.InputUtil;
import com.ktdsuniversity.edu.contact.util.MenuUtil;

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

	public static EmailVO createNewInstance() {
		int menu = 0;
		while(true) {
			menu = MenuUtil.printAndSelectEmailMenu();
			if(MenuUtil.isValidEmailMenu(menu)) {
				break;
			}
		}
		
		EmailVO emailVO = new EmailVO();
		emailVO.setEmailType(menu);
		
		String email = InputUtil.next("이메일을 입력하세요.", true);
		emailVO.setEmail(email);
		
		return emailVO;
		
	}

	public boolean match(String searchKeyword) {
		if ( ( this.email != null && this.email.contains(searchKeyword)) ) {
			return true;
		}
		return false;
	}
	
	
	
}
