package com.ktdsuniversity.edu.contact.vo;

import java.util.List;

import com.ktdsuniversity.edu.contact.ContactApp;
import com.ktdsuniversity.edu.contact.util.InputUtil;
import com.ktdsuniversity.edu.contact.util.MenuUtil;


/**
 * 연락처의 관계 정보
 */
/**
 * 연락처의 관계 정보
 */
public class RelationshipVO {

	private int relationshipType;
	private ContactVO linkedContact;
	
	public RelationshipVO() {
		// Nothing..
	}
	
	public RelationshipVO(int relationshipType, ContactVO linkedContact) {
		this.relationshipType = relationshipType;
		this.linkedContact = linkedContact;
	}

	public int getRelationshipType() {
		return this.relationshipType;
	}

	public void setRelationshipType(int relationshipType) {
		this.relationshipType = relationshipType;
	}

	public ContactVO getLinkedContact() {
		return this.linkedContact;
	}

	public void setLinkedContact(ContactVO linkedContact) {
		this.linkedContact = linkedContact;
	}

	public static RelationshipVO createNewInstance(ContactApp app) {
		int menu = 0;
		while (true) {
			menu = MenuUtil.printAndSelectRelationshipMenu();
			if ( MenuUtil.isValidRelationshipMenu(menu) ) {
				break;
			}
		}
		
		RelationshipVO relationshipVO = new RelationshipVO();
		relationshipVO.setRelationshipType(menu);
		
		// searchKeyword : 이름, 전화번호, 이메일, 메모, ....
		String searchKeyword = InputUtil.next("검색어를 입력하세요.", true);
		
		List<ContactVO> searchList = app.search(searchKeyword);
		for (int i = 0; i < searchList.size(); i++) {
			NameVO name = searchList.get(i).getName();
			PhoneVO phone = searchList.get(i).getPhoneList().get(0);
			System.out.println("%d. %s - %s"
								.formatted(i, name.getLastName(), 
										  phone.getPhoneNumber()));
		}
		int index = InputUtil.nextInt("연락처의 번호를 입력하세요. > ");
		
		if (index >= 0 && index < searchList.size()) {
			relationshipVO.setLinkedContact(searchList.get(index));
		}
		return relationshipVO;
	}
	
	
	@Override
	public String toString() {
		return "RelationshipVO [relationshipType=" + this.relationshipType 
				+ ", linkedContact=" + this.linkedContact + "]";
	}

	
}