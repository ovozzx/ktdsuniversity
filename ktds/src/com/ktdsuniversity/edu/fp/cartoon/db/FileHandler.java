package com.ktdsuniversity.edu.fp.cartoon.db;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.cartoon.Cartoon;


/**
 * 파일 데이터베이스 (파일 내용 읽기 / 작성 / 수정 / 삭제) 
 */
public class FileHandler {

	private String fileDatabasePath;
	private String fileDatabaseName;
	
	public FileHandler(String fileDatabasePath, String fileDatabaseName) {
		this.fileDatabasePath = fileDatabasePath;
		this.fileDatabaseName = fileDatabaseName;
	}
	
	public List<Cartoon> readFile(CreateCartoon createCartoon) {
		try {
			return FileReadUtil.readAllLines(
						this.fileDatabasePath, this.fileDatabaseName) // List<String>
							.stream() // Stream<String>
							.map((line) -> line.split("```")) // Stream<String[]>
							.map((array) -> createCartoon.convert(array)) // Stream<Product>
							.collect(Collectors.toList()); // List<Product> : 수정가능한 List 반환
							//.toList(); // List<Product> : 읽기전용 List 반환
		}
		catch(IllegalArgumentException iae) {
			FileWriteUtil.writeLines(
					this.fileDatabasePath, this.fileDatabaseName, List.of());
			return new ArrayList<>();
		}
	}
	
	public void writeFile(List<Cartoon> cartoons, Function<Cartoon, String> convert) {
		
		List<String> lines = cartoons.stream() // Stream<Product>
									.map((cartoon) -> convert.apply(cartoon)) // Stream<String>
									.toList(); // List<String>
		
		FileWriteUtil.writeLines(
				this.fileDatabasePath, this.fileDatabaseName, lines);
	}
}


