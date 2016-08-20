package com.mgiamberardino.challenges.chemical_elements.validators;

public final class Validators {

	private Validators(){
	}
	
	public static Validator NO_OP_VALIDATOR = new Validator() {
		
		public boolean isValid(String element, String symbol) {
			return true;
		}
	};
	
	
}
