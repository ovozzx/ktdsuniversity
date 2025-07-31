package com.ktdsuniversity.edu.exceptions;

public class NumberUtil {

	public static int parseInt(String str) {
		int result = 0;
		
		if(str.matches("^[0-9]+$")) {
			long tempNumber = Long.parseLong(str);
			if(tempNumber <= Integer.MAX_VALUE
					&& tempNumber >= Integer.MIN_VALUE) {
				result = (int) tempNumber;
			}
			
		}
		
		return result;
	}
	
	public static Long parseLong(String str) {
		long result = 0;
		
		if(str.matches("^[0-9]+$")) {
			result = Long.parseLong(str);
	
		}
		
		return result;
	}
	
	public static double parseDouble(String str) {
		double result = 0;
		
		if(str.matches("^[0-9]+\\.{0,1}[0-9]+(d|D|f|F){0,1}$")) {
			result = Double.parseDouble(str);
		}
		
		return result;
	}
	
	public static float parseFloat(String str) {
		float result = 0;
		
		if(str.matches("^[0-9]+\\.{0,1}[0-9]+(d|D|f|F){0,1}$")) {
			result = Float.parseFloat(str);
		}
		
		return result;
	}
	
}
