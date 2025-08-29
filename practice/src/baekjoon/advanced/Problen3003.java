package baekjoon.advanced;

import java.util.Scanner;

public class Problen3003 {

	public static void main(String[] args) {
		
		// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		Scanner consoleInput = new Scanner(System.in);
		
		int kingNum = 1; 
		int queenNum = 1; 
		int lookNum = 2; 
		int shopNum = 2; 
		int nightNum = 2; 
		int ponNum = 8; 
		
		int king = consoleInput.nextInt(); 
		int queen = consoleInput.nextInt(); 
		int look = consoleInput.nextInt(); 
		int shop = consoleInput.nextInt(); 
		int night = consoleInput.nextInt(); 
		int pon = consoleInput.nextInt(); 
		
		System.out.print(kingNum - king + " ");
		System.out.print(queenNum - queen + " ");
		System.out.print(lookNum - look + " ");
		System.out.print(shopNum - shop + " ");
		System.out.print(nightNum - night + " ");
		System.out.print(ponNum - pon);
	}
	
}
