package com.ktdsuniversity.edu.fileio.recursive;

import java.io.File;

/**
 * 폴더 삭제
 */
public class RemoveFolder {

	public void deleteAllFilesAndFolders(String deleteFolderPath) {
		// 삭제할 파일 또는 폴더 객체
		File file = new File(deleteFolderPath);
		// file 객체가 폴더일 경우, 내부에 존재하는 모든 항목을 조회.
		File[] listFiles = file.listFiles();
		// 내부에 존재하는 모든 항목을 반복.
		for(File f : listFiles) {
			// 반복 중인 파일 객체가 파일이라면, 즉시 삭제한다.
			if(f.isFile()) {
				f.delete();
			}
			// 반복 중인 파일 객체가 폴더라면, 다시 deleteAllFilesAndFolders(반복 중인 파일의 경로)를 실행한다.
			else {
				this.deleteAllFilesAndFolders(f.getAbsolutePath());
				// 반복 중인 폴더의 내용을 모두 삭제한 뒤, 해당 폴더도 삭제시킨다.
				f.delete();
			}
			
		}
		// 모든 내용이 제거된 폴더도 삭제한다.
		file.delete(); // 최상위 삭제
	} 
	
	public void run(String deletrFolderPath) {
		this.deleteAllFilesAndFolders(deletrFolderPath);
	}
	
	public static void main(String[] args) {
		
		String targetPath = "C:\\Users\\User\\Desktop\\javaexam";
		String targetFolderName = "temp";
		
		File file = new File(targetPath, targetFolderName);
		file.delete();
		// delete()로 삭제할 수 있는 대상.
		// 1. 파일 삭제
		// 2. 비어있는 폴더 삭제
		//    비어있지 않는 폴더는 삭제 불가 -> 1. 폴더의 내용을 전부 삭제. -> 폴더의 내용이 전부 폴더이고, 그 폴더 안에 파일이 존재할 경우?
		// 		-> 하위 폴더 내부의 모든 파일을 삭제한 뒤에, 하위 폴더를 삭제.
		//			-> 삭제 대상 폴더를 삭제.
		new RemoveFolder().run(targetPath);
		
	}
	
}
