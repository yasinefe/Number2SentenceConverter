package com.yefe.n2sc.language.turkish;

import java.util.Locale;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.yefe.n2sc.language.turkish.TurkishNumberLanguage;
import com.yefe.n2sc.language.turkish.TurkishWordOfNumber;

public class TurkishNumberLanguageShould {

	private TurkishNumberLanguage turkishNumberLanguage;
	private Locale locale;

	@Before
	public void setup() {
		turkishNumberLanguage = new TurkishNumberLanguage();
		locale = new Locale("tr", "TR");
	}

	@Test
	public void returnNegativeWhenGetNegativeIsCalled() {
		// When and Then
		Assert.assertEquals(TurkishNumberLanguage.NEGATIVE, turkishNumberLanguage.getNegative());
	}

	@Test
	public void returnThousandWhenGetGroupIsCalledAndGroupIndexIsOne() {
		// When and Then
		Assert.assertEquals(TurkishWordOfNumber.BIN.name().toLowerCase(locale), turkishNumberLanguage.getGroup(1));
	}

	@Test
	public void returnMillionWhenGetGroupIsCalledAndGroupIndexIsTwo() {
		// When and Then
		Assert.assertEquals(TurkishWordOfNumber.MILYON.name().toLowerCase(locale), turkishNumberLanguage.getGroup(2));
	}

	@Test
	public void returnHundredWhenGetHundredIsCalled() {
		// Given
		String expected = TurkishWordOfNumber.UC.name().toLowerCase(locale) + TurkishNumberLanguage.SPACE
				+ TurkishWordOfNumber.YUZ.name().toLowerCase(locale);
		// When and Then
		Assert.assertEquals(expected, turkishNumberLanguage.getHundred(3L));
	}

	@Test
	public void returnNumberWhenGetWordIsCalled() {
		// When and Then
		Assert.assertEquals(TurkishWordOfNumber.SIFIR.name().toLowerCase(locale), turkishNumberLanguage.getWord(0));
		Assert.assertEquals(TurkishWordOfNumber.BIR.name().toLowerCase(locale), turkishNumberLanguage.getWord(1));
		Assert.assertEquals(TurkishWordOfNumber.IKI.name().toLowerCase(locale), turkishNumberLanguage.getWord(2));
		Assert.assertEquals(TurkishWordOfNumber.UC.name().toLowerCase(locale), turkishNumberLanguage.getWord(3));
		Assert.assertEquals(TurkishWordOfNumber.DORT.name().toLowerCase(locale), turkishNumberLanguage.getWord(4));
		Assert.assertEquals(TurkishWordOfNumber.BES.name().toLowerCase(locale), turkishNumberLanguage.getWord(5));
		Assert.assertEquals(TurkishWordOfNumber.ALTI.name().toLowerCase(locale), turkishNumberLanguage.getWord(6));
		Assert.assertEquals(TurkishWordOfNumber.YEDI.name().toLowerCase(locale), turkishNumberLanguage.getWord(7));
		Assert.assertEquals(TurkishWordOfNumber.SEKIZ.name().toLowerCase(locale), turkishNumberLanguage.getWord(8));
		Assert.assertEquals(TurkishWordOfNumber.DOKUZ.name().toLowerCase(locale), turkishNumberLanguage.getWord(9));
		Assert.assertEquals(TurkishWordOfNumber.ON.name().toLowerCase(locale), turkishNumberLanguage.getWord(10));
		String tmp = TurkishWordOfNumber.ON.name().toLowerCase(locale) + TurkishNumberLanguage.SPACE;
		Assert.assertEquals(tmp + TurkishWordOfNumber.BIR.name().toLowerCase(locale), turkishNumberLanguage.getWord(11));
		Assert.assertEquals(tmp + TurkishWordOfNumber.IKI.name().toLowerCase(locale), turkishNumberLanguage.getWord(12));
		Assert.assertEquals(tmp + TurkishWordOfNumber.UC.name().toLowerCase(locale), turkishNumberLanguage.getWord(13));
		Assert.assertEquals(tmp + TurkishWordOfNumber.DORT.name().toLowerCase(locale), turkishNumberLanguage.getWord(14));
		Assert.assertEquals(tmp + TurkishWordOfNumber.BES.name().toLowerCase(locale), turkishNumberLanguage.getWord(15));
		Assert.assertEquals(tmp + TurkishWordOfNumber.ALTI.name().toLowerCase(locale), turkishNumberLanguage.getWord(16));
		Assert.assertEquals(tmp + TurkishWordOfNumber.YEDI.name().toLowerCase(locale), turkishNumberLanguage.getWord(17));
		Assert.assertEquals(tmp + TurkishWordOfNumber.SEKIZ.name().toLowerCase(locale), turkishNumberLanguage.getWord(18));
		Assert.assertEquals(tmp + TurkishWordOfNumber.DOKUZ.name().toLowerCase(locale), turkishNumberLanguage.getWord(19));
		Assert.assertEquals(TurkishWordOfNumber.YIRMI.name().toLowerCase(locale), turkishNumberLanguage.getWord(20));
		Assert.assertEquals(TurkishWordOfNumber.OTUZ.name().toLowerCase(locale), turkishNumberLanguage.getWord(30));
		Assert.assertEquals(TurkishWordOfNumber.KIRK.name().toLowerCase(locale), turkishNumberLanguage.getWord(40));
		Assert.assertEquals(TurkishWordOfNumber.ELLI.name().toLowerCase(locale), turkishNumberLanguage.getWord(50));
		Assert.assertEquals(TurkishWordOfNumber.ALTMIS.name().toLowerCase(locale), turkishNumberLanguage.getWord(60));
		Assert.assertEquals(TurkishWordOfNumber.YETMIS.name().toLowerCase(locale), turkishNumberLanguage.getWord(70));
		Assert.assertEquals(TurkishWordOfNumber.SEKSEN.name().toLowerCase(locale), turkishNumberLanguage.getWord(80));
		Assert.assertEquals(TurkishWordOfNumber.DOKSAN.name().toLowerCase(locale), turkishNumberLanguage.getWord(90));
		Assert.assertEquals(TurkishWordOfNumber.YUZ.name().toLowerCase(locale), turkishNumberLanguage.getWord(100));
		Assert.assertEquals(TurkishWordOfNumber.BIN.name().toLowerCase(locale), turkishNumberLanguage.getWord(1000));
		Assert.assertEquals(TurkishWordOfNumber.MILYON.name().toLowerCase(locale), turkishNumberLanguage.getWord(1000000));
	}

	@Test
	public void returnZeroWhenGetZeroIsCalled() {
		// When and Then
		Assert.assertEquals(TurkishWordOfNumber.SIFIR.name().toLowerCase(locale), turkishNumberLanguage.getZero());
	}

	@Test
	public void returnSpaceWhenGetSpaceIsCalled() {
		// When and Then
		Assert.assertEquals(TurkishNumberLanguage.SPACE, turkishNumberLanguage.getSpace());
	}

	@Test
	public void returnAndWhenGetAndIsCalled() {
		// When and Then
		Assert.assertEquals(TurkishNumberLanguage.AND, turkishNumberLanguage.getAnd());
	}
}
