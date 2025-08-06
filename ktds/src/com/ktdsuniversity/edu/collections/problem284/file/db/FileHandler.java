package com.ktdsuniversity.edu.collections.problem284.file.db;

import java.util.ArrayList;
import java.util.List;


/**
 * 파일 데이터베이스 (파일 내용 읽기 / 작성 / 수정 / 삭제)
 */

public class FileHandler {
	
	// 파일 읽어오기 단순화

	private String fileDatabasePath;
	private String fileDatabaseName;
	
	public FileHandler(String fileDatabasePath, String fileDatabaseName) {
		this.fileDatabasePath = fileDatabasePath;
		this.fileDatabaseName = fileDatabaseName;
	}
	
	public List<String> readFile(){
		
		// throw 넘어 옴
		try {			
			List<String> lines = FileReadUtil.readAllLines(this.fileDatabasePath, fileDatabaseName);
			return lines;
		}
		catch(IllegalArgumentException iae) {
			//파일 없어서 에러 났으니 만들어 주자
			FileWriteUtil.writeLines(this.fileDatabasePath, this.fileDatabaseName, List.of());
			// List.of() -> 비어있는 리스트
			//return List.of(); -> 수정 안되는 리스트
			return new ArrayList<>(); // 수정되는 리스트
		}
				
	}
	
	public void writeFile(List<String> lines) {
		// 덮어씌워질 것
		FileWriteUtil.writeLines(this.fileDatabasePath, this.fileDatabaseName, lines);
	}
	

}
