package com.ktdsuniversity.edu.fileio.recursive;

import java.io.File;

/**
 * 폴더 탐색
 */

public class ExplorePath {
	
	public void printListFiles(String path) { 
	// 폴더 > 폴더 > 폴더로 보고싶으면, 이 함수를 호출하면 됨
		File fileOrDirectory = new File(path);
		File[] list = fileOrDirectory.listFiles();
		for(File f : list) {	
			boolean isDiretory = f.isDirectory();
			System.out.println(f + (isDiretory ? " (D)" : " (F)")); // 3항 연산자
			if(isDiretory) {
				this.printListFiles(f.getAbsolutePath()); // 절대경로
			}
		}			
	}

	public void run(String path) {
		this.printListFiles(path);
	}
	
	public static void main(String[] args) { // 매개변수 null로 들어갔을 것 -> 에러 => 따로 설정
		new ExplorePath().run("C:\\Users\\User\\Desktop\\javaexam");	
	}
	


}
