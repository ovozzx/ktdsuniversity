package search_countries.com.ktdsuniversity.edu.search.countries;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

import search_countries.com.ktdsuniversity.edu.search.constants.FilePath;


public class SearchCountries {

	public static Stream<String> load (){
		
		Stream<String> lines = null;
		try {			
			lines = Files.lines(new File(FilePath.PATH, FilePath.COUNTRIES).toPath());
		} catch(IOException e) {
			throw new RuntimeException(e.getMessage(), e); // 예외 던지고 죽여라 (파일 없으면 우리가 할 수 있는 일이 없기 때문)
		} 
		return lines;
	}
	
	public void printAllCountries() {
		
		Stream<String> lines = SearchCountries.load();
		
		lines.skip(1) // 헤더 건너뜀 ?? 줄마다 처리하는지
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Countries(array)) // Stream<Regions>
			 .forEach(System.out::println);
		// 빈문자열 정수 변환 시 NumberFormatException 발생
		
	}
	
	/**
	 * Countries의 Region이 "Asia"인 것만 조회
	 */
	public void printAllAsiaCountries() {
		
		Stream<String> lines = SearchCountries.load();
		
		lines.skip(1)
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Countries(array)) // Stream<Regions>
		     .filter((country) -> country.getRegion().equals("Asia") )
		     .forEach(System.out::println);
		     ;
		
	}
	
	/**
	 * Countries의 Region이 "Europe"인 것만 조회
	 * 	latitude로 내림차순 정렬
	 */
	public void printAllEuropeCountries() {
	
		Stream<String> lines = SearchCountries.load();
		
		lines.skip(1)
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Countries(array)) // Stream<Regions>
		     .filter((country) -> country.getRegion().equals("Europe") )
		     .sorted((country2, country1) -> (int) (country1.getLatitude() * 100_000_000 - country2.getLatitude() * 100_000_000)) // int로 변환해서 줘야 함 (소수점 이하 자리 씹히는 거 같은데..)
		     // 소수점 이하를 버리기 때문에 올바른 정렬이 안됨 -> 소수점 자릿수 바꾸기 (곱하기)
		     // String이면 compareTo
		     .forEach(System.out::println);
	     ;
		
	}
	
	/**
	 * Countries의 Region_ID가 6번인 것만 조회
	 */
	public void printAllPolarCountries() {
		
		Stream<String> lines = SearchCountries.load();
		
		lines.skip(1)
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Countries(array)) // Stream<Regions>
		     .filter((country) -> country.getRegion_id() == 6)
		     .forEach(System.out::println);
		     ;
		
	}
	
	
	public static void main(String[] args) {
		
		SearchCountries sc = new SearchCountries();
		//sc.printAllCountries();
		sc.printAllAsiaCountries();
		System.out.println("=".repeat(30));
		sc.printAllEuropeCountries();
		System.out.println("=".repeat(30));
		sc.printAllPolarCountries();
		
	}
	

}
