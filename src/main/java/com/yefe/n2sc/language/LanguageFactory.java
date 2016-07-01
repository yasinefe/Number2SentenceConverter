package com.yefe.n2sc.language;

import java.util.Locale;

import com.yefe.n2sc.language.english.EnglishNumberLanguage;
import com.yefe.n2sc.language.turkish.TurkishNumberLanguage;

/**
 * This is a factory pattern implementation and creates NumberLanguage implementation with given Locale parameter
 * 
 * @author Yasin EFE
 */
public final class LanguageFactory {

	public static NumberLanguage getLanguage(Locale locale) {
		if (new Locale("tr", "TR").equals(locale)) {
			return new TurkishNumberLanguage();
		} else if (Locale.ENGLISH.equals(locale)) {
			return new EnglishNumberLanguage();
		} else {
			return new EnglishNumberLanguage();
		}
	}

}
