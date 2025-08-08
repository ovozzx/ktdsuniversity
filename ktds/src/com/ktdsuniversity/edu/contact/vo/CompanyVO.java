package com.ktdsuniversity.edu.contact.vo;

import com.ktdsuniversity.edu.contact.util.InputUtil;
import com.ktdsuniversity.edu.contact.util.StringUtil;

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

	public boolean match(String searchKeyword) {
		if ( ( this.position != null && this.position.contains(searchKeyword)) ||
				( this.dept != null && this.dept.contains(searchKeyword)) || 
				( this.name != null && this.name.contains(searchKeyword)) ) {
			return true;
		}
		return false;
	}

	public static CompanyVO createNewInstance() {
		CompanyVO companyVO = new CompanyVO();
		String position = InputUtil.next("직급을 입력하세요. > ");
		if ( !StringUtil.isEmpty(position) ) {
			companyVO.setPosition(position);
		}
		String dept = InputUtil.next("부서를 입력하세요. > ");
		if ( !StringUtil.isEmpty(dept) ) {
			companyVO.setDept(dept);
		}
		String name = InputUtil.next("회사명을 입력하세요. > ");
		if ( !StringUtil.isEmpty(name) ) {
			companyVO.setName(name);
		}
		
		return companyVO;
	}
	
	
	
	
}
