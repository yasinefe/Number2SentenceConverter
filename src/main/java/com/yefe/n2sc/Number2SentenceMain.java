package com.yefe.n2sc;

import java.util.Locale;

import com.yefe.n2sc.language.LanguageFactory;
import com.yefe.n2sc.language.NumberLanguage;
import com.yefe.n2sc.parser.GroupRecursiveNumberParser;
import com.yefe.n2sc.parser.NumberParser;

/**
 * This class shows how to use Number2SentenceConverter
 * 
 * @author Yasin EFE
 */
public class Number2SentenceMain {

	public static String value;

	public static void main(String[] args) {
		NumberLanguage numberLanguage = LanguageFactory.getLanguage(Locale.ENGLISH);
		NumberParser numberParser = new GroupRecursiveNumberParser(numberLanguage);
		Number2SentenceConverter number2SentenceConverter = new Number2SentenceConverter(numberLanguage, numberParser);

		value = number2SentenceConverter.convert(-999999999L);
		System.out.println(value);
	}
}
