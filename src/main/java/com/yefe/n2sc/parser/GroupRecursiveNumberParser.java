package com.yefe.n2sc.parser;

import java.util.ArrayList;
import java.util.List;

import com.yefe.n2sc.language.NumberLanguage;

/**
 * This class parse the number. This uses a recursive method for groups.
 * 
 * @author Yasin EFE
 */
public class GroupRecursiveNumberParser implements NumberParser {

	private NumberLanguage numberLanguage;

	public GroupRecursiveNumberParser(NumberLanguage numberLanguage) {
		this.numberLanguage = numberLanguage;
	}

	public List<String> parse(long number) {
		// I used string buffer firstly but to handle to put space character was more complex.
		// Becuase of this I am using List.
		List<String> words = new ArrayList<String>();

		long newNumber = number;

		// if the number is negative so add negative word
		if (newNumber < 0) {
			words.add(numberLanguage.getNegative());
			newNumber *= -1;
		}
		// I know that sending an object as a parameter and changing in the method is not a good practice
		// but in this case sending list and changing it in the method reduces the complexity.
		parseNumber(newNumber, 0L, words);

		return words;
	}

	private void parseNumber(long number, long groupIndex, List<String> words) {
		long reminder = number % 1000;
		long newNumber = (number - reminder) / 1000;

		if (newNumber > 0) {
			parseNumber(newNumber, groupIndex + 1, words);
		}
		parseGroup(reminder, words);
		if (reminder != 0 && groupIndex != 0) {
			words.add(numberLanguage.getGroup(groupIndex));
		}
	}

	private void parseGroup(long number, List<String> words) {
		long reminder = number % 100;
		long hundredDigit = (number - reminder) / 100;

		if (hundredDigit > 0) {
			words.add(numberLanguage.getHundred(hundredDigit));
		}
		// special case for eleven, twelve ... nineteen
		if (reminder > 10 && reminder < 20) {
			addAnd(hundredDigit, words);
			words.add(numberLanguage.getWord(reminder));
		} else {
			long lastDigit = reminder % 10;
			long decimalDigit = reminder - lastDigit;
			if (decimalDigit > 0) {
				addAnd(hundredDigit, words);
				words.add(numberLanguage.getWord(decimalDigit));
			}
			if (lastDigit > 0) {
				if (decimalDigit == 0) {
					addAnd(hundredDigit, words);
				}
				words.add(numberLanguage.getWord(lastDigit));
			}
		}
	}

	private void addAnd(long hundredDigit, List<String> words) {
		if (hundredDigit > 0) {
			words.add(numberLanguage.getAnd());
		}
	}
}
