package search_countries.com.ktdsuniversity.edu.search.translations;

public class Translations {
	
	private int place_id;
	private String place_type;
	private String  language;
	private String translation;

    public Translations(String[] regionTextArray) {
    	this.place_id = Integer.parseInt(regionTextArray[0]);
    	this.place_type = regionTextArray[1];
    	this.language = regionTextArray[2];
    	this.translation = regionTextArray[3];
    }

	public int getPlace_id() {
		return this.place_id;
	}

	public void setPlace_id(int place_id) {
		this.place_id = place_id;
	}

	public String getPlace_type() {
		return this.place_type;
	}

	public void setPlace_type(String place_type) {
		this.place_type = place_type;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTranslation() {
		return this.translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	@Override
	public String toString() {
		return "Translations [place_id=" + this.place_id + ", place_type=" + this.place_type + ", language=" + this.language
				+ ", translation=" + this.translation + "]";
	}
    
    
	
}
