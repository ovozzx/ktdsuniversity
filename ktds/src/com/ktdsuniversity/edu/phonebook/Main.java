package com.ktdsuniversity.edu.phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ktdsuniversity.edu.phonebook.constants.PhoneType;

import com.ktdsuniversity.edu.phonebook.vo.PhoneVO;
import com.ktdsuniversity.edu.phonebook.vo.ContactVO;
import com.ktdsuniversity.edu.phonebook.vo.NameVO;
import java.io.File;


public class Main {


	public static void main(String[] args) {

		// person() -> 기능
		// 파일 db 쓰기
		
		// 생성자(생성자 1(), list(생성자()), ... )
		System.out.println(PhoneType.CELL_PHONE);
		
		List<PhoneVO> phoneList = new ArrayList<>();
		phoneList.add(new PhoneVO(PhoneType.CELL_PHONE, "010-2586-6427"));
		
		// 사람 1명 추가 
		ContactVO contact =  new ContactVO(null, 
										   new NameVO("베프", "이", null, "소영", null), 
										   null,
										   "또영",
										   phoneList,
										   //new ArrayList<>(Arrays.asList(new PhoneVO(PhoneType.CELL_PHONE, "010-2586-6427"))),
										   //new ArrayList<>(new PhoneVO(PhoneType.CELL_PHONE, "010-2586-6427")), // phoneList
										   null, // emailList
										   null, // group
										   null, // company
										   null, // addressList
										   null, // specialdateList
										   null, // relationshipList
										   "자기 자신", // memo
										   null, // websiteList
										   "띠링" //bellSoundName
		);
		
		System.out.println(contact);
		
	}
}

