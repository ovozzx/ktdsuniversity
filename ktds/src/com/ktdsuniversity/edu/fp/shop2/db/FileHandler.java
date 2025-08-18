package com.ktdsuniversity.edu.fp.shop2.db;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.shop2.Product;

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
	
	public List<Product> readFile(CreateProduct createProduct) {
		try {
			return FileReadUtil.readAllLines(
						this.fileDatabasePath, this.fileDatabaseName) // List<String>
							.stream() // Stream<String>
							.map((line) -> line.split("```")) // Stream<String[]>
							.map((array) -> createProduct.convert(array)) // Stream<Product>
							// convert → ComputerSeller() 내 람다식 실행 → new Product(...) 실행.
							.collect(Collectors.toList()); // List<Product> : 수정가능한 List 반환
							//.toList(); // List<Product> : 읽기전용 List 반환
		}
		catch(IllegalArgumentException iae) {
			FileWriteUtil.writeLines(
					this.fileDatabasePath, this.fileDatabaseName, List.of());
			return new ArrayList<>();
		}
	}
	
	public void writeFile(List<Product> products, Function<Product, String> convert) {
		
		List<String> lines = products.stream() // Stream<Product>
									.map((product) -> convert.apply(product)) // Stream<String>
									// 내 생각 : 이것도 람다식 구현
									.toList(); // List<String>
		
		FileWriteUtil.writeLines(
				this.fileDatabasePath, this.fileDatabaseName, lines);
	}
}


