package search_countries.com.ktdsuniversity.edu.search.regions;

import java.util.List;

import search_countries.com.ktdsuniversity.edu.search.countries.Countries;

/**
 * VO
 * 데이터 한줄 한줄을 표현할 클래스
 */
public class Regions { 

	// id,name,wikiDataId
	private int id;
	private String name;
	private String wikiDataId;
	
	// has a (포함) 관계
	private List<Countries> countries; // 변수명 
	
	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}

	public Regions(String[] regionTextArray) {
		if(regionTextArray[0].matches("^[0-9]+$")) {			
			this.id = Integer.parseInt(regionTextArray[0]);
		}
		this.name = regionTextArray[1];
		this.wikiDataId = regionTextArray[2];
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWikiDataId() {
		return this.wikiDataId;
	}

	public void setWikiDataId(String wikiDataId) {
		this.wikiDataId = wikiDataId;
	}

	@Override
	public String toString() {
		return "Regions [id=" + this.id + ", name=" + this.name + ", wikiDataId=" + this.wikiDataId + "]";
	}
	
	
	
}
