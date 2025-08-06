package com.ktdsuniversity.edu.fileio.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


/**
 * 파일 읽기 : 코드 외우지 말고, 필요할 때 참고 
 * 2가지 방식
 */
public class ReadFile {

	// chunking
	
	// IOException (checked) -> (1) 파일 없을 때, (2) 파일 누군가 사용중일 때 (lock)
	
	// 디스크 -- 파이프 (stream) -- 애플리케이션 (스캐너도 포함됨)
	// 파이프가 만들어지면 메모리 사용됨 -> 따라서 파이프 제거 필요 (먼저 열린 파이프를 나중에 닫는다 (스택처럼))
	// 외부 시스템과 연결할 때 사용 후 제거 필요 
	
	/**
	 * Java 1.8 이상
	 */
	public void readFileUseNIO(String targetPath, String targetFilename) {
		File targerFile = new File(targetPath, targetFilename);
		
		List<String> fileLines = new ArrayList<>();
		
		try{			
			fileLines.addAll(Files.readAllLines(targerFile.toPath()) ); // 리스트에 한줄 한줄 들어있음
			// 닫을 필요 없음 알아서 닫힘?
		}
		catch(IOException ioe) {
			
		}
		
		for(String line : fileLines) {
			System.out.println("NIO: " + line);
		}
		
	}
	
	/**
	 * Java 1.7 이하
	 */
	public void readFileUseIO(String targetPath, String targetFilename) {
		File targetFile = new File(targetPath, targetFilename);
		
		if(targetFile.exists() && targetFile.isFile()) {
			
			// 파일 읽기 시작.
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			
			try {				
				reader = new FileReader(targetFile); // try catch 문이 반드시 필요함
				// null 아니면 파이프가 열려있는 것이니 닫아라
				bufferedReader = new BufferedReader(reader);
				// 파일을 청킹해서 읽기
				String chunkedLine = null;
				// 파일의 시작부터 끝까지(EOF) 읽는다.
				while( (chunkedLine = bufferedReader.readLine()) != null ) { // extends IOException
					System.out.println(chunkedLine);
				}
			}
			//catch(FileNotFoundException fnfe) { // extends IOException
			catch(IOException fnfe) {
			// Exception 
			// 	IOException (상속 받음) -> 젤 상윗단만 적어주면 됨 
			// 		FileNotFioundException (상속 받음)
				System.out.println(fnfe.getMessage());
			}
			finally { // 에러나든말든 실행
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException e) {
						// 아무것도 쓰지 않음 (할 수 있는 게 없음)
					}
				}
				
				if(reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						// 아무것도 쓰지 않음 (할 수 있는 게 없음)
					}
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		String tartgetPath = "C:\\Users\\User\\Desktop\\javaexam";
		String tartgetFilename = "test.txt";
		
		ReadFile rf = new ReadFile();
		rf.readFileUseIO(tartgetPath, tartgetFilename);
		rf.readFileUseNIO(tartgetPath, tartgetFilename);
		
	}
	
}
