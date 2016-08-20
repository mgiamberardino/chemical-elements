package com.mgiamberardino.challenges.chemical_elements.rules;

public class ContainCharactersSymbolRule implements SymbolRule {

	public boolean satisfy(String element, String symbol) {
		for (Character c : symbol.toCharArray()){
			if (element.indexOf(c.charValue()) < 0){
				return false;
			}
		}
		return true;
	}

}
