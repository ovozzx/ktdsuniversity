package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner consoleInput = new Scanner(System.in);
		String number = consoleInput.nextLine(); // 공백 포함 전체 문자열을 읽음 

		String[] numberArr = number.split(" ");
		int a = Integer.parseInt(numberArr[0]);
		int b = Integer.parseInt(numberArr[1]);
		
		if(a < b) {
			System.out.println("<");
		}
		else if(a > b) {
			System.out.println(">");
		}
		else {
			System.out.println("==");
		}

	}
	
}
