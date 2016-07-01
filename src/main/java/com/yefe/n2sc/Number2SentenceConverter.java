package com.yefe.n2sc;

import java.util.List;

import com.yefe.n2sc.language.NumberLanguage;
import com.yefe.n2sc.parser.NumberParser;

/**
 * This class is used to convert from a number to a sentence. This class is thread-safe for only one locale if you want
 * to use for different locales you have to create an instance for each locale
 * 
 * @author Yasin EFE
 */
public class Number2SentenceConverter {

	private NumberLanguage numberLanguage;
	private NumberParser numberParser;

	/**
	 * This constructs a converter with given NumberLanguage and NumberParser.
	 */
	public Number2SentenceConverter(NumberLanguage numberLanguage, NumberParser numberParser) {
		this.numberLanguage = numberLanguage;
		this.numberParser = numberParser;
	}

	public String convert(long number) {
		if (number == 0) {
			return numberLanguage.getZero();
		}

		List<String> words = numberParser.parse(number);

		return writeToString(words);
	}

	private String writeToString(List<String> words) {
		StringBuffer sb = new StringBuffer();

		boolean first = true;
		if (words != null) {
			for (String word : words) {
				// If null or empty then pass this word
				if (word != null && !word.equals("")) {
					// if the first word so do not add space before this word.
					// We can trim but this is more efficent
					if (first) {
						sb.append(word);
					} else {
						sb.append(numberLanguage.getSpace()).append(word);
					}
				}
				first = false;
			}
		}
		return sb.toString();
	}

}
