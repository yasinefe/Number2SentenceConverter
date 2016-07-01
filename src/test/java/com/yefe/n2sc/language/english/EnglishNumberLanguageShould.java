package com.yefe.n2sc.language.english;

import java.util.Locale;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.yefe.n2sc.language.english.EnglishNumberLanguage;
import com.yefe.n2sc.language.english.EnglishWordOfNumber;

public class EnglishNumberLanguageShould {

	private EnglishNumberLanguage englishNumberLanguage;
	private Locale locale;

	@Before
	public void setup() {
		englishNumberLanguage = new EnglishNumberLanguage();
		locale = Locale.ENGLISH;
	}

	@Test
	public void returnNegativeWhenGetNegativeIsCalled() {
		// When and Then
		Assert.assertEquals(EnglishNumberLanguage.NEGATIVE, englishNumberLanguage.getNegative());
	}

	@Test
	public void returnThousandWhenGetGroupIsCalledAndGroupIndexIsOne() {
		// When and Then
		Assert.assertEquals(EnglishWordOfNumber.THOUSAND.name().toLowerCase(locale), englishNumberLanguage.getGroup(1));
	}

	@Test
	public void returnMillionWhenGetGroupIsCalledAndGroupIndexIsTwo() {
		// When and Then
		Assert.assertEquals(EnglishWordOfNumber.MILLION.name().toLowerCase(locale), englishNumberLanguage.getGroup(2));
	}

	@Test
	public void returnHundredWhenGetHundredIsCalled() {
		// Given
		String expected = EnglishWordOfNumber.THREE.name().toLowerCase(locale) + EnglishNumberLanguage.SPACE
				+ EnglishWordOfNumber.HUNDRED.name().toLowerCase(locale);
		// When and Then
		Assert.assertEquals(expected, englishNumberLanguage.getHundred(3));
	}

	@Test
	public void returnNumberWhenGetWordIsCalled() {
		// When and Then
		Assert.assertEquals(EnglishWordOfNumber.ZERO.name().toLowerCase(locale), englishNumberLanguage.getWord(0));
		Assert.assertEquals(EnglishWordOfNumber.ONE.name().toLowerCase(locale), englishNumberLanguage.getWord(1));
		Assert.assertEquals(EnglishWordOfNumber.TWO.name().toLowerCase(locale), englishNumberLanguage.getWord(2));
		Assert.assertEquals(EnglishWordOfNumber.THREE.name().toLowerCase(locale), englishNumberLanguage.getWord(3));
		Assert.assertEquals(EnglishWordOfNumber.FOUR.name().toLowerCase(locale), englishNumberLanguage.getWord(4));
		Assert.assertEquals(EnglishWordOfNumber.FIVE.name().toLowerCase(locale), englishNumberLanguage.getWord(5));
		Assert.assertEquals(EnglishWordOfNumber.SIX.name().toLowerCase(locale), englishNumberLanguage.getWord(6));
		Assert.assertEquals(EnglishWordOfNumber.SEVEN.name().toLowerCase(locale), englishNumberLanguage.getWord(7));
		Assert.assertEquals(EnglishWordOfNumber.EIGHT.name().toLowerCase(locale), englishNumberLanguage.getWord(8));
		Assert.assertEquals(EnglishWordOfNumber.NINE.name().toLowerCase(locale), englishNumberLanguage.getWord(9));
		Assert.assertEquals(EnglishWordOfNumber.TEN.name().toLowerCase(locale), englishNumberLanguage.getWord(10));
		Assert.assertEquals(EnglishWordOfNumber.ELEVEN.name().toLowerCase(locale), englishNumberLanguage.getWord(11));
		Assert.assertEquals(EnglishWordOfNumber.TWELVE.name().toLowerCase(locale), englishNumberLanguage.getWord(12));
		Assert.assertEquals(EnglishWordOfNumber.THIRTEEN.name().toLowerCase(locale), englishNumberLanguage.getWord(13));
		Assert.assertEquals(EnglishWordOfNumber.FOURTEEN.name().toLowerCase(locale), englishNumberLanguage.getWord(14));
		Assert.assertEquals(EnglishWordOfNumber.FIFTEEN.name().toLowerCase(locale), englishNumberLanguage.getWord(15));
		Assert.assertEquals(EnglishWordOfNumber.SIXTEEN.name().toLowerCase(locale), englishNumberLanguage.getWord(16));
		Assert.assertEquals(EnglishWordOfNumber.SEVENTEEN.name().toLowerCase(locale), englishNumberLanguage.getWord(17));
		Assert.assertEquals(EnglishWordOfNumber.EIGHTEEN.name().toLowerCase(locale), englishNumberLanguage.getWord(18));
		Assert.assertEquals(EnglishWordOfNumber.NINETEEN.name().toLowerCase(locale), englishNumberLanguage.getWord(19));
		Assert.assertEquals(EnglishWordOfNumber.TWENTY.name().toLowerCase(locale), englishNumberLanguage.getWord(20));
		Assert.assertEquals(EnglishWordOfNumber.THIRTY.name().toLowerCase(locale), englishNumberLanguage.getWord(30));
		Assert.assertEquals(EnglishWordOfNumber.FORTY.name().toLowerCase(locale), englishNumberLanguage.getWord(40));
		Assert.assertEquals(EnglishWordOfNumber.FIFTY.name().toLowerCase(locale), englishNumberLanguage.getWord(50));
		Assert.assertEquals(EnglishWordOfNumber.SIXTY.name().toLowerCase(locale), englishNumberLanguage.getWord(60));
		Assert.assertEquals(EnglishWordOfNumber.SEVENTY.name().toLowerCase(locale), englishNumberLanguage.getWord(70));
		Assert.assertEquals(EnglishWordOfNumber.EIGHTY.name().toLowerCase(locale), englishNumberLanguage.getWord(80));
		Assert.assertEquals(EnglishWordOfNumber.NINETY.name().toLowerCase(locale), englishNumberLanguage.getWord(90));
		Assert.assertEquals(EnglishWordOfNumber.HUNDRED.name().toLowerCase(locale), englishNumberLanguage.getWord(100));
		Assert.assertEquals(EnglishWordOfNumber.THOUSAND.name().toLowerCase(locale), englishNumberLanguage.getWord(1000));
		Assert.assertEquals(EnglishWordOfNumber.MILLION.name().toLowerCase(locale), englishNumberLanguage.getWord(1000000));
	}

	@Test
	public void returnZeroWhenGetZeroIsCalled() {
		// When and Then
		Assert.assertEquals(EnglishWordOfNumber.ZERO.name().toLowerCase(locale), englishNumberLanguage.getZero());
	}

	@Test
	public void returnSpaceWhenGetSpaceIsCalled() {
		// When and Then
		Assert.assertEquals(EnglishNumberLanguage.SPACE, englishNumberLanguage.getSpace());
	}

	@Test
	public void returnAndWhenGetAndIsCalled() {
		// When and Then
		Assert.assertEquals(EnglishNumberLanguage.AND, englishNumberLanguage.getAnd());
	}
}
