package com.mgiamberardino.challenges.chemical_elements.rules;

public final class Rules {

	private Rules(){
		
	}
	
	public static final SymbolRule NO_OP_RULE = new SymbolRule() {
		
		public boolean satisfy(String element, String symbol) {
			return true;
		}
	};
}
