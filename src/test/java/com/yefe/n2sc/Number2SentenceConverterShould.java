package com.yefe.n2sc;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.yefe.n2sc.Number2SentenceConverter;
import com.yefe.n2sc.language.NumberLanguage;
import com.yefe.n2sc.parser.NumberParser;
import com.yefe.n2sc.util.TestUtil;

public class Number2SentenceConverterShould {

	private Number2SentenceConverter number2SentenceConverter;
	private NumberParser numberParser;
	private NumberLanguage numberLanguage;
	private int number;

	@Before
	public void setup() {
		numberLanguage = Mockito.mock(NumberLanguage.class);
		numberParser = Mockito.mock(NumberParser.class);
		number2SentenceConverter = new Number2SentenceConverter(numberLanguage, numberParser);

		number = TestUtil.getInteger();
	}

	@Test
	public void returnZeroWhenGivenNumberIsZero() {
		// Given
		String expected = TestUtil.getString();
		Mockito.when(numberLanguage.getZero()).thenReturn(expected);

		// When
		String actual = number2SentenceConverter.convert(0);

		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void returnEmptyStringWhenReturnedListFromParserIsNull() {
		// Given
		List<String> words = null;
		Mockito.when(numberParser.parse(number)).thenReturn(words);

		// When
		String actual = number2SentenceConverter.convert(number);

		// Then
		Assert.assertEquals("", actual);
	}

	@Test
	public void returnEmptyStringWhenReturnedListFromParserIsEmpty() {
		// Given
		List<String> words = new ArrayList<String>();
		Mockito.when(numberParser.parse(number)).thenReturn(words);

		// When
		String actual = number2SentenceConverter.convert(number);

		// Then
		Assert.assertEquals("", actual);
	}

	@Test
	public void returnStringWhenReturnedListHasEmptyAndNullWord() {
		// Given
		List<String> words = new ArrayList<String>();
		String string1 = TestUtil.getString();
		String string2 = TestUtil.getString();
		String space = TestUtil.getString();

		words.add(string1);
		words.add(null);
		words.add("");
		words.add(string2);

		Mockito.when(numberLanguage.getSpace()).thenReturn(space);
		Mockito.when(numberParser.parse(number)).thenReturn(words);

		// When
		String actual = number2SentenceConverter.convert(number);

		// Then
		Assert.assertEquals(string1 + space + string2, actual);
	}

}
