package com.ktdsuniversity.edu.fileio.database;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class FileReadUtil {
	
	public static List<String> readAllLines(String path, String filename){// util이라 static 붙임
		
		File file = new File(path, filename);
		
		try {
			return Files.readAllLines(file.toPath());
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			// 파일이 존재하지 않는다!
			throw new IllegalArgumentException(ioe.getMessage()); // 런타임 
		}
	}

}
