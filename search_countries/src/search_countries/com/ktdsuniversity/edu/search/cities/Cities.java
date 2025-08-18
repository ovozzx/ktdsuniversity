package search_countries.com.ktdsuniversity.edu.search.cities;

/**
 * VO
 */
public class Cities {

	// id,name,state_id,state_code,state_name,country_id,country_code,country_name,latitude,longitude,timezone,wikiDataId
	private int id;
	private String name;
	private int state_id;
	private String state_code;
	private String state_name;
	private int country_id;
	private String country_code;
	private String country_name;
	private double latitude;
	private double longitude;
	private String timezone;
	private String wikiDataId;
	
	public Cities(String[] regionTextArray) {
		
		this.id = Integer.parseInt(regionTextArray[0]);
		
		if(regionTextArray.length > 1) {			
			this.name = regionTextArray[1];
		}
		if(regionTextArray.length > 2) {
		 // 0 1 2
		 this.state_id = Integer.parseInt(regionTextArray[2]);
		}
		if(regionTextArray.length > 3) {
			this.state_code = regionTextArray[3];
		}
		if(regionTextArray.length > 4) {
			this.state_name = regionTextArray[4];
		}
		if(regionTextArray.length > 5) {
			this.country_id = Integer.parseInt(regionTextArray[5]);
		}
		if(regionTextArray.length > 6) {
			this.country_code = regionTextArray[6];
		}	
		if(regionTextArray.length > 7) {
			this.country_name = regionTextArray[7];
		}	
		if(regionTextArray.length > 8) {
			this.latitude = Double.parseDouble(regionTextArray[8]);
		}	
		if(regionTextArray.length > 9) {
			this.longitude = Double.parseDouble(regionTextArray[9]);
		}	
		if(regionTextArray.length > 10) {
			this.timezone = regionTextArray[10];
		}	
		if(regionTextArray.length > 11) {
			this.wikiDataId = regionTextArray[11];
		}

		
		// 인덱스 에러 => 예외 처리 모두 필요 (2500번 이후에 마지막 컴마가 없음) 배열 길이 수마다 체크 
		// 끝에 값이 비어있음 (,는 길이 만큼 존재)
		// 생성자를 수정 
		// ArrayIndexOutOfBoundsException
		
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

	public int getState_id() {
		return this.state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
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

	public String getWikiDataId() {
		return this.wikiDataId;
	}

	public void setWikiDataId(String wikiDataId) {
		this.wikiDataId = wikiDataId;
	}

	@Override
	public String toString() {
		return "Cities [id=" + this.id + ", name=" + this.name + ", state_id=" + this.state_id + ", state_code=" + this.state_code
				+ ", state_name=" + this.state_name + ", country_id=" + this.country_id + ", country_code=" + this.country_code
				+ ", country_name=" + this.country_name + ", latitude=" + this.latitude + ", longitude=" + this.longitude
				+ ", timezone=" + this.timezone + ", wikiDataId=" + this.wikiDataId + "]";
	}
	
	

}
