package com.ktdsuniversity.edu.generics;

import com.ktdsuniversity.edu.market.Customer;

public class PrintMessage {
	
	public void print(String message){
		System.out.println(message);
	}

	public void print(int message) { // 오버로딩
		System.out.println(message);
	}
	
	public void print(Customer customer) {
		System.out.println(customer);
	}
}
