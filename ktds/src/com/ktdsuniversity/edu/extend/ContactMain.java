package com.ktdsuniversity.edu.extend;

public class ContactMain {
	
	public static void main(String[] args) {
		Contact baseContact = new Contact("sy", "lee", "010-2586-6427");
		
		System.out.println(baseContact.getFirstName());
		System.out.println(baseContact.getLastName());
		System.out.println(baseContact.getPhone());
		baseContact.printContact();
		
		EmailContact emailContact = new EmailContact("아무개", "김", "010-1234-1234", "gamil.com");
		
		System.out.println(emailContact.getFirstName());
		System.out.println(emailContact.getLastName());
		System.out.println(emailContact.getPhone());
		System.out.println(emailContact.getEmail());
		System.out.println(emailContact.getAge());
		emailContact.printContact();
		//emailContact.printEmailContact();
		
		// 서브 클래스가 부모 클래스 타입에 포함되는 것을 허가한다. => "다형성"
		Contact emailContact2 = new EmailContact("이름", "성", "연락처", "이메일");
		System.out.println(emailContact2); 
		// 위 출력은 EmailContact로 나옴 (생성자 영향), 타입은 Contact 실제 값은 emailContact
		// System.out.println(emailContact2.getEmail()); 
		// 타입은 Contact이라서, EmailContact에만 있는 기능은 사용 못 함
		emailContact2.printContact();
		
		System.out.println("=".repeat(50));
		
		ContactPrinter printer = new ContactPrinter();
		printer.printContact(baseContact);
		printer.printEmailContact(emailContact);
		printer.printContact(emailContact2);
		
	}

}
