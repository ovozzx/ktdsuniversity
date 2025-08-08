package com.ktdsuniversity.edu.phonebook.vo;

/**
 * 대명사
 */
public class PronounVO {
	
	/**
	 * 대명사 종류
	 * @see m.ktdsuniversity.edu.phonebook.constants.PronounType
	 */

	private int pronounType;
	private String pronoun;

	public PronounVO() {
		// Nothing
	}

	
	public PronounVO(int pronounType, String pronoun) {
		super();
		this.pronounType = pronounType;
		this.pronoun = pronoun;
	}


	public int getPronounType() {
		return this.pronounType;
	}

	public void setPronounType(int pronounType) {
		this.pronounType = pronounType;
	}

	public String getPronoun() {
		return this.pronoun;
	}

	public void setPronoun(String pronoun) {
		this.pronoun = pronoun;
	}


	@Override
	public String toString() {
		return "PronounVO [pronounType=" + this.pronounType + ", pronoun=" + this.pronoun + "]";
	}
	
	
	
	
	
}
