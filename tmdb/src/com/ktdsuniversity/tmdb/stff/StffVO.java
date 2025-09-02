package com.ktdsuniversity.tmdb.stff;

import java.util.List;

import com.ktdsuniversity.tmdb.mkng.MkngVO;

public class StffVO {
	
	private String stffId;
	private String stffPht;
	private String stffNm;
	
	// 한명의 제작진은 여러개의 영화를 제작 (줄만 따라 감)
	private List<MkngVO> mkngList;	
	
	public List<MkngVO> getMkngList() {
		return this.mkngList;
	}
	public void setMkngList(List<MkngVO> mkngList) {
		this.mkngList = mkngList;
	}
	public String getStffId() {
		return this.stffId;
	}
	public void setStffId(String stffId) {
		this.stffId = stffId;
	}
	public String getStffPht() {
		return this.stffPht;
	}
	public void setStffPht(String stffPht) {
		this.stffPht = stffPht;
	}
	public String getStffNm() {
		return this.stffNm;
	}
	public void setStffNm(String stffNm) {
		this.stffNm = stffNm;
	}
	
	@Override
	public String toString() {
		return "StffVO [stffId=" + this.stffId + ", stffPht=" + this.stffPht + ", stffNm=" + this.stffNm + "]";
	}
	
	
}
