package com.mgiamberardino.challenges.chemical_elements.rules;

public class ChainSymbolRule implements SymbolRule {

	private SymbolRule instance;
	private SymbolRule next;

	public ChainSymbolRule(SymbolRule validator) {
		this.instance=validator;
	}
	
	public ChainSymbolRule next(SymbolRule validator){
		this.next = validator;
		return this;
	}
	
	public boolean satisfy(String element, String symbol) {
		return instance.satisfy(element, symbol) 
				&& (null == next || next.satisfy(element, symbol));
	}

}