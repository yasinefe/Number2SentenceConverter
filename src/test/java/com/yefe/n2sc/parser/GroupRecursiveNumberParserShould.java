package com.yefe.n2sc.parser;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.yefe.n2sc.language.NumberLanguage;
import com.yefe.n2sc.parser.GroupRecursiveNumberParser;

public class GroupRecursiveNumberParserShould {

	private NumberLanguage numberLanguage;
	private GroupRecursiveNumberParser groupRecursiveNumberParser;

	@Before
	public void setup() {
		numberLanguage = Mockito.mock(NumberLanguage.class);
		groupRecursiveNumberParser = new GroupRecursiveNumberParser(numberLanguage);
	}

	@Test
	// This is the base test case
	public void returnOneWhenNumberIs1() {
		// Given
		String one = "one";
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(1);

		// Then
		List<String> expected = Arrays.asList(one);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for negative case
	public void returnNegativeOneWhenNumberIsNegative1() {
		// Given
		String one = "one";
		String negative = "negative";
		Mockito.when(numberLanguage.getNegative()).thenReturn(negative);
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(-1);

		// Then
		List<String> expected = Arrays.asList(negative, one);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for only hundred usage case
	public void returnOneHundredWhenNumberIs100() {
		// Given
		String oneHundred = "one hundred";
		Mockito.when(numberLanguage.getHundred(1)).thenReturn(oneHundred);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(100);

		// Then
		List<String> expected = Arrays.asList(oneHundred);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for there is no decimal case
	public void returnOneHundredAndOneWhenNumberIs101() {
		// Given
		String oneHundred = "one hundred";
		String and = "and";
		String one = "one";
		Mockito.when(numberLanguage.getHundred(1)).thenReturn(oneHundred);
		Mockito.when(numberLanguage.getAnd()).thenReturn(and);
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(101);

		// Then
		List<String> expected = Arrays.asList(oneHundred, and, one);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for special decimal numbers
	public void returnThirteenWhenNumberIs13() {
		// Given
		String thirteen = "thirteen";
		Mockito.when(numberLanguage.getWord(13)).thenReturn(thirteen);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(13);

		// Then
		List<String> expected = Arrays.asList(thirteen);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for decimal and number case
	public void returnTwentySixWhenNumberIs26() {
		// Given
		String twenty = "twenty";
		String six = "six";
		Mockito.when(numberLanguage.getWord(20)).thenReturn(twenty);
		Mockito.when(numberLanguage.getWord(6)).thenReturn(six);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(26);

		// Then
		List<String> expected = Arrays.asList(twenty, six);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for more than one group case
	public void returnOneThousandWhenNumberIs1000() {
		// Given
		String one = "one";
		String thousand = "thousand";
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);
		Mockito.when(numberLanguage.getGroup(1)).thenReturn(thousand);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(1000);

		// Then
		List<String> expected = Arrays.asList(one, thousand);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for more than one group and only decimal case
	public void returnOneThousandTenWhenNumberIs1010() {
		// Given
		String one = "one";
		String thousand = "thousand";
		String ten = "ten";
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);
		Mockito.when(numberLanguage.getGroup(1)).thenReturn(thousand);
		Mockito.when(numberLanguage.getWord(10)).thenReturn(ten);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(1010);

		// Then
		List<String> expected = Arrays.asList(one, thousand, ten);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for more than one group and only last digit case
	public void returnOneThousandOneWhenNumberIs1001() {
		// Given
		String one = "one";
		String thousand = "thousand";
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);
		Mockito.when(numberLanguage.getGroup(1)).thenReturn(thousand);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(1001);

		// Then
		List<String> expected = Arrays.asList(one, thousand, one);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for million case
	public void returnOneMillionWhenNumberIs1000000() {
		// Given
		String one = "one";
		String million = "million";
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);
		Mockito.when(numberLanguage.getGroup(2)).thenReturn(million);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(1000000);

		// Then
		List<String> expected = Arrays.asList(one, million);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for million, thousand and one case
	public void returnOneMillionOneThousandOneWhenNumberIs1001001() {
		// Given
		String one = "one";
		String million = "million";
		String thousand = "thousand";
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);
		Mockito.when(numberLanguage.getGroup(1)).thenReturn(thousand);
		Mockito.when(numberLanguage.getGroup(2)).thenReturn(million);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(1001001);

		// Then
		List<String> expected = Arrays.asList(one, million, one, thousand, one);
		Assert.assertEquals(expected, actual);
	}

	@Test
	// This is for million, thousand and one hundred one case
	public void returnOneMillionOneThousandOneHundredAndOneWhenNumberIs1001101() {
		// Given
		String one = "one";
		String million = "million";
		String thousand = "thousand";
		String oneHundred = "one hundred";
		String and = "and";
		Mockito.when(numberLanguage.getWord(1)).thenReturn(one);
		Mockito.when(numberLanguage.getGroup(1)).thenReturn(thousand);
		Mockito.when(numberLanguage.getGroup(2)).thenReturn(million);
		Mockito.when(numberLanguage.getHundred(1)).thenReturn(oneHundred);
		Mockito.when(numberLanguage.getAnd()).thenReturn(and);

		// When
		List<String> actual = groupRecursiveNumberParser.parse(1001101);

		// Then
		List<String> expected = Arrays.asList(one, million, one, thousand, oneHundred, and, one);
		Assert.assertEquals(expected, actual);
	}

}
