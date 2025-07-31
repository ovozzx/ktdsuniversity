package com.ktdsuniversity.edu.exceptions;

public class NumberUtil {

	public static int parseInt(String str) {
		long result = 0;
		
		//if(str.matches("^[0-9]+$")) { // str이 null일 경우 여기서 에러 발생 -> 조건 추가 str != null
		if(str != null && str.matches("^[0-9]+$")) {
			try {
				result = Long.parseLong(str);
			}
			catch(NumberFormatException nfe) {
				result = 0;
			}
		}
		
		return (int) result;
	}
	
	public static Long parseLong(String str) {
		long result = 0;
		
		if(str != null && str.matches("^[0-9]+$")) {
			try {
				result = Long.parseLong(str);
			}
			catch(NumberFormatException nfe) {
				result = 0;
			}
		}
		return result;
	}
	
	public static double parseDouble(String str) {
		double result = 0;
		
		if(str != null && str.matches("^[0-9]+\\.{0,1}[0-9]+(d|D|f|F){0,1}$")) {
			try {				
				result = Double.parseDouble(str);
			}
			catch(NumberFormatException nfe) {
				result = 0;
			}
		}
		
		return result;
	}
	
	public static float parseFloat(String str) { // null pointer 예외 발생 -> string으로 받는데 null이면 
		float result = 0;

		if(str != null && str.matches("^[0-9]+\\.{0,1}[0-9]+(d|D|f|F){0,1}$")) { // 여기에서 에러 발생 .
			try {				
				result = Float.parseFloat(str);
			}
			catch(NumberFormatException nfe) {
				result = 0;
			}
		}
		
		return result;
	}
	
}
