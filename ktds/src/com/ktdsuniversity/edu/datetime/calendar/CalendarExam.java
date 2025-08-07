package com.ktdsuniversity.edu.datetime.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Calendar로 현재 시간 가져오기
		 * 
		 */
		Calendar now = Calendar.getInstance(); // 캘린더의 복사본을 가져옴
		System.out.println(now);
		//int year = now.get(1); // 1 -> year (상수화)
		int year = now.get(Calendar.YEAR); // 1 -> year (상수화)
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH) + 1; 
		System.out.println(month);
		
		int date = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);
		
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = now.get(Calendar.SECOND);
		System.out.println(second); // 현재 PC의 시간을 복사해서 가져옴
		
		int day = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(day); // 요일 -> 숫자로 나옴 (일 = 1, 월 = 2, ..., 금 = 6, 토 = 7)
		
		String[] dayString = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(dayString[day-1] + " 요일");
		
		// Calendar를 이용한 달력 만들기
		// 	현재 월의 마지막 날짜?
		int maxDate = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDate);
		
		/**
		 * 
		 * Calendar로 특정 시간 지정하기
		 *
		 */
		Calendar anniversaryDay = Calendar.getInstance(); // 캘린더의 복사본을 가져옴
		anniversaryDay.set(2024, 2 - 1, 1, 13, 58, 34); // 1이 2월임
		System.out.println(anniversaryDay);
		year = anniversaryDay.get(Calendar.YEAR); // 1 -> year (상수화)
		System.out.println(year);
		
		month = anniversaryDay.get(Calendar.MONTH) + 1; 
		System.out.println(month);
		
		date = anniversaryDay.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);
		
		hour = anniversaryDay.get(Calendar.HOUR);
		System.out.println(hour);
		
		minute = anniversaryDay.get(Calendar.MINUTE);
		System.out.println(minute);
		
		second = anniversaryDay.get(Calendar.SECOND);
		System.out.println(second); // 현재 PC의 시간을 복사해서 가져옴
		
		day = anniversaryDay.get(Calendar.DAY_OF_WEEK);
		System.out.println(day); // 요일 -> 숫자로 나옴 (일 = 1, 월 = 2, ..., 금 = 6, 토 = 7)
		
		//dayString = new String{"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(dayString[day-1] + " 요일");
	
		
		// Calendar를 이용한 달력 만들기
		// 	현재 월의 마지막 날짜?
		maxDate = anniversaryDay.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDate); // 29일 (윤달)
		
		// Calendar를 이용해서 영업일 구하기
		// 	- 구매일로부터 2 영업일 이내로 배송 완료 보장!
		// - 영업일 : 주말  / 휴일을 제외한 업무일
		//	 금요일 + 2영업일 ==> 화요일
		Calendar baseDate = Calendar.getInstance();
		//  목 + 2 영업일 ==> 월요일
		// baseDate.add(Calendar.DAY_OF_MONTH, 2)
		
		
		//int dayOfWeek = baseDate.get(Calendar.DAY_OF_MONTH);
		// 1 : 일요일 ~
//		if (dayOfWeek != 1 && dayOfWeek != 7) {
//			
//		}
		
		baseDate.add(Calendar.DAY_OF_MONTH, 2);
		
		while (baseDate.get(Calendar.DAY_OF_WEEK) == 1
				|| baseDate.get(Calendar.DAY_OF_WEEK) == 7) {
			baseDate.add(Calendar.DAY_OF_MONTH, 1); // 일요일
		}
		
		// Canlendar를 String으로 변환
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String nextWorkingDay = dateFormat.format(new Date(baseDate.get(Calendar.DAY_OF_MONTH)));
		System.out.println(nextWorkingDay);
		
		Calendar nowDate = Calendar.getInstance();
		CalendarUtil.addWorkingdDays(nowDate, 10);
		
		String dateString = CalendarUtil.toString(nowDate, nextWorkingDay);
		System.out.println(dateString);
				
	}

}
