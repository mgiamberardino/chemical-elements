package com.mgiamberardino.challenges.chemical_elements.symbols;

import com.mgiamberardino.challenges.chemical_elements.rules.ChainSymbolRule;
import com.mgiamberardino.challenges.chemical_elements.rules.LengthSymbolRule;
import com.mgiamberardino.challenges.chemical_elements.rules.Rules;
import com.mgiamberardino.challenges.chemical_elements.rules.SubsequenceSymbolRule;
import com.mgiamberardino.challenges.chemical_elements.rules.SymbolRule;
import com.mgiamberardino.challenges.chemical_elements.validators.Validator;

public final class SymbolsValidatorFactory {
		
	/**
	 * Rules for Splurth periodic table:
	 * 
	 * 1- All chemical symbols must be exactly two letters, so B is not a valid symbol for Boron.
	 * 
	 * 2- Both letters in the symbol must appear in the element name, but the first letter of the
	 * element name does not necessarily need to appear in the symbol. So Hg is not valid for 
	 * Mercury, but Cy is.
     * 
     * 3- The two letters must appear in order in the element name. So Vr is valid for Silver, 
     * but Rv is not. To be clear, both Ma and Am are valid for Magnesium, because there is both 
     * an a that appears after an m, and an m that appears after an a.
     * 
     * 4- If the two letters in the symbol are the same, it must appear twice in the element name.
     * So Nn is valid for Xenon, but Xx and Oo are not.
     * 
     * The rules 2, 3 and 4 are solved in the same validator
	 * @return
	 */
	public static Validator createSplurthSymbolValidator(){
		return new Validator() {
			
			SymbolRule rule = new ChainSymbolRuleBuilder()
			.next(new LengthSymbolRule(2, 2))
			.next(new SubsequenceSymbolRule())
			.build();
			
			public boolean isValid(String element, String symbol) {
				return rule.satisfy(element.toLowerCase(), symbol.toLowerCase());
			}
		};
	}
	
}
