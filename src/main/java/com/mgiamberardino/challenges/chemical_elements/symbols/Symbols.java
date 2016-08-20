package com.mgiamberardino.challenges.chemical_elements.symbols;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public final class Symbols {

	public static int calculateSymbolAlternatives(String element) {
		Set<Character> letters = new HashSet<Character>();
		Set<Character> repeated = new HashSet<Character>();
		for (char c : element.toCharArray()) {
			if (letters.contains(c)) {
				repeated.add(c);
			}
			letters.add(c);
		}

		return ((letters.size() - 1) * letters.size() / 2) + repeated.size();
	}

	public static String createFirstAlphabeticalSymbol(String element) {
		String process = element.toLowerCase();
		TreeSet<Character> letters = new TreeSet<Character>();
		for (char c : process.toCharArray()) {
			letters.add(c);
		}
		Iterator<Character> it = letters.iterator();
		Character firstAlph = it.next();
		if (element.length() == (element.indexOf(firstAlph) + 1)){
			return new StringBuffer()
					.append(Character.toUpperCase(it.next()))
					.append(firstAlph).toString();
		}
		while(it.hasNext()){
			Character actual = it.next();
			if (element.indexOf(actual) > element.indexOf(firstAlph)){
				return new StringBuffer()
						.append(Character.toUpperCase(firstAlph))
						.append(actual).toString();
			}
		}
		return "";
	}

}
