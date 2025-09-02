package com.ktdsuniversity.tmdb.mv;

import java.util.List;

import com.ktdsuniversity.tmdb.cst.CstVO;
import com.ktdsuniversity.tmdb.gnr.GnrVO;
import com.ktdsuniversity.tmdb.mkng.MkngVO;

public class MvVO {

	private String mvId;
	private String pstr;
	private String ttl;
	private int lmtAge;
	private String opnDt;
	private int rnngTm;
	private String kwrd;
	private String snpss;
	private String orgnlTtl;
	private String opnStts;
	private String orgnlLngg;
	private int prdctFee;
	private long prft; // 10억 단위 
	
	// 기준이 영화 has a 
	private List<GnrVO> gnrList; // 한개의 영화는 여러개의 장르를 가지고 있다 
	private List<MkngVO> mkngList; // 한개의 영화는 여러개의 제작이 참여
	private List<CstVO> cstList; // 한개의 영화는 여러개의 제작이 참여
	
	
	public List<GnrVO> getGnrList() {
		return this.gnrList;
	}
	public void setGnrList(List<GnrVO> gnrList) {
		this.gnrList = gnrList;
	}
	public List<MkngVO> getMkngList() {
		return this.mkngList;
	}
	public void setMkngList(List<MkngVO> mkngList) {
		this.mkngList = mkngList;
	}
	public List<CstVO> getCstList() {
		return this.cstList;
	}
	public void setCstList(List<CstVO> cstList) {
		this.cstList = cstList;
	}
	public String getMvId() {
		return this.mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getPstr() {
		return this.pstr;
	}
	public void setPstr(String pstr) {
		this.pstr = pstr;
	}
	public String getTtl() {
		return this.ttl;
	}
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}
	public int getLmtAge() {
		return this.lmtAge;
	}
	public void setLmtAge(int lmtAge) {
		this.lmtAge = lmtAge;
	}
	public String getOpnDt() {
		return this.opnDt;
	}
	public void setOpnDt(String opnDt) {
		this.opnDt = opnDt;
	}
	public int getRnngTm() {
		return this.rnngTm;
	}
	public void setRnngTm(int rnngTm) {
		this.rnngTm = rnngTm;
	}
	public String getKwrd() {
		return this.kwrd;
	}
	public void setKwrd(String kwrd) {
		this.kwrd = kwrd;
	}
	public String getSnpss() {
		return this.snpss;
	}
	public void setSnpss(String snpss) {
		this.snpss = snpss;
	}
	public String getOrgnlTtl() {
		return this.orgnlTtl;
	}
	public void setOrgnlTtl(String orgnlTtl) {
		this.orgnlTtl = orgnlTtl;
	}
	public String getOpnStts() {
		return this.opnStts;
	}
	public void setOpnStts(String opnStts) {
		this.opnStts = opnStts;
	}
	public String getOrgnlLngg() {
		return this.orgnlLngg;
	}
	public void setOrgnlLngg(String orgnlLngg) {
		this.orgnlLngg = orgnlLngg;
	}
	public int getPrdctFee() {
		return this.prdctFee;
	}
	public void setPrdctFee(int prdctFee) {
		this.prdctFee = prdctFee;
	}
	public long getPrft() {
		return this.prft;
	}
	public void setPrft(long prft) {
		this.prft = prft;
	}
	
	@Override
	public String toString() {
		return "MvVO [mvId=" + this.mvId + ", pstr=" + this.pstr + ", ttl=" + this.ttl + ", lmtAge=" + this.lmtAge + ", opnDt=" + this.opnDt
				+ ", rnngTm=" + this.rnngTm + ", kwrd=" + this.kwrd + ", snpss=" + this.snpss + ", orgnlTtl=" + this.orgnlTtl + ", opnStts="
				+ this.opnStts + ", orgnlLngg=" + this.orgnlLngg + ", prdctFee=" + this.prdctFee + ", prft=" + this.prft + "]";
	}
	
	// 생성자 안 만듦
	
	

}
