package baekjoon.arr;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1546 {
	
	public static void main(String[] args) {
		
		Scanner consoleInput = new Scanner(System.in);
		
		int n = consoleInput.nextInt();
		consoleInput.nextLine();
		
		String[] scores = consoleInput.nextLine().split(" ");
		//System.out.println(Arrays.toString(scores));
		
		int scoresMax = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			
			if(Integer.parseInt(scores[i]) > scoresMax) {
				scoresMax = Integer.parseInt(scores[i]);
			}
		}
		
		//System.out.println(scoresMax);
		
		double[] newScores = new double[scores.length];
		double sum = 0;
		
		for(int i = 0 ; i < newScores.length ; i++) {
			//System.out.println(Integer.parseInt(scores[i]));
			newScores[i] = 100 * (Integer.parseInt(scores[i]) / (double) scoresMax);
			//System.out.println("* " + newScores[i]);
			sum += newScores[i];
		}
		
		//System.out.println("합 : " + sum);
		//System.out.println(Arrays.toString(newScores));
		System.out.println(sum / (double) newScores.length );
		
		// 코드 개선
		// 11718 번
		// 문자열 문법 지피티
	}

}
