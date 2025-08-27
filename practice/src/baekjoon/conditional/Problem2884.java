package baekjoon.conditional;

import java.util.Scanner;

public class Problem2884 {
	
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		String[] str = consoleInput.nextLine().split(" ");
		int hour = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[1]);
		
		if((min - 45) > 0) {
			min = min - 45;
		}
		else if((min - 45) == 0) {
			min = 0;
		}
		else {
			hour -= 1;
			min = min + 60 - 45;
		}
		
		if(hour < 0) {
			hour = hour + 24;
		}
		else {
			
		}
		
		System.out.println(hour + " " + min);
	}

}
