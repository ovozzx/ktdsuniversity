package com.ktdsuniversity.edu.contact.vo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.contact.database.FileHandler;

/**
 * 연락처 정보
 */
public class ContactVO {
	
	private String id; // 연락처 하나를 구분지을 고유한 값
	private FileHandler database; 
	
	private File profilePicture;
	private NameVO name; // has a (클래스 안에 클래스)
	private SpeachNameVO speachName; // 빈파일
	private String nickname;
	private List<PhoneVO> phoneList;
	private List<EmailVO> emailList;
	private String group;
	private CompanyVO company;
	private List<AddressVO> addressList;
	private List<SpecialDateVO> specialDateList;
	private List<RelationshipVO> relationshipList;
	private String memo;
	private List<String> websiteList;
	private String bellSoundName;
	
	public ContactVO() {
		// TODO Auto-generated constructor stub
	}
	
	public ContactVO(File profilePicture, NameVO name, SpeachNameVO speachName, String nickname,
			List<PhoneVO> phoneList, List<EmailVO> emailList, String group, CompanyVO company,
			List<AddressVO> addressList, List<SpecialDateVO> specialDateList, List<RelationshipVO> relationshipList,
			String memo, List<String> websiteList, String bellSoundName) {
		super();
		this.profilePicture = profilePicture;
		this.name = name;
		this.speachName = speachName;
		this.nickname = nickname;
		this.phoneList = phoneList;
		this.emailList = emailList;
		this.group = group;
		this.company = company;
		this.addressList = addressList;
		this.specialDateList = specialDateList;
		this.relationshipList = relationshipList;
		this.memo = memo;
		this.websiteList = websiteList;
		this.bellSoundName = bellSoundName;
	}

	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public File getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(File profilePicture) {
		this.profilePicture = profilePicture;
	}

	public NameVO getName() {
		return name;
	}

	public void setName(NameVO name) {
		this.name = name;
	}

	public SpeachNameVO getSpeachName() {
		return speachName;
	}

	public void setSpeachName(SpeachNameVO speachName) {
		this.speachName = speachName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public List<PhoneVO> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<PhoneVO> phoneList) {
		this.phoneList = phoneList;
	}

	public List<EmailVO> getEmailList() {
		return emailList;
	}

	public void setEmailList(List<EmailVO> emailList) {
		this.emailList = emailList;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public CompanyVO getCompany() {
		return company;
	}

	public void setCompany(CompanyVO company) {
		this.company = company;
	}

	public List<AddressVO> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressVO> addressList) {
		this.addressList = addressList;
	}

	public List<SpecialDateVO> getSpecialDateList() {
		return specialDateList;
	}

	public void setSpecialDateList(List<SpecialDateVO> specialDateList) {
		this.specialDateList = specialDateList;
	}

	public List<RelationshipVO> getRelationshipList() {
		return relationshipList;
	}

	public void setRelationshipList(List<RelationshipVO> relationshipList) {
		this.relationshipList = relationshipList;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<String> getWebsiteList() {
		return websiteList;
	}

	public void setWebsiteList(List<String> websiteList) {
		this.websiteList = websiteList;
	}
	
	public String getBellSoundName() {
		return this.bellSoundName;
	}
	
	public void setBellSoundName(String bellSoundName) {
		this.bellSoundName = bellSoundName;
	}

	public void save() {
		this.database = new FileHandler("C:\\Users\\User\\Desktop\\contact", 
				"contact_%s.db".formatted(this.id));
		
		List<String> contactString = new ArrayList<>();
		contactString.add("%s```%s```%s```%s```%s"
				.formatted(this.name.get호칭(), this.name.getLastName(), 
						this.name.getMiddleName(), this.name.getFirstName(), 
						this.name.get경칭()));

		database.writeFile(contactString);
		
		this.name.save();
		
		
	}
	
	@Override
	public String toString() {
		return "ContactVO [profilePicture=" + this.profilePicture + ", name=" + this.name + ", speachName=" + this.speachName
				+ ", nickname=" + this.nickname + ", phoneList=" + this.phoneList + ", emailList=" + this.emailList + ", group="
				+ this.group + ", company=" + this.company + ", addressList=" + this.addressList + ", specialdateList="
				+ this.specialDateList + ", relationshipList=" + this.relationshipList + ", memo=" + this.memo + ", websiteList="
				+ this.websiteList + ", bellSoundName=" + this.bellSoundName + "]";
	}

	
	

}
