package com.ktdsuniversity.edu.phonebook.vo;

/**
 * 연락처의 관계 정보
 */
public class RelationshipVO {

	private int relationshipType;
	private ContactVO linkedContact;
	
	public RelationshipVO() {
		// Nothing...
	}
	
	public RelationshipVO(int relationshipType, ContactVO linkedContact) {
		super();
		this.relationshipType = relationshipType;
		this.linkedContact = linkedContact;
	}

	public int getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(int relationshipType) {
		this.relationshipType = relationshipType;
	}

	public ContactVO getLinkedContact() {
		return linkedContact;
	}

	public void setLinkedContact(ContactVO linkedContact) {
		this.linkedContact = linkedContact;
	}

	@Override
	public String toString() {
		return "RelationshipVO [relationshipType=" + this.relationshipType + ", linkedContact=" + this.linkedContact + "]";
	}
	
	
	
	
	//private String ???; // 링크?? (ex) 대상의 부모님 
	// TODO 연락처 링크 필요
}
