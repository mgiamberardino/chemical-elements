package com.mgiamberardino.challenges.chemical_elements.rules;

public interface SymbolRule {

	/**
	 * Define an specific rule
	 * @param element
	 * @param symbol
	 * @return
	 */
	public boolean satisfy(String element, String symbol);
	
}
