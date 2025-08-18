package search_countries.com.ktdsuniversity.edu.search.states;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

import search_countries.com.ktdsuniversity.edu.search.constants.FilePath;
import search_countries.com.ktdsuniversity.edu.search.countries.Countries;
import search_countries.com.ktdsuniversity.edu.search.countries.SearchCountries;
import search_countries.com.ktdsuniversity.edu.search.regions.Regions;
import search_countries.com.ktdsuniversity.edu.search.regions.SearchRegion;



public class SearchStates {
	
	public static Stream<String> load(){
		Stream<String> lines = null;
		
		try{
			lines = Files.lines(new File(FilePath.PATH, FilePath.STATES).toPath());
		} catch(IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		return lines;
	}
	
	/**
	 * 
	 */
	public void printAllStates() {
		
		Stream<String> lines = SearchStates.load();
		
		try{
			lines = Files.lines(new File(FilePath.PATH, FilePath.STATES).toPath());
		} catch(IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
		lines.skip(1)
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))"))
			 .map((array) -> new States(array))
			 .forEach(System.out::println);;
			 
	}
	
	/**
	 * 정렬
	 */
	public void printAllStatesSortedById() {
		
		Stream<String> lines = SearchStates.load();
		
		try{
			lines = Files.lines(new File(FilePath.PATH, FilePath.STATES).toPath());
		} catch(IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
		lines.skip(1)
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))"))
			 .map((array) -> new States(array))
			 .sorted((state2, state1) -> state1.getId().compareTo(state2.getId())) // 이렇게 하면 문자열이라서 990 -> 99 이런식으로 됨
			 .forEach(System.out::println);
		
		lines.close();
			 
	}
	
	/**
	 * Asia에 존재하는 모든 States(주/도)를 조회
	 *  states => countryId => country.countryId == states.countryId ==> countryId.regionId => region.id == country.id => regionId 
	 *  Asia => regionId => asia.regionId == country.regionId ==> country.countryId == states.countryId ==> states => state 정보
	 */
	public void printAllStatesOnAsia() {
		
		Stream<String> lines = SearchRegion.load();
		 
		lines.skip(1)
			 .map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]>
			 .map(array -> new Regions(array)) // Stream<Regions>
			 .filter(region -> region.getName().equals("Asia")) // Stream<Regions>
			 // Asia의 Country를 조회 
			 .flatMap(region -> SearchCountries.load() // Stream<String>
					 					   .skip(1)
					 					   .map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]>
					 					   .map(array -> new Countries(array)) // Stream<Countries>
					 					   .filter(country -> country.getRegion_id() == region.getId())
					 ) // Stream<Countries>
			 // Asia의 Country의 state를 조회
			 .flatMap(country -> SearchStates.load() // Stream<String>
					 					.skip(1)
					  					.map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]>
					 					.map(array -> new States(array)) // Stream<States>
					 					.filter(state -> state.getCountry_id() == country.getId())
					 ) // Stream<States> (그냥 map이면 Stream<Stream<States>> 이렇게 됨
			 .forEach(System.out::println)
		     ;
		
		
			 
	}
	
	public void printAllStatesOnAsiaHasA() {
		
		Stream<String> lines = SearchRegion.load();
		 
		lines.skip(1)
			 .map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]>
			 .map(array -> new Regions(array)) // Stream<Regions>
			 .filter(region -> region.getName().equals("Asia")) // Stream<Regions>
			 // Asia의 Country를 조회 
			 .map(region -> {
				 
				 List<Countries> regionsCountries = SearchCountries.load() // Stream<String>
				   .skip(1)
				   .map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]>
				   .map(array -> new Countries(array)) // Stream<Countries>
				   .filter(country -> country.getRegion_id() == region.getId())
				   .map(country -> {
				   
				   			 List<States> countriesStates = SearchStates.load() // Stream<String>
				   			.skip(1)
				   			.map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))")) // Stream<String[]>
		 					.map(array -> new States(array)) // Stream<States>
		 					.filter(state -> state.getCountry_id() == country.getId())
		 					.toList();
				   			country.setStates(countriesStates);
				  
					   
					   return country;
				   }) // Stream<Countries>
				   .toList();
				  
				 region.setCountries(regionsCountries);
				 return region;
			 }) // 여러줄 쓸 것이라서 {}
			 .forEach(region -> {
					System.out.println(region);
					
					region.getCountries()
						  .forEach(country -> {
							  System.out.println(country);
							  
							  country.getStates()
							  		 .forEach(System.out::println);
						  });
				 });
			
		     
			
	}
	
	
	public static void main(String[] args) {
		
		SearchStates ss = new SearchStates();
		ss.printAllStates();
		System.out.println("=".repeat(30));
		ss.printAllStatesSortedById();
		System.out.println("=".repeat(30));
		ss.printAllStatesOnAsia(); 
		System.out.println("=".repeat(30));
		ss.printAllStatesOnAsiaHasA(); // 에러남 (id)
	}
	

}
