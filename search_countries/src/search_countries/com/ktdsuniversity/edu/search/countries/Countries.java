package search_countries.com.ktdsuniversity.edu.search.countries;

import java.util.List;

import search_countries.com.ktdsuniversity.edu.search.states.States;

public class Countries {

	private int id;
	private String name;
	private String iso3;
	private String iso2;
	private int numeric_code;
	private int phonecode;
	private String capital;
	private String currency;
	private String currency_name;
	private String currency_symbol;
	private String tld;
	private String native_name;
	private String region;
	private int region_id;
	private String subregion;
	private int subregion_id;
	private String nationality;
	private String timezones;
	private double latitude;
	private double longitude;
	private String emoji;
	private String emojiU;
	
	// has a (포함) 관계
	private List<States> states;
	
	public List<States> getStates() {
		return states;
	}

	public void setStates(List<States> states) {
		this.states = states;
	}

	public Countries(String[] regionTextArray) {
		// null과 ""는 다름
		if(regionTextArray[0] != null && !regionTextArray[0].isEmpty()) {
			this.id = Integer.parseInt(regionTextArray[0]);
		}
		else {			
			this.id = -1;
		}
		this.name = regionTextArray[1];
		this.iso3 = regionTextArray[2];
		this.iso2 = regionTextArray[3];
		if(regionTextArray[4] != null && !regionTextArray[4].isEmpty()) {
			this.numeric_code = Integer.parseInt(regionTextArray[4]);
		}
		else {			
			this.numeric_code = -1;
		}
		if(regionTextArray[5] != null && !regionTextArray[5].isEmpty()) {
			this.phonecode = Integer.parseInt(regionTextArray[5]);
		}
		else {			
			this.phonecode = -1;
		}
		this.capital = regionTextArray[6];
		this.currency = regionTextArray[7];
		this.currency_name = regionTextArray[8];
		this.currency_symbol = regionTextArray[9];
		this.tld = regionTextArray[10];
		this.native_name = regionTextArray[11];
		this.region = regionTextArray[12];
		if(regionTextArray[13] != null && !regionTextArray[13].isEmpty()) {
			this.region_id = Integer.parseInt(regionTextArray[13]);
		}
		else {			
			this.region_id = -1;
		}
		this.subregion = regionTextArray[14];
		if(regionTextArray[15] != null && !regionTextArray[15].isEmpty()) {
			this.subregion_id = Integer.parseInt(regionTextArray[15]);
		}
		else {			
			this.subregion_id = -1;
		}
		this.nationality = regionTextArray[16];
		this.timezones = regionTextArray[17];
		if(regionTextArray[18] != null && !regionTextArray[18].isEmpty()) {
			this.latitude = Double.parseDouble(regionTextArray[18]);
		}
		else {			
			this.latitude = -1;
		}
		if(regionTextArray[19] != null && !regionTextArray[19].isEmpty()) {
			this.longitude = Double.parseDouble(regionTextArray[19]);
		}
		else {			
			this.longitude = -1;
		}
		this.emoji = regionTextArray[20];
		this.emojiU = regionTextArray[21];

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

	public String getIso3() {
		return this.iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getIso2() {
		return this.iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public int getNumeric_code() {
		return this.numeric_code;
	}

	public void setNumeric_code(int numeric_code) {
		this.numeric_code = numeric_code;
	}

	public int getPhonecode() {
		return this.phonecode;
	}

	public void setPhonecode(int phonecode) {
		this.phonecode = phonecode;
	}

	public String getCapital() {
		return this.capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency_name() {
		return this.currency_name;
	}

	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}

	public String getCurrency_symbol() {
		return this.currency_symbol;
	}

	public void setCurrency_symbol(String currency_symbol) {
		this.currency_symbol = currency_symbol;
	}

	public String getTld() {
		return this.tld;
	}

	public void setTld(String tld) {
		this.tld = tld;
	}

	public String getNative_name() {
		return this.native_name;
	}

	public void setNative_name(String native_name) {
		this.native_name = native_name;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getRegion_id() {
		return this.region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}

	public String getSubregion() {
		return this.subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public int getSubregion_id() {
		return this.subregion_id;
	}

	public void setSubregion_id(int subregion_id) {
		this.subregion_id = subregion_id;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getTimezones() {
		return this.timezones;
	}

	public void setTimezones(String timezones) {
		this.timezones = timezones;
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

	public String getEmoji() {
		return this.emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	public String getEmojiU() {
		return this.emojiU;
	}

	public void setEmojiU(String emojiU) {
		this.emojiU = emojiU;
	}

	@Override
	public String toString() {
		return "SearchCountries [id=" + this.id + ", name=" + this.name + ", iso3=" + this.iso3 + ", iso2=" + this.iso2 + ", numeric_code="
				+ this.numeric_code + ", phonecode=" + this.phonecode + ", capital=" + this.capital + ", currency=" + this.currency
				+ ", currency_name=" + this.currency_name + ", currency_symbol=" + this.currency_symbol + ", tld=" + this.tld
				+ ", native_name=" + this.native_name + ", region=" + this.region + ", region_id=" + this.region_id + ", subregion="
				+ this.subregion + ", subregion_id=" + this.subregion_id + ", nationality=" + this.nationality + ", timezones="
				+ this.timezones + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", emoji=" + this.emoji + ", emojiU="
				+ this.emojiU + "]";
	}
	
	
	
}
