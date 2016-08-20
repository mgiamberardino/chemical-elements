package com.mgiamberardino.challenges.chemical_elements.rules;

public class SubsequenceSymbolRule implements SymbolRule {

	public boolean satisfy(String element, String symbol) {
		String evaluated = element;
		for (char c : symbol.toCharArray()){
			int pos = evaluated.indexOf(c);
			if ( pos < 0 ){
				return false;
			}
			evaluated = evaluated.substring(pos+1);
		}
		return true;
	}

}
