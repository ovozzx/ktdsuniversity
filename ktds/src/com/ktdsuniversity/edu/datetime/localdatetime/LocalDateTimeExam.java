package com.ktdsuniversity.edu.datetime.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class LocalDateTimeExam {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String nowString = timeFormatter.format(now);
		System.out.println(nowString);
	
		// 다가오는 생일자
		// 2000-01-01
		// 2013-11-02
		
		System.out.println("=".repeat(50));
		
		List<LocalDateTime> birthdays = new ArrayList<>();
		birthdays.add(LocalDateTime.parse("2000-01-01 12:03:15", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		birthdays.add(LocalDateTime.parse("2012-11-05 03:55:12", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		birthdays.add(LocalDateTime.parse("2012-08-10 03:55:12", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		birthdays.add(LocalDateTime.parse("2007-07-26 19:17:34", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		birthdays.add(LocalDateTime.parse("2007-08-06 19:17:34", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		for(LocalDateTime birthday : birthdays) {
			
			birthday = birthday.withYear(LocalDate.now().getYear()); // 올해 년도로 다 바꿔줌
			birthday = birthday.withHour(0); 
			birthday = birthday.withMinute(0); 
			birthday = birthday.withSecond(0); 
			
			int betweenDays = (int) ChronoUnit.DAYS.between(LocalDateTime.now(), birthday); // 날짜 차이                
			
			if(betweenDays <= 7 && betweenDays >= 0) {
			//if(birthday.isAfter(LocalDateTime.now()) && LocalDateTime.now().minusWeeks(1).isAfter(birthday)) { // 미래인지
				System.out.println(betweenDays + 1 + " 일 뒤 생일 → " + birthday);
			}
			
			if(betweenDays == -1) {
				System.out.println("1 일 전 생일 : " + birthday); // 하루 전이면 => 0 일 차이 (시간까지 넣어서 하면)
			}

			
		}
		
	}
}
