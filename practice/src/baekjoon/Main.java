package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int charCnt = n * 2 - 1;
		
		List<String> list = new ArrayList<>();
		
		for(int j = 0 ; j < charCnt ; j++) {
			list.add(" ");
		}
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j = n - (i-1) ; j < n ; j++) {
				list.set(j, "*");
			}
			
			for(int k = n ; k < n + i ; k++) {
				list.set(k, "*");
			}	
			System.out.println(list.toString());
	
		}
	}
	
}
