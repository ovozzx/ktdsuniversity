package com.ktdsuniversity.edu.coupang;

import java.time.LocalDate;
import java.util.Objects;

public class WowUser extends User {

	private LocalDate latestSubscribeDate;
	private LocalDate expireSubscribeDate;
	private boolean isSubscribe;

	public WowUser(String id, String password, String name, 
			LocalDate latestSubscribeDate,
			LocalDate expireSubscribeDate) {
		super(id, password, name);
		this.latestSubscribeDate = latestSubscribeDate;
		this.expireSubscribeDate = expireSubscribeDate;
		this.isSubscribe = this.expireSubscribeDate.isAfter(LocalDate.now());
	}

	public LocalDate getLatestSubscribeDate() {
		return this.latestSubscribeDate;
	}

	public void setLatestSubscribeDate(LocalDate latestSubscribeDate) {
		this.latestSubscribeDate = latestSubscribeDate;
	}

	public LocalDate getExpireSubscribeDate() {
		return this.expireSubscribeDate;
	}

	public void setExpireSubscribeDate(LocalDate expireSubscribeDate) {
		this.expireSubscribeDate = expireSubscribeDate;
	}

	public boolean getIsSubscribe() {
		return this.isSubscribe;
	}

	public void setIsSubscribe(boolean isSubscribe) {
		this.isSubscribe = isSubscribe;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nWowUser [latestSubscribeDate=" + this.latestSubscribeDate 
				+ ", expireSubscribeDate=" + this.expireSubscribeDate
				+ ", isSubscribe=" + this.isSubscribe + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.expireSubscribeDate, this.isSubscribe, this.latestSubscribeDate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		WowUser other = (WowUser) obj;
		return Objects.equals(this.expireSubscribeDate, other.expireSubscribeDate) 
				&& this.isSubscribe == other.isSubscribe
				&& Objects.equals(this.latestSubscribeDate, other.latestSubscribeDate);
	}
}