package com.ktdsuniversity.edu.datetime.localdate;

import java.time.LocalTime;

public class LocalTimeExam {
	
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();	
		System.out.println(now);
		
		now = now.plusHours(2);
		System.out.println(now);
		
		now = now.plusHours(15);
		System.out.println(now);
		
	}

}
