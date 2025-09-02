package baekjoon.advanced;

import java.util.Scanner;

public class Problem2444 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int blankCnt = n - 1;
		String star = "";
		for(int i = 0 ; i < n ; i++) {
			String blankStr = "";
			
			for(int j = 0 ; j < blankCnt ; j++) {
				blankStr += " ";
			}
			//System.out.println(blankStr + "*");
			blankCnt--;
			
			for(int k = 0 ; k < blankCnt ; k++) {
				star += "*";
			}
			System.out.println(blankStr + star);
		}
		
	}

}


