package com.ktdsuniversity.edu.contact;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.ktdsuniversity.edu.contact.util.InputUtil;
import com.ktdsuniversity.edu.contact.util.MenuUtil;
import com.ktdsuniversity.edu.contact.util.StringUtil;
import com.ktdsuniversity.edu.contact.vo.AddressVO;
import com.ktdsuniversity.edu.contact.vo.CompanyVO;
import com.ktdsuniversity.edu.contact.vo.ContactVO;
import com.ktdsuniversity.edu.contact.vo.EmailVO;
import com.ktdsuniversity.edu.contact.vo.NameVO;
import com.ktdsuniversity.edu.contact.vo.PhoneVO;
import com.ktdsuniversity.edu.contact.vo.RelationshipVO;
import com.ktdsuniversity.edu.contact.vo.SpeachNameVO;
import com.ktdsuniversity.edu.contact.vo.SpecialDateVO;


public class ContactApp {
	
	private List<ContactVO> contactList; // 여러개의 연락처

	public ContactApp() {
		this.contactList = new ArrayList<>();
	}
	
	public List<ContactVO> search(String searchKeyword) {
		List<ContactVO> searchResult = new ArrayList<>();
		
		for (ContactVO each: this.contactList) {
			NameVO name = each.getName();
			SpeachNameVO speachName = each.getSpeachName();
			String nickname = each.getNickname();
			List<PhoneVO> phoneList = each.getPhoneList();
			List<EmailVO> emailList = each.getEmailList();
			String group = each.getGroup();
			CompanyVO company = each.getCompany();
			List<AddressVO> addressList = each.getAddressList();
			List<SpecialDateVO> specialDateList = each.getSpecialDateList();
			String memo = each.getMemo();
			List<String> websiteList = each.getWebsiteList();
			
			if (name != null && name.match(searchKeyword) ) {
				searchResult.add(each);
			}
			else if (speachName != null && speachName.match(searchKeyword)) {
				searchResult.add(each);
			}
			else if (nickname != null && nickname.contains(searchKeyword) ) {
				searchResult.add(each);
			}
			else if (group != null && group.contains(searchKeyword) ) {
				searchResult.add(each);
			}
			else if (company != null && company.match(searchKeyword) ) {
				searchResult.add(each);
			}
			else if (memo != null && memo.contains(searchKeyword) ) {
				searchResult.add(each);
			}
			
			if (phoneList != null) {
				for (PhoneVO eachPhone: phoneList) {
					if (eachPhone != null && eachPhone.match(searchKeyword)) {
						searchResult.add(each);
						break;
					}
				}
			}
			
			if (emailList != null) {
				for (EmailVO eachEmail: emailList) {
					if (eachEmail != null && eachEmail.match(searchKeyword)) {
						searchResult.add(each);
						break;
					}
				}
			}
			
			if (addressList != null) {
				for (AddressVO eachAddress: addressList) {
					if (eachAddress != null && eachAddress.match(searchKeyword)) {
						searchResult.add(each);
						break;
					}
				}
			}
			
			if (specialDateList != null) {
				for (SpecialDateVO eachSpecialDate: specialDateList) {
					if (eachSpecialDate != null && eachSpecialDate.match(searchKeyword)) {
						searchResult.add(each);
						break;
					}
				}
			}
			
			if (websiteList != null) {
				for (String eachWebsite: websiteList) {
					if (eachWebsite != null && eachWebsite.contains(searchKeyword)) {
						searchResult.add(each);
						break;
					}
				}
			}
		}
		
		return searchResult;
	}

