package com.ktdsuniversity.edu.fileio.recursive;

import java.io.File;

/**
 * 재귀호출
 */
public class RecursiveCallExam {
	
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
	
	public void stackOverflow(int count) {
		System.out.println("before : " + count);
		
		if(count < 10) {// 종료 지점 -> 없으면 에러남
			this.stackOverflow(count + 1); 
		}
		
		System.out.println("after : " + count); // 위에 스택이 빠지면서, 밑에 쌓였던 스택이 실행되어서 숫자가 줄어들음
	}
	
	public static void main(String[] args) { // 매개변수 null로 들어갔을 것 -> 에러 => 따로 설정
		//new RecursiveCallExam().run(args[0]);
		new RecursiveCallExam().stackOverflow(0); // 콘솔에 표시할 수 있는 양 제한
	}
	
}
