package com.ktdsuniversity.edu.fileio;

import java.io.File;

/**
 * 파일 삭제
 */
public class RemoveFile {

	public static void main(String[] args) {
		
		String targetPath = "C:\\Users\\User\\Desktop\\javaexam";
		String targetFilename = "lyrics.txt";
		
		File file = new File(targetPath, targetFilename);
		file.delete();
		
	}
	
}
