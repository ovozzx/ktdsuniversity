package baekjoon.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2444 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int charCnt = n * 2 - 1;
		
		List<String> list = new ArrayList<>();
		List<String> smallList = new ArrayList<>();
		
		for(int j = 0 ; j < charCnt ; j++) {
			smallList.add(" ");
		}
		
		smallList.set(n-1, "*");
		list.add(String.join("", smallList).substring(0, n));
//		System.out.println(list.toString());
		
		for(int i = 1 ; i < n ; i++) {
			
			for(int j = n - (i+1) ; j < n - 1 ; j++) {
				smallList.set(j, "*");
			}
			
			for(int k = n ; k < n + i ; k++) {
				smallList.set(k, "*");
			}	
			
			list.add(String.join("", smallList).substring(0, n + i));
			//System.out.println(list.toString());
//			System.out.println(list.toString());
	   }
		
	   for(int i = 0 ; i < list.size() ; i++) {
		   System.out.println(list.get(i));
	   }
	   for(int i = list.size() - 2 ; i >= 0 ; i--) {
		   System.out.println(list.get(i));
	   }
		
	}

}

