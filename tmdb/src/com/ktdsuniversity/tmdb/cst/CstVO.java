package com.ktdsuniversity.tmdb.cst;

import com.ktdsuniversity.tmdb.actr.ActrVO;
import com.ktdsuniversity.tmdb.mv.MvVO;

public class CstVO {
	
	private String cstId;
	private String mvId;
	private String actrId;
	private String actrRlNm;
	
	// 기준이 cst 받는 줄 2개 
	// 하나의 출연은 1명이 참여 (1 : n 역순) 
	// n이면 리스트
	// 1이면 VO로
	private ActrVO actr;
	private MvVO mv;
	
	public ActrVO getActr() {
		return this.actr;
	}
	public void setActr(ActrVO actr) {
		this.actr = actr;
	}
	public MvVO getMv() {
		return this.mv;
	}
	public void setMv(MvVO mv) {
		this.mv = mv;
	}
	public String getCstId() {
		return this.cstId;
	}
	public void setCstId(String cstId) {
		this.cstId = cstId;
	}
	public String getMvId() {
		return this.mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getActrId() {
		return this.actrId;
	}
	public void setActrId(String actrId) {
		this.actrId = actrId;
	}
	public String getActrRlNm() {
		return this.actrRlNm;
	}
	public void setActrRlNm(String actrRlNm) {
		this.actrRlNm = actrRlNm;
	}
	
	@Override
	public String toString() {
		return "CstVO [cstId=" + this.cstId + ", mvId=" + this.mvId + ", actrId=" + this.actrId + ", actrRlNm=" + this.actrRlNm + "]";
	}
	
	

}
