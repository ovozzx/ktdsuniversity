package baekjoon.str;

import java.util.Scanner;

public class Problem2675 {

	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		int n = consoleInput.nextInt();
		consoleInput.nextLine();
		
		for(int i = 0 ; i < n ; i++) {
			
			int repeatNum = Integer.parseInt(consoleInput.next());
			String str = consoleInput.next();
			
			String newStr = "";
			
			for(int j = 0 ; j < str.length() ; j++) {
				
				for(int k = 0 ; k < repeatNum ; k++) {					
					newStr += str.substring(j, j+1) ; // 새로운 문자열을 생성 
				}
				
			}
			
			System.out.println(newStr);
		}
		
	}
}
