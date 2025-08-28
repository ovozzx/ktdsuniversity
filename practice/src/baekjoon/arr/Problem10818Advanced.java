package baekjoon.arr;

import java.util.Scanner;

public class Problem10818Advanced {

	 public static void main(String[] args) {

		 Scanner consoleInput = new Scanner(System.in);
		 
		 int n = consoleInput.nextInt();
		 
		 int min = Integer.MAX_VALUE;
		 int max = Integer.MIN_VALUE;
		 
		 for(int i = 0 ; i < n ; i++) {
			 // 개선 포인트 : nextInt() 반복 사용으로 변경 
			 int num = consoleInput.nextInt();
			 // 개선 포인트 : 값 배열에 저장할 필요 없이 바로 비교 가능
			 if(min > num) min = num;
			 if(max < num) max = num;
			 
		 }
		 
		 System.out.println(min + " " + max);
	      
		 
	    }
}
