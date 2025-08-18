package search_countries.com.ktdsuniversity.edu.search.states;

public class States {
	
	private String id;												
	private String name;												
	private int country_id;												
	private String country_code;												
	private String country_name;												
	private String iso2;												
	private String iso3166_2;												
	private String fips_code;												
	private String type;												
	private int level;												
	private int parent_id;												
	private double latitude;												
	private double longitude;												
	private String timezone;
	
	public States(String[] regionTextArray) {
		this.id = regionTextArray[0];
		this.name = regionTextArray[1];
		if(regionTextArray[2] != null && !regionTextArray[2].isEmpty()) {			
			this.country_id = Integer.parseInt(regionTextArray[2]);
		}
		else {
			this.country_id = -1;
		}
		this.country_code = regionTextArray[3];
		this.country_name = regionTextArray[4];
		this.iso2 = regionTextArray[5];
		this.iso3166_2 = regionTextArray[6];		
		this.fips_code = regionTextArray[7];
		this.type = regionTextArray[8];
		if(regionTextArray[9] != null && !regionTextArray[9].isEmpty()) {			
			this.level = Integer.parseInt(regionTextArray[9]);
		}
		else {
			this.level = -1;
		}
		if(regionTextArray[10] != null && !regionTextArray[10].isEmpty()) {			
			this.parent_id = Integer.parseInt(regionTextArray[10]);
		}
		else {
			this.parent_id = -1;
		}
		if(regionTextArray[11] != null && !regionTextArray[11].isEmpty()) {			
			this.latitude = Double.parseDouble(regionTextArray[11]);
		}
		else {
			this.latitude = -1;
		}
		if(regionTextArray[12] != null && !regionTextArray[12].isEmpty()) {			
			this.longitude = Double.parseDouble(regionTextArray[12]);
		}
		else {
			this.longitude = -1;
		}
		this.timezone = regionTextArray[13];
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountry_id() {
		return this.country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return this.country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getIso2() {
		return this.iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3166_2() {
		return this.iso3166_2;
	}

	public void setIso3166_2(String iso3166_2) {
		this.iso3166_2 = iso3166_2;
	}

	public String getFips_code() {
		return this.fips_code;
	}

	public void setFips_code(String fips_code) {
		this.fips_code = fips_code;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getParent_id() {
		return this.parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@Override
	public String toString() {
		return "SerachStates [id=" + this.id + ", name=" + this.name + ", country_id=" + this.country_id + ", country_code="
				+ this.country_code + ", country_name=" + this.country_name + ", iso2=" + this.iso2 + ", iso3166_2=" + this.iso3166_2
				+ ", fips_code=" + this.fips_code + ", type=" + this.type + ", level=" + this.level + ", parent_id=" + this.parent_id
				+ ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", timezone=" + this.timezone + "]";
	}		
	
}
