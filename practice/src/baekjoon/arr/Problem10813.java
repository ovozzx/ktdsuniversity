package baekjoon.arr;

import java.util.Scanner;

public class Problem10813 {
	
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		String[] str = consoleInput.nextLine().split(" ");
		
		int boxCount = Integer.parseInt(str[0]);
		int changeCount = Integer.parseInt(str[1]);
		
		int[] arr = new int[boxCount];
		
		for(int i = 1 ; i <= boxCount ; i++) {
			arr[i - 1] = i;
		}
		
		for(int i = 0 ; i < changeCount ; i++) {
			String[] change = consoleInput.nextLine().split(" ");
			int startNum = Integer.parseInt(change[0]);
			int endNum = Integer.parseInt(change[1]);
			int temp = arr[startNum - 1];
			arr[startNum - 1] = arr[endNum - 1];
			arr[endNum - 1] = temp;
		
		}
		
		for(int i = 0 ; i < boxCount ; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	
	}

}
