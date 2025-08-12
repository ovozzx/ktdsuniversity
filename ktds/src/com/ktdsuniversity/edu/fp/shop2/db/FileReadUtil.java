package com.ktdsuniversity.edu.fp.shop2.db;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;


public class FileReadUtil {
	
	public static Stream<String> realLines(String path, String filename){
		
		File file = new File(path, filename);
		
		try {
			//   public static Stream<String> lines(Path path) throws IOException -> 애초부터 Stream으로 줌 -> 더 빠름
			return Files.lines(file.toPath());
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			// 파일이 존재하지 않는다!
			throw new IllegalArgumentException(ioe.getMessage()); // 런타임 
		}
		
	}
	
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
