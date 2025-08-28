package baekjoon.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10811 {
	
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
				
			int[] temp = new int[endNum - startNum + 1];
			temp = (Arrays.copyOfRange(arr, startNum - 1, endNum)); // 끝 인덱스는 제외 

			int k = temp.length;
			for(int j = startNum ; j <= endNum ; j++) {
				arr[j - 1] = temp[k - 1];
				k -= 1;
			}
		
		}
		
		for(int i = 0 ; i < boxCount ; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	
}

}
