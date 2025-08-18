package search_countries.com.ktdsuniversity.edu.search.subregions;

public class Subregions {
	
	//id,name,region_id,wikiDataId
	private int id;
	private String name;
	private int region_id;
	private String wikiDataId;
	
	public Subregions(String[] regionTextArray) {
		this.id = Integer.parseInt(regionTextArray[0]);
		this.name = regionTextArray[1];
		this.region_id = Integer.parseInt(regionTextArray[2]);
		this.wikiDataId = regionTextArray[3];
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

	public int getRegion_id() {
		return this.region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}

	public String getWikiDataId() {
		return this.wikiDataId;
	}

	public void setWikiDataId(String wikiDataId) {
		this.wikiDataId = wikiDataId;
	}

	@Override
	public String toString() {
		return "Subregions [id=" + this.id + ", name=" + this.name + ", region_id=" + this.region_id + ", wikiDataId=" + this.wikiDataId
				+ "]";
	}
	
	

}
