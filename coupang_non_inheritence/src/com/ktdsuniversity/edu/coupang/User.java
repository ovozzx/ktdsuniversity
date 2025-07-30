package com.ktdsuniversity.edu.coupang;

import java.time.LocalDate;
import java.util.Objects;

public class User {
	
	private String id;
	private String passward;
	private String name;
	private LocalDate latestSubscribeDate;
	private LocalDate expiredSubscribeDate;
	private boolean isSubsribe;

	// 생성자 생성 단축키 : alt + shift + s (command + option + s)
	/**
	 * @param passward
	 * @param name
	 * @param latestSubscribeDate
	 * @param expiredSubscribeDate
	 */
	public User(String id, String passward, String name, LocalDate latestSubscribeDate,
			LocalDate expiredSubscribeDate) {
		super();
		this.id = id;
		this.passward = passward;
		this.name = name;
		this.latestSubscribeDate = latestSubscribeDate;
		this.expiredSubscribeDate = expiredSubscribeDate;
		this.isSubsribe = this.expiredSubscribeDate.isAfter(LocalDate.now()); // 만료 날짜가 현재 날짜보다 미래인지 => 구독여부 
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassward() {
		return this.passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLatestSubscribeDate() {
		return this.latestSubscribeDate;
	}

	public void setLatestSubscribeDate(LocalDate latestSubscribeDate) {
		this.latestSubscribeDate = latestSubscribeDate;
	}

	public LocalDate getExpiredSubscribeDate() {
		return this.expiredSubscribeDate;
	}

	public void setExpiredSubscribeDate(LocalDate expiredSubscribeDate) {
		this.expiredSubscribeDate = expiredSubscribeDate;
	}

	public boolean getIsSubsribe() {
		return this.isSubsribe;
	}

	public void setSubsribe(boolean isSubsribe) {
		this.isSubsribe = isSubsribe;
	}
	
	public boolean isCorrect(String id, String password) {
		return this.id.equals(id) && this.passward.equals(password);
	}

	@Override
	public String toString() {
		return "User [id=" + this.id + ", passward=" + this.passward + ", name=" + this.name + ", latestSubscribeDate="
				+ this.latestSubscribeDate + ", expiredSubscribeDate=" + this.expiredSubscribeDate + ", isSubsribe=" + this.isSubsribe
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.expiredSubscribeDate, this.id, this.isSubsribe, this.latestSubscribeDate, this.name, this.passward);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(this.expiredSubscribeDate, other.expiredSubscribeDate) && Objects.equals(this.id, other.id)
				&& this.isSubsribe == other.isSubsribe && Objects.equals(this.latestSubscribeDate, other.latestSubscribeDate)
				&& Objects.equals(this.name, other.name) && Objects.equals(this.passward, other.passward);
	}




	
}
