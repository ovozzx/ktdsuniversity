package com.ktdsuniversity.edu.contact.vo;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.contact.database.FileHandler;
import com.ktdsuniversity.edu.contact.util.InputUtil;
import com.ktdsuniversity.edu.contact.util.StringUtil;


/**
 * 연락처의 이름
 */
public class NameVO {
	
	private FileHandler database; //name 만을 위한 DB
	private String contactId; // 연락처의 아이디
	
	private String 호칭;
	private String lastName;
	private String middleName;
	private String firstName;
	private String 경칭;
	
	public NameVO() {
		//this.database = new FileHandler("C:\\Users\\User\\Desktop\\contact", "name.db");
	} // 외부 솔루션과의 연동
	
	
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
	

	public boolean match(String searchKeyword) {
		
		if((this.호칭 != null && this.호칭.contains(searchKeyword)) 
				|| (this.lastName != null && this.lastName.contains(searchKeyword))
				|| (this.middleName != null && this.middleName.contains(searchKeyword))
				|| (this.firstName != null && this.firstName.contains(searchKeyword))
				|| (this.경칭 != null && this.경칭.contains(searchKeyword))) {
			// 이중에 1개만 채우면 되어서, null pointer 오류 남
			return true;
		}
		return false;
		
	}
	
	public void save() {
		
//		this.database = new FileHandler("C:\\Users\\User\\Desktop\\contact", );
//		// new FileHandler("C:\\Users\\User\\Desktop\\contact", "name.db");
//		List<String> nameString = new ArrayList<>();
//		nameString.add("%s```%s```%s```%s```%s"
//				.formatted(this.호칭, this.lastName, this.middleName, this.firstName, this.경칭));
//
//		database.writeFile(nameString);
	}
	
	@Override
	public String toString() {
		return "NameVO [호칭=" + 호칭 + ", lastName=" + this.lastName + ", middleName=" + this.middleName + ", firstName=" + this.firstName
				+ ", 경칭=" + 경칭 + "]";
	}
	
	
	
	

}
