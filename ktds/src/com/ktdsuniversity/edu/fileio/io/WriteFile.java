package com.ktdsuniversity.edu.fileio.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


/**
 * 파일 생성 및 내용 작성
 */
public class WriteFile {

	public void writeFileUseNIO(String targetPath, String targetFilename, List<String> description) {
		
		// 1. 파일 인스턴스 생성
		File targetFile = new File(targetPath, targetFilename);
		// 2. 파일의 폴더가 존재하는지 확인
		// 2-1. 폴더가 없으면 만들어준다
		System.out.println(targetFile.getParentFile());
		
		if(!targetFile.getParentFile().exists()) {
			targetFile.getParentFile().mkdirs();
		}
		// 3. 해당 경로에 해당 파일이 이미 존재하는가?
		// 3-1. 존재한다면, 파일 이름에 넘버링을 붙여서 없을 때까지 찾는다.
		int index = 1;
		while(targetFile.exists()) {
			// 파일명(숫자).txt -> lastIndexOf, substring, split
			
			String newFilename = targetFilename.substring(0, targetFilename.lastIndexOf("."));
			String fileExtention = targetFilename.substring(targetFilename.lastIndexOf("."));
			newFilename += " (" + index++ + ")" + fileExtention;
			
			targetFile = new File(targetPath, newFilename);
		
		}
		// 4. 파일의 내용을 작성한다. (청킹으로 쓰기)
		try {			
			Files.write(targetFile.toPath(), description); // 자동 close 
		}
		catch(IOException ioe) {
			
		}
	}
	
	public void writeFileUseIO(String targetPath, String targetFilename, List<String> description) {
		
		// 1. 파일 인스턴스 생성
		File targetFile = new File(targetPath, targetFilename);
		// 2. 파일의 폴더가 존재하는지 확인
		// 2-1. 폴더가 없으면 만들어준다
		System.out.println(targetFile.getParentFile());
		
		if(!targetFile.getParentFile().exists()) {
			targetFile.getParentFile().mkdirs();
		}
		// 3. 해당 경로에 해당 파일이 이미 존재하는가?
		// 3-1. 존재한다면, 파일 이름에 넘버링을 붙여서 없을 때까지 찾는다.
		int index = 1;
		while(targetFile.exists()) {
			// 파일명(숫자).txt -> lastIndexOf, substring, split
			
			String newFilename = targetFilename.substring(0, targetFilename.lastIndexOf("."));
			String fileExtention = targetFilename.substring(targetFilename.lastIndexOf("."));
			newFilename += " (" + index++ + ")" + fileExtention;
			
			targetFile = new File(targetPath, newFilename);
		
		}
		// 4. 파일의 내용을 작성한다. (청킹으로 쓰기)
		FileWriter writer = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			writer = new FileWriter(targetFile);
			bufferedWriter = new BufferedWriter(writer);
			
			for(String line : description) {
				bufferedWriter.write(line);
				bufferedWriter.write("\n");
			}
			
			bufferedWriter.flush(); 
			
		} catch (IOException ioe) {
		
		}
		finally {
			if(bufferedWriter != null) {
				try {
					writer.close();
				}
				catch(IOException e) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		String targetPath = "C:\\Users\\User\\Desktop\\javaexam\\nio\\text";
		String targetFilename = "outputTest.txt";
		
		List<String> fileDescription = new ArrayList<>();
		for(int i = 1 ; i < 100 ; i++) {
			fileDescription.add("파일을 씁니다. " + i);
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		
		WriteFile wf = new WriteFile();
		//wf.writeFileUseIO(targetPath, targetFilename, fileDescription);
		wf.writeFileUseNIO(targetPath, targetFilename, fileDescription);
		
	}

}