	private void addContact() {
		// TODO 연락처 추가 프로세스
		String id = UUID.randomUUID().toString();
		
		ContactVO newContact = new ContactVO();
		newContact.setId(id);
		
		// 1. 프로필 사진을 입력.
//		System.out.println("프로필 사진을 선택하세요. > ");
//		String path = MenuUtil.INPUT.next();
		String path = InputUtil.next("프로필 사진을 선택하세요. > "); // 자주 쓸 것들 따로 빼서 이렇게 줄일 수 있음
		if(! StringUtil.isEmpty(path)) {
			File profile = new File(path);
			newContact.setProfilePicture(profile);
		}
		
		
		// 2. 이름 객체 생성 및 입력 NAMEVO
		NameVO nameVO = NameVO.createNewInstance();
		newContact.setName(nameVO);
		
		// 유틸화
//		String lastName = InputUtil.next("이름을 입력하세요. > ", true);
//		nameVO.setLastName(lastName); // true니까 값이 있음
////		while(true) { // 이름 입력할 때까지 (마름모)
////			String lastName = InputUtil.next("이름을 입력하세요. > ");
////			if(StringUtil.isEmpty(lastName)) {
////				nameVO.setLastName(lastName);
////				break; // 입력할 때까지 돌림 
////			}
////		}
//		String 경칭 = InputUtil.next("경칭을 입력하세요. > "); // 단발성 조건
//		if(! StringUtil.isEmpty(경칭)) {
//			nameVO.set경칭(경칭);
//		}
//		
//		newContact.setName(nameVO);
		
		//3. 소리나는 대로 입력을 할것인지 말것인지 결정짓도록 한다.
		boolean doInputSpeachName = InputUtil.nextYn("소리나는대로 이름을 등록하시겠습니까?");
		if(doInputSpeachName) {
			// 3-1. 소리나는 대로 입력을 받는다
			SpeachNameVO speachNameVO = SpeachNameVO.createNewInstance();
			newContact.setSpeachName(speachNameVO);
		}
		
		// 4. 별명을 입력받는다.
		boolean doInputNickname = InputUtil.nextYn("별명을 입력하시겠습니까?");
		if(doInputNickname) {
			String nickname = InputUtil.next("별명을 입력하세요. > ");
			newContact.setNickname(nickname);
		}
		
		// 5. 연락처 입력
		List<PhoneVO> phoneList = new ArrayList<>();
		while(true) {
			PhoneVO phoneVO = PhoneVO.createNewInstance();
			phoneList.add(phoneVO);
			
			boolean doInputPhone = InputUtil.nextYn("다음 연락처를 등록하시겠습니까?");
			if(!doInputPhone) {
				break;
			}
		}
		
		newContact.setPhoneList(phoneList);
		
		// 6. 이메일을 등록한다
		// 반복됨 -> 제네릭 떠올리기 하지만 적용 어려움.. 인터페이스!
		
		// 6. 이메일을 등록한다.
				boolean doInputEmail = InputUtil.nextYn("이메일을 입력하시겠습니까?");
				if (doInputEmail) {
					List<EmailVO> emailList = new ArrayList<>();
					while (true) {
						EmailVO emailVO = EmailVO.createNewInstance();
						emailList.add(emailVO);
						
						boolean doInputNextEmail = InputUtil.nextYn("다음 이메일을 등록하시겠습니까?");
						if (!doInputNextEmail) {
							break;
						}
					}
					newContact.setEmailList(emailList);
				}
				
				// 7. 그룹 입력
				boolean doInputGroup = InputUtil.nextYn("그룹을 입력하시겠습니까?");
				if (doInputGroup) {
					String group = InputUtil.next("그룹을 입력하세요. > ", true);
					newContact.setGroup(group);
				}
				
				// 8. 직장 입력
				boolean doInputCompany = InputUtil.nextYn("직장 정보를 입력하시겠습니까?");
				if (doInputCompany) {
					CompanyVO company = CompanyVO.createNewInstance();
					newContact.setCompany(company);
				}
				
				// 9. 주소 입력.
				boolean doInputAddress = InputUtil.nextYn("주소 정보를 입력하시겠습니까?");
				if (doInputAddress) {
					List<AddressVO> addressList = new ArrayList<>();
					
					while (true) {
						AddressVO address = AddressVO.createNewInstance();
						addressList.add(address);
						
						boolean doInputNextAddress = InputUtil.nextYn("다음 주소 정보를 입력하시겠습니까?");
						if (!doInputNextAddress) {
							break;
						} 
					}
					
					newContact.setAddressList(addressList);
				}
				
				// 10. 중요한 날 정보를 입력받는다.
				boolean doInputSpecial = InputUtil.nextYn("중요한 날 정보를 입력하시겠습니까?");
				if (doInputSpecial) {
					List<SpecialDateVO> specialDateList = new ArrayList<>();
					
					while (true) {
						SpecialDateVO specialDate = SpecialDateVO.createNewInstance();
						specialDateList.add(specialDate);
						
						boolean doInputNextSpecialDate = InputUtil.nextYn("다음 중요한 날 정보를 입력하시겠습니까?");
						if (!doInputNextSpecialDate) {
							break;
						}
					}
					
					newContact.setSpecialDateList(specialDateList);
				}
				
				// 11. 관계 정보를 입력받는다.
				boolean doInputRelationship = InputUtil.nextYn("관계 정보를 입력하시겠습니까?");
				if (doInputRelationship) {
					List<RelationshipVO> relationshipList = new ArrayList<>();
					
					while (true) {
						RelationshipVO relationship = RelationshipVO.createNewInstance(this);
						relationshipList.add(relationship);
						
						boolean doInputNextRelationship = InputUtil.nextYn("다음 관계 정보를 입력하시겠습니까?");
						if (!doInputNextRelationship) {
							break;
						}
					}
					
					newContact.setRelationshipList(relationshipList);
				}
				
				// 12. 메모를 입력받는다.
				boolean doInputMemo = InputUtil.nextYn("메모 정보를 입력하시겠습니까?");
				if (doInputMemo) {
					String memo = InputUtil.next("메모를 입력하세요. > ", true);
					newContact.setMemo(memo);;
				}
				
				// 13. 웹 사이트를 입력받는다.
				boolean doInputWebsite = InputUtil.nextYn("웹사이트 정보를 입력하시겠습니까?");
				if (doInputWebsite) {
					List<String> websiteList = new ArrayList<>();
					while (true) {
						String website = InputUtil.next("URL을 입력하세요. > ", true);
						websiteList.add(website);
						
						boolean doInputNextWebsite = InputUtil.nextYn("다음 웹 사이트정보를 입력하시겠습니까?");
						if (!doInputNextWebsite) {
							break;
						}
					}
					
					newContact.setWebsiteList(websiteList);
				}
				
				this.contactList.add(newContact);
		
			
		newContact.save();
		
		System.out.println(newContact);
		
	}
	
