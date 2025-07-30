package com.ktdsuniversity.edu.extend;

public class ContactPrinter {

	public void printContact(Contact contact) {
		contact.printContact(); // 이렇게 하면 instanceof 안 써도됨, instanceof는 필요할 때만 쓰기
		// 1. contact에 담긴 인스턴스의 타입이 Contact일 때 실행
		
		/*
		if (contact instanceof EmailContact emailContact) { // 마지막 sub 클래스가 주가되어서 검사 필요
			emailContact.printEmailContact();
		}	
		//if(contact instanceof Contact) { // contact가 contact인가
		else {
			contact.printContact();			
		}*/
		
		//else if(contact instanceof EmailContact emailContact) {
		//	emailContact.printEmailContact();
		//}
		// 2. contact에 담긴 인스턴스의 타입이 EmailCOntact일 때 실행
		
	}
	
	public void printEmailContact(EmailContact emailContact) {
		emailContact.printContact();
	}
}
