package com.ktdsuniversity.tmdb.actr;

import java.util.List;

import com.ktdsuniversity.tmdb.cst.CstVO;

public class ActrVO {

	private String actrId;
	private String actrPht;
	private String actrNm;
	
	
	private List<CstVO> cstList; // 한명의 배우는 여러개에 출연
	
	
	
	public List<CstVO> getCstList() {
		return this.cstList;
	}
	public void setCstList(List<CstVO> cstList) {
		this.cstList = cstList;
	}
	public String getActrId() {
		return this.actrId;
	}
	public void setActrId(String actrId) {
		this.actrId = actrId;
	}
	public String getActrPht() {
		return this.actrPht;
	}
	public void setActrPht(String actrPht) {
		this.actrPht = actrPht;
	}
	public String getActrNm() {
		return this.actrNm;
	}
	public void setActrNm(String actrNm) {
		this.actrNm = actrNm;
	}
	
	@Override
	public String toString() {
		return "ActrVO [actrId=" + this.actrId + ", actrPht=" + this.actrPht + ", actrNm=" + this.actrNm + "]";
	}

	
	
	
}
