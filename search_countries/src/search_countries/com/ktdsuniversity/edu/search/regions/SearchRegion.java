package search_countries.com.ktdsuniversity.edu.search.regions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

import search_countries.com.ktdsuniversity.edu.search.constants.FilePath;

/**
 * csv를 읽어서 객체로 바꾸기 
 */
public class SearchRegion {

	public static Stream<String> load() {
		Stream<String> lines = null;
		try {			
			// Files.readAllLines() => Stream -> List 변환 -> close 
			lines = Files.lines(new File(FilePath.PATH, FilePath.REGIONS).toPath());
		} catch(IOException e) {
			throw new RuntimeException(e.getMessage(), e); // 예외 던지고 죽여라 (파일 없으면 우리가 할 수 있는 일이 없기 때문)
		} 
		return lines;		
	}
	
	public void printAllRegions() {
		
		Stream<String> lines = SearchRegion.load();
		lines.skip(1) // 헤더 건너뜀 ?? 줄마다 처리하는지
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Regions(array)) // Stream<Regions>
			 .forEach(System.out::println);
	
		lines.close(); // 파이프 닫기
	}
	
	public void printAsiaRegion() {
		
		Stream<String> lines = SearchRegion.load();
		
		lines.skip(1) 
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Regions(array)) // Stream<Regions>
		     .filter((region) -> region.getName().equals("Asia"))// 필터를 앞에 쓰면 메모리 측면에서 이득이긴하지만 정확하지 않음
			 .forEach(System.out::println);
			
	}
	
	/**
	 * Region의 name이 "A" 시작하는 것만 출력
	 */
	public void printStartWithAReguibs() {
		
		Stream<String> lines = SearchRegion.load();
		
		lines.skip(1) 
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Regions(array)) // Stream<Regions>
		     .filter((region) -> region.getName().startsWith("A"))// 필터를 앞에 쓰면 메모리 측면에서 이득이긴하지만 정확하지 않음
			 .forEach(System.out::println);
	}
	
	/**
	 * 
	 * Region의 name만 출력
	 *  Stream<String>
	 *  	Stream<String[]>
	 *  		Stream<Regions>
	 *  			Stream<String>
	 *  				forEach()
	 * 	최종함수 : 
	 * 		.forEach(System.out::println);
	 */
	public void printAllRegionsName() {
		Stream<String> lines = SearchRegion.load();
		
		lines.skip(1) 
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Regions(array)) // Stream<Regions>
		     .map((region) -> region.getName()) // map(Regions::getName)
			 .forEach(System.out::println);
	}
	
	/**
	 * 
	 * 모든 Region들을 이름 오름차순으로 정렬해서 출력한다
	 * 이름만 출력
	 */
	public void printAllRegionsSortesName() {
		Stream<String> lines = SearchRegion.load();		
		
		lines.skip(1) 
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Regions(array)) // Stream<Regions>
		     .map((region) -> region.getName()) // map(Regions::getName)
		     .sorted((region1, region2) -> region1.compareTo(region2)) // 오름차순 정렬
		     //.sorted((region2, region1) -> region1.compareTo(region2)) // 내림차순 정렬
		     // .sorted() : 에러 왜 안나지
			 .forEach(System.out::println);
	}
	
	/**
	 * 
	 * 모든 Region들을 이름 내림차순 정렬해서 출력한다
	 * 이름만 출력
	 */
	public void printAllRegionsDescSorted() {
		Stream<String> lines = SearchRegion.load();		
		
		lines.skip(1) 
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]> 
		     .map((array) -> new Regions(array)) // Stream<Regions>
		     .sorted((region2, region1) -> region1.getName().compareTo(region2.getName())) // 오름차순 정렬
			 .forEach(System.out::println);
	}
	
	/**
	 * 
	 * 모든 Region들을 전체 출력
	 */
	
	public static void main(String[] args) {
		
		SearchRegion sr = new SearchRegion();
		sr.printAsiaRegion();
		System.out.println("=".repeat(30));
		sr.printStartWithAReguibs();
		System.out.println("=".repeat(30));
		sr.printAllRegionsName();
		System.out.println("=".repeat(30));
		sr.printAllRegionsSortesName();
		System.out.println("=".repeat(30));
		sr.printAllRegionsDescSorted();
	}
}
