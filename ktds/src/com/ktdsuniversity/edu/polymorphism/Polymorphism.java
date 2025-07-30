package com.ktdsuniversity.edu.polymorphism;

import com.ktdsuniversity.edu.extend.Contact;
import com.ktdsuniversity.edu.extend.EmailContact;

// import 자동화 단축키 : Ctrl + Shift + O (Command + Shift + O) 

public class Polymorphism {
	
	public static void main(String[] args) {
		
		/**
		 * 다형성
		 * 서브 클래스의 인스턴스가 부모 클래스의 타임으로 포함(할당)되는 것을 허가한다.
		 * = 서브 클래스의 인스턴스는 슈퍼 클래스의 인스턴스에 할당될 수 있다.
		 * = Sub Class is a Super Class
		 * 
		 * 다만, 서브 클래스의 인스턴스를 슈퍼 클래스의 인스턴스에 할당했을 경우
		 * 서브 클래스의 멤버변수나 메소드들은 실행할 수 없다!
		 * 슈퍼 클래스에는 서브 클래스의 멤버변수나 메소드가 없기 때문.
		 * ==> 해결 위해서, instanceof 연산자가 필요했다.
		 * 
		 * Overriding을 통해서 서브 클래스에서 슈퍼 클래스로 접근을 한다 (instanceof의 중첩을 막음)
		 * ==> 서브 클래스는 슈퍼 클래스를 통해서 자신의 기능을 수행한다.
		 * 
		 */
		
		Contact contact = new Contact("A","B","C");
		System.out.println(contact);
		
		String contactDescription = contact.toString();
		System.out.println(contactDescription);
		
		System.out.println(contactDescription.equals("abc"));
		
		// Object <-- 모든 클래스의 Super class (정수, 문자열, ...)
		Object obj = new Contact("A", "B", "C");
		Object number = 1;
		
		Contact otherContact = new Contact("A", "B", "C");
		System.out.println(contact.equals(otherContact));
		
		Contact emailContact = new EmailContact("A", "B", "C", "D");
		
		contact.printContact();
		otherContact.printContact();
		emailContact.printContact(); // super.printContact(); -> 결국 Contact의 것이 실행됨
	}

}
