package com.ktdsuniversity.edu.contact.vo;

import java.time.LocalDate;

/**
 * 연락처의 중요한 날
 */
public class SpecialDateVO {

	/**
	 * 중요한 날 타입
	 * @see com.ktdsuniversity.edu.contact.constants.SpecialDateType
	 */
	private int specialDateType;
	private LocalDate specialDate;
	
	public SpecialDateVO() {
	// nothing...	
	}
	
	public SpecialDateVO(int specialDateType, LocalDate specialDate) {
		super();
		this.specialDateType = specialDateType;
		this.specialDate = specialDate;
	}

	public int getSpecialDateType() {
		return specialDateType;
	}

	public void setSpecialDateType(int specialDateType) {
		this.specialDateType = specialDateType;
	}

	public LocalDate getSpecialDate() {
		return specialDate;
	}

	public void setSpecialDate(LocalDate specialDate) {
		this.specialDate = specialDate;
	}

	@Override
	public String toString() {
		return "SpecialDateVO [specialDateType=" + this.specialDateType + ", specialDate=" + this.specialDate + "]";
	}
	
	
	
}
