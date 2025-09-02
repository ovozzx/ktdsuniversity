package com.ktdsuniversity.tmdb.mkng;

import com.ktdsuniversity.tmdb.mv.MvVO;
import com.ktdsuniversity.tmdb.stff.StffVO;

public class MkngVO {
	
	private String mkngId;
	private String mvId;
	private String stffId;
	private String stffRl;
	private String stffPrt;
	
	// 기준이 mkng 받는 줄 2개 
	// 하나의 제작은 1명이 참여 (1 : n 역순) 
	// n이면 리스트
	// 1이면 VO로
	private StffVO stff;
	private MvVO mv;
	
	
	public StffVO getStff() {
		return this.stff;
	}
	public void setStff(StffVO stff) {
		this.stff = stff;
	}
	public MvVO getMv() {
		return this.mv;
	}
	public void setMv(MvVO mv) {
		this.mv = mv;
	}
	public String getMkngId() {
		return this.mkngId;
	}
	public void setMkngId(String mkngId) {
		this.mkngId = mkngId;
	}
	public String getMvId() {
		return this.mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getStffId() {
		return this.stffId;
	}
	public void setStffId(String stffId) {
		this.stffId = stffId;
	}
	public String getStffRl() {
		return this.stffRl;
	}
	public void setStffRl(String stffRl) {
		this.stffRl = stffRl;
	}
	public String getStffPrt() {
		return this.stffPrt;
	}
	public void setStffPrt(String stffPrt) {
		this.stffPrt = stffPrt;
	}
	
	@Override
	public String toString() {
		return "MkngVO [mkngId=" + this.mkngId + ", mvId=" + this.mvId + ", stffId=" + this.stffId + ", stffRl=" + this.stffRl
				+ ", stffPrt=" + this.stffPrt + "]";
	}
	
	
}
