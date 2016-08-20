package com.mgiamberardino.challenges.chemical_elements.symbols;

import com.mgiamberardino.challenges.chemical_elements.rules.ChainSymbolRule;
import com.mgiamberardino.challenges.chemical_elements.rules.Rules;
import com.mgiamberardino.challenges.chemical_elements.rules.SymbolRule;

public class ChainSymbolRuleBuilder {
	
	private SymbolRule rule;

	public ChainSymbolRuleBuilder(){
		rule = Rules.NO_OP_RULE;
	}
	
	public ChainSymbolRuleBuilder next(SymbolRule next){
		rule = new ChainSymbolRule(rule).next(next);
		return this;
	}
	
	public SymbolRule build(){
		return rule;
	}

}