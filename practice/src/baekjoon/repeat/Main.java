package baekjoon.repeat;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		int n = consoleInput.nextInt();
		consoleInput.nextLine();  // <-- 여기가 핵심! 줄바꿈 문자 제거
		
		for(int i = 0 ; i < n ; i++){
			String[] str = consoleInput.nextLine().split(" ");
				
			System.out.println(Integer.parseInt(str[0]) 
						       + Integer.parseInt(str[1]));
	
		}
		
	}

}
