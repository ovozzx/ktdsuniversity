package com.ktdsuniversity.edu.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class FileImformation {
	
	public static void main(String[] args) {
		// 8/6 (수) 진도 : 폴더 탐색 (재귀 함수), 파일 생성 및 작성, 파일 읽기, 파일 삭제, 폴더 삭제 (재귀 함수) => 다하면 File DataBase 만들어보기 (만화카페 적용, shop 적용, 쿠팡 적용) 
		
		String directory = "C:\\Users\\User\\Desktop\\javaexam\\";
		String filename = "lyrics.txt";
		//String directory = "C:\Users\User\Desktop\javaexam";
		//String directory = "C:/Users/User/Desktop/javaexam";
		// File 클래스의 빈도.
		// List => 100%, File => 3%
		// 3%?
		// - 디스크에 남아있는 용량이 궁금.
		// - 로그(기록) 파일을 백업.
		// - 오래된 로그 파일 삭제.
		// - 오래된 폴더들을 조회 삭제.
		
		// 폴더의 정보 조회
		// 경로, 크기, 상위 폴더 이름
		File folder = new File(directory + filename);
		System.out.println(folder);
		
		// 폴더인지, 파일인지 여부
		System.out.println("File? " + folder.isFile());
		System.out.println("Folder? " + folder.isDirectory());
		
		// 이 폴더/파일이 정말 존재하는 것인가?
		System.out.println("있는 파일(폴더)?" + folder.exists());
		
		// 폴더가 존재하지 않는다면 만들어라
//		if(!folder.exists()) {
//			folder.mkdirs(); // 폴더 생성하는 명령어
//		}
		
		// 파일이 존재하지 않는다면 만들어라
		if(!folder.exists()) { // checked exception이면 try catch 필요하다!
			try {
				folder.createNewFile();
			}
			catch(IOException ie) {
				
				ie.printStackTrace();
				
			}
		}
		
		// 이 폴더/파일의 크기는 얼마인가? (byte 기준)
		System.out.println("파일(폴더)의 크기? " + folder.length() + "bytes");
		
		// 이 폴더/파일의 이름은?
		System.out.println("파일(폴더)의 이름은? " + folder.getName());
		
		// 이 폴더/파일이 만들어진 날짜는?
		System.out.println("파일(폴더)가 만들어진 날짜? " + folder.lastModified());
		System.out.println("파일(폴더)가 만들어진 날짜? " + new Date(folder.lastModified()));
		/**
		 * 컴퓨터가 시간을 계산하는 방식
		 * 1970-01-01  00:00:00 초 기준.
		 * 이 시점부터 1초당 1000씩 더해서 계산.
		 * 
		 */
		System.out.println("현재 시간? " + System.currentTimeMillis());
		System.out.println("현재 시간? " + new Date(System.currentTimeMillis()));
		
		// 이 폴더/파일이 위치한 절대 경로
		// 컴퓨터 경로 -- 절대경로, 상대경로
		// 	절대경로 : Root Directory부터 아래에 있는 파일이나 폴더가 위치한 전체 경로. 
		// 	상대경로 : Working Directory (현재 작업중인 경로)로 부터 내 폴더나 파일이 위치한 경로.
		System.out.println("이 파일(폴더)의 절대경로 : " + folder.getAbsolutePath());
		// ../javaexam --> 파일을 다룬다. getParent() 매우 중요
		System.out.println("이 파일(폴더)의 상대경로 : " + folder.getParent()); // 위치한 부모의 경로
		
		// 폴더에 있는 모든 정보 (파일 + 폴터) 조회, 출력.
	
		File[] files = new File(directory).listFiles(); // 파일 배열 (폴더로 넣어야하나)
		for(File f : files) {
			System.out.println(f);
		}
	}

}
