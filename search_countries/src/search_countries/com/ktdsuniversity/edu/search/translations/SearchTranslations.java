package search_countries.com.ktdsuniversity.edu.search.translations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

import search_countries.com.ktdsuniversity.edu.search.constants.FilePath;

public class SearchTranslations {

	public void prinaAllTranslations() {
		
		Stream<String> lines = null;
		
		try {
			
			lines = Files.lines(new File(FilePath.PATH, FilePath.TRANSLATIONS).toPath());
			
		} catch(IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
		lines.skip(1)
			 .map((line) -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))"))
			 .map((array) -> new Translations(array))
			 .forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		
		SearchTranslations st = new SearchTranslations();
		st.prinaAllTranslations();
		
	}
}
