package com.ktdsuniversity.edu.contact.database;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileWriteUtil {

	public static void writeLines(String path, String filename, List<String> lines) {
		
		File file = new File(path, filename);
		
		if(!file.getAbsoluteFile().exists()) {
			file.getParentFile().mkdirs();
		}
		// 파일 이름은 덮어쓰기
		try {
			Files.write(file.toPath(), lines);
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			System.out.println(ioe.getMessage());
		}
		
	}
}
