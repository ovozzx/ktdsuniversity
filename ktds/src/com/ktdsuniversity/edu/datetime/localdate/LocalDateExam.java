package com.ktdsuniversity.edu.datetime.localdate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class LocalDateExam {
	
	public static void main(String[] args) {
		
		// 현재 날짜 가져오기
		LocalDate now = LocalDate.now();
		System.out.println(now);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String nowString = formatter.format(now);
		
		// 2025년 8월 7일
		System.out.println(nowString);
		
		int nowYear = now.getYear();
		System.out.println(nowYear);
		
		int nowMonth = now.getMonthValue();
		System.out.println(nowMonth);

		int nowDay= now.getDayOfMonth();
		System.out.println(nowDay);
		
		// 2025년 8월 8일
		now = LocalDate.parse("2024-02-26");
		System.out.println(now);
		
		System.out.println(now.plusDays(1));
		System.out.println(now.plusMonths(1));
		System.out.println(now.plusYears(1));
		
		LocalDate birthdate = LocalDate.parse("1996-07-04");
		LocalDate present = LocalDate.now();
		
		Period period = Period.between(birthdate, present);
		System.out.println(period);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		long days = ChronoUnit.DAYS.between(birthdate, present);
		System.out.println("D+ " + days);
	}

}
