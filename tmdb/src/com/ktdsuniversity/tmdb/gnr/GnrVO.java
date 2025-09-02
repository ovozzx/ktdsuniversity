package com.ktdsuniversity.tmdb.gnr;

import java.util.List;

import com.ktdsuniversity.tmdb.mv.MvVO;

public class GnrVO {
	
	private String gnrId;
	private String gnrNm;
	
	// 한개의 장르는 여러개의 영화를 가짐
	private List<MvVO> mvList;
	
	public List<MvVO> getMvList() {
		return this.mvList;
	}
	public void setMvList(List<MvVO> mvList) {
		this.mvList = mvList;
	}
	public String getGnrId() {
		return this.gnrId;
	}
	public void setGnrId(String gnrId) {
		this.gnrId = gnrId;
	}
	public String getGnrNm() {
		return this.gnrNm;
	}
	public void setGnrNm(String gnrNm) {
		this.gnrNm = gnrNm;
	}
	
	@Override
	public String toString() {
		return "GnrVO [gnrId=" + this.gnrId + ", gnrNm=" + this.gnrNm + "]";
	}
	
	
}
