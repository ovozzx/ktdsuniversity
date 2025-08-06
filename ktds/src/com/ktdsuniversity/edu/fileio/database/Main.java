package com.ktdsuniversity.edu.fileio.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		FileHandler database = new FileHandler("C:\\Users\\User\\Desktop\\filedatabase", "test.db");
		List<String> writeLine = database.readFile();
		
		Scanner consoleInput = new Scanner(System.in); // 외부 시스템 -> 파이프 없애야 함
	
		while(true) {
			System.out.println("파일의 내용을 입력하세요.");
			String line = consoleInput.next();
			writeLine.add(line);
			
			System.out.println("파일에 작성하시겠습니까? (y/n) ");
			String yn = consoleInput.next();
			if(yn.equalsIgnoreCase("Y")) {
				database.writeFile(writeLine);
			}
			
			System.out.println("종료하실래요? (y/n)");
			yn = consoleInput.next();
			if(yn.equalsIgnoreCase("Y")) {
				break;
			}
		}
		
		consoleInput.close(); // 메모리 누수 방지
		
	}

}
