package com.mgiamberardino.challenges.chemical_elements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mgiamberardino.challenges.chemical_elements.symbols.Symbols;
import com.mgiamberardino.challenges.chemical_elements.symbols.SymbolsValidatorFactory;

public class ChemicalsSymbolsTest{
	
	private static String SILVER = "Silver";
	private static String XENON = "Xenon";
	private static String SPENGLERIUM = "Spenglerium";
	private static String ZEDDEMORIUM = "Zeddemorium";
	private static String VENKMINE = "Venkmine";
	private static String STANTZON = "Stantzon";
	private static String MELINTZUM = "Melintzum";
	private static String TULLIUM = "Tullium";
	private static String ZUULON = "Zuulon";
	private static String GOZERIUM = "Gozerium";
	private static String SLIMYRINE = "Slimyrine";
	
	private void assertValid(boolean test){
		assertEquals(test, true);
	}
	
	private void assertInvalid(boolean test){
		assertEquals(test, false);
	}
	
	@Test
	public void test_valid_two_letters_symbols(){
		assertValid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(SILVER, "Iv"));
		assertValid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(XENON, "En"));
		assertValid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(SPENGLERIUM, "Ee"));
		assertValid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(ZEDDEMORIUM, "Zr"));
		assertValid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(VENKMINE, "Kn"));
		assertValid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(STANTZON, "Zn"));
		assertValid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(MELINTZUM, "Nm"));
		assertValid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(TULLIUM, "Iu"));
	}
	
	@Test
	public void test_invalid_two_letters_symbols(){
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(SILVER, "vi"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(XENON, "oe"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(SPENGLERIUM, "ml"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(ZEDDEMORIUM, "Mz"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(VENKMINE, "Kv"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(STANTZON, "Zt"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(MELINTZUM, "Nn"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(TULLIUM, "Ty"));
	}
	
	@Test
	public void test_ordered_included_three_letter_symbols(){
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(SILVER, "Slv"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(XENON, "Xnn"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(SPENGLERIUM, "Spu"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(ZEDDEMORIUM, "Ddi"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(VENKMINE, "Vmi"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(STANTZON, "Ttn"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(MELINTZUM, "Lzm"));
		assertInvalid(SymbolsValidatorFactory.createSplurthSymbolValidator().isValid(TULLIUM, "Llu"));
	}
	
	@Test
	public void test_alternatives_symbols(){
		assertEquals(Symbols.calculateSymbolAlternatives(ZUULON), 11);
	}
	
	@Test
	public void test_generate_first_alphabetical_symbol(){
		assertEquals("Ln", Symbols.createFirstAlphabeticalSymbol(ZUULON));
		assertEquals("Ei", Symbols.createFirstAlphabeticalSymbol(GOZERIUM));
		assertEquals("Ie", Symbols.createFirstAlphabeticalSymbol(SLIMYRINE));
	}
}
