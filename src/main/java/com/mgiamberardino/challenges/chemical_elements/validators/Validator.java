package com.mgiamberardino.challenges.chemical_elements.validators;

/**
 * Validate symbols for chemicals elements
 * 
 * @author mgiamberardino
 *
 */
public interface Validator {

	/**
	 * Determines if a symbol is valid for an element
	 * 
	 * @param element the name of the element
	 * @param symbol the symbol proposed
	 * @return whether the proposed symbol is valid for the element or not
	 */
	public boolean isValid(String element, String symbol);
	
}
