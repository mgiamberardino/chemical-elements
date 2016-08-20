package com.mgiamberardino.challenges.chemical_elements.rules;

public class LengthSymbolRule implements SymbolRule {

	private Integer minLength;
	private Integer maxLength;
	
	public LengthSymbolRule(Integer minLength, Integer maxLength) {
		this.minLength = minLength;
		this.maxLength = maxLength;
	}
	
	public boolean satisfy(String element, String symbol) {
		return symbol.length() >= minLength
				&& symbol.length() <= maxLength;
	}

}
