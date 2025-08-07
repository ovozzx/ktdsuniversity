package com.ktdsuniversity.edu.datetime.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarUtil {
	
	public static void addDays(Calendar calendar, int days) {
		calendar.add(Calendar.DAY_OF_MONTH, days);
	}
	
	public static void addWorkingdDays(Calendar calendar, int workingDays) {
		
		// 더하려는 영업일 만큼 반복
		for(int i = 0 ; i < workingDays ; i++) {
			// 반복할 때마다 하루씩 더한다
			calendar.add(Calendar.DAY_OF_MONTH, workingDays); 
			
			// 하루를 더한 결과의 요일이 일요일이거나 토요일이라면 다음 월요일이 나올 때까지 하루씩 더한다
			while (calendar.get(Calendar.DAY_OF_WEEK) == 1
					|| calendar.get(Calendar.DAY_OF_WEEK) == 7
					//||  하루를 더한 결과가 휴일인지? (설날/추석/광복절/임시공유일)
					) {
				calendar.add(Calendar.DAY_OF_MONTH, 1); // 일요일
			}
		
		}
		
	}
	
	public static String toString(Calendar calendar, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(calendar.getTime());
	}
	
	

}
