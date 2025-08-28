package baekjoon.str;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1152 {
	
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		//while(true) {
			
			
			String[] str = consoleInput.nextLine().trim().split(" ");
			
			//System.out.println(Arrays.toString(str));
			
			String[] empty = new String[1];
			
			if(str[0].isEmpty()) {				
				System.out.println(0);
			}
			else {
				System.out.println(str.length);
			}
		//}
		
	}

}
