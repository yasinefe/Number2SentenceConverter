package com.yefe.n2sc.language;

import java.util.Locale;

import junit.framework.Assert;

import org.junit.Test;

import com.yefe.n2sc.language.LanguageFactory;
import com.yefe.n2sc.language.NumberLanguage;
import com.yefe.n2sc.language.english.EnglishNumberLanguage;
import com.yefe.n2sc.language.turkish.TurkishNumberLanguage;

public class LanguageFactoryShould {

	@Test
	public void returnEnglishNumberLanguageWhenGivenLocaleIsEnglish() {
		NumberLanguage language = LanguageFactory.getLanguage(Locale.ENGLISH);
		Assert.assertTrue(language instanceof EnglishNumberLanguage);
	}

	@Test
	public void returnTurkishNumberLanguageWhenGivenLocaleIsTurkish() {
		NumberLanguage language = LanguageFactory.getLanguage(new Locale("tr", "TR"));
		Assert.assertTrue(language instanceof TurkishNumberLanguage);
	}

	@Test
	public void returnEnglishNumberLanguageWhenGivenLocaleIsNotSupported() {
		NumberLanguage language = LanguageFactory.getLanguage(Locale.CHINESE);
		Assert.assertTrue(language instanceof EnglishNumberLanguage);
	}
}
