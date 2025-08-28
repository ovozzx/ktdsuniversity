package baekjoon.arr;

import java.util.Scanner;

public class Problem10818 {

	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		int n = consoleInput.nextInt();
		consoleInput.nextLine();
		
		String[] arr = consoleInput.nextLine().split(" ");
		int[] intArr = new int[arr.length];
		
		int numMax = Integer.MIN_VALUE;
		int numMin = Integer.MAX_VALUE;
				
		for(int i = 0 ; i < arr.length ;i++) {
			
			intArr[i] = Integer.parseInt(arr[i]);
			
			if(intArr[i] > numMax) {
				numMax = intArr[i];
			}
			
			if(intArr[i] < numMin) {
				numMin = intArr[i];
			}
		}
		
		System.out.println(numMin + " " + numMax);
		
	}
}