	public void run() {
		
		// 1. contact~~.db 파일을 읽어온다
		// 2. ContactVO로 변경한 뒤 this.contactList에 add 한다
		// 3. name~~.db 파일을 일겅온다
		// 4. NameVO로 변경한 뒤 ContactVO에 setName() 한다
		
		File dbDir = new File("C:\\Users\\User\\Desktop\\contact");
		
		if(dbDir.exists()) {
			File[] dbFiles = dbDir.listFiles();
			if(dbFiles != null) {
				
				for(File db : dbFiles) {
					if(db.getName().startsWith("contact_")) {
						List<String> lines = new ArrayList<>();
						try {							
							lines.addAll(Files.readAllLines(db.toPath()));
						}
						catch(IOException ioe){}
						
						ContactVO contact = new ContactVO();
						
						String[] data = lines.get(0).split("```");
						contact.setId(data[0]);
						contact.setNickname(data[1]);
						contact.setGroup(data[2]);
						contact.setMemo(data[3]);
						contact.setBellSoundName(data[4]);
						
						this.contactList.add(contact);
					}
					
				}
			}
		}
		
		while(true) {	
			int menu = MenuUtil.printAndSelectContactAppMenu();
			if(!MenuUtil.isValidMenu(menu)) {
				System.out.println("잘못된 메뉴입니다.");
			}
			else if (MenuUtil.isQuitApp(menu)) {
				break;
			}
			else if(MenuUtil.addContact(menu)) {
				// 연락처 추가 기능 수행
				this.addContact();
			}
		}
	}
	
	public static void main(String[] args) {
		
		// 현재 시간 (나노 Seconds)를 기반해서 난수를 생성 (중복 없음)
		System.out.println(UUID.randomUUID().toString());
		
		new ContactApp().run();
		
	}
	
}
