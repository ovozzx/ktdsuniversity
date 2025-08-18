package search_countries.com.ktdsuniversity.edu.search.cities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

import search_countries.com.ktdsuniversity.edu.search.constants.FilePath;



public class SearchCities {

	public void printAllCities() {
		
		Stream<String> lines = null;
		
		try {
			lines = Files.lines(new File(FilePath.PATH, FilePath.CITIES).toPath());
		} catch(IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		

		lines.skip(1)
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))"))
			 .map((array) -> new Cities(array))
			 .forEach(System.out::println);
		// 인덱스 에러 => 예외 처리 모두 필요 (2500번 이후에 마지막 컴마가 없음) 배열 길이 수마다 체크 
		// 생성자를 수정 
		// ArrayIndexOutOfBoundsException
		
		

	}
	
	public static void main(String[] args) {
		SearchCities sc = new SearchCities();
		sc.printAllCities();
	}
	
}
