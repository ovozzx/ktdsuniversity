package search_countries.com.ktdsuniversity.edu.search.subregions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

import search_countries.com.ktdsuniversity.edu.search.constants.FilePath;

public class SearchSubregions {
	
	public void printAllSubregions() {
		
		Stream<String> lines = null;
		
		try {
			
			lines = Files.lines(new File(FilePath.PATH, FilePath.SUBREGIONS).toPath());
			
		} catch(IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
		lines.skip(1)
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))"))
			 .map((array) -> new Subregions(array))
			 .forEach(System.out::println);
	}
		
	
	public static void main(String[] args) {
		
		SearchSubregions ss = new SearchSubregions();
		ss.printAllSubregions();
		
	}

}
