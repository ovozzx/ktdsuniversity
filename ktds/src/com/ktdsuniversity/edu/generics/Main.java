package com.ktdsuniversity.edu.generics;

import com.ktdsuniversity.edu.market.Customer;

public class Main {
	
	public static void main(String[] args) {
		
		Scores<Integer> scores = new Scores<>(30); // A => Integer
		scores.add(1030); // 0, 매개변수 역시 Integer
		scores.add(2030); // 1
		scores.add(3030); // 2
		
		System.out.println(scores);
		System.out.println(scores.get(0));
		System.out.println(scores.get(1));
		System.out.println(scores.get(2));
		System.out.println(scores.get(3));
		
		scores.printElements();
		
		//                R    , E 
		GenericsPrinter<String, Integer> gp = new GenericsPrinter<>(); // <>로 대체가 된다
		String message = gp.getMessage("반갑습니다", 50); // return : String됨 (요구하는대로 바뀜_
		System.out.println(message);
		
		PrintMessage pm = new PrintMessage();
		pm.print("안녕하세요?");
		pm.print(123);
		
		Customer customer = new Customer();
		pm.print(customer);
		
		GenericPrintMessage gpm = new GenericPrintMessage();
		gpm.print("ㅇㅁㅇ"); // 무엇이든 들어갈 수 있음 (T 대신 들어갈 것), object로 결정됨
		
		GenericPrintMessage<Integer> gpm2 = new GenericPrintMessage<Integer>(); // T가 Integer로 바뀜 (자바 몇 이후부터 생성자에 있는 뭐 숨길 수 있음)
		gpm2.print(4934); // 이것만 Integer로 바뀌어있음
		
		GenericPrintMessage<String> gpm3 = new GenericPrintMessage<String>(); // 
		gpm3.print("dads"); // 이것만 Integer로 바뀌어있음
		
		GenericPrintMessage<Customer> gpm4 = new GenericPrintMessage<Customer>(); // 
	
		
	}

}
