package com.yefe.n2sc;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

import com.yefe.n2sc.Number2SentenceConverter;
import com.yefe.n2sc.language.LanguageFactory;
import com.yefe.n2sc.language.NumberLanguage;
import com.yefe.n2sc.parser.GroupRecursiveNumberParser;
import com.yefe.n2sc.parser.NumberParser;

/**
 * This test is written as integration test, this means we dont use any mock object. I know that this must be written
 * with a BDD framework such as JBehave, Spock, Cucumber, I want to keep simple for this case.
 * 
 * @author Yasin EFE
 */
public class Number2SentenceConverterIntegrationTests {

	@Test
	public void runTestsForEnglish() {
		NumberLanguage numberLanguage = LanguageFactory.getLanguage(Locale.ENGLISH);
		NumberParser numberParser = new GroupRecursiveNumberParser(numberLanguage);
		Number2SentenceConverter number2SentenceConverter = new Number2SentenceConverter(numberLanguage, numberParser);

		Assert.assertEquals("zero", number2SentenceConverter.convert(0));
		Assert.assertEquals("one", number2SentenceConverter.convert(1));
		Assert.assertEquals("eight", number2SentenceConverter.convert(8));
		Assert.assertEquals("ten", number2SentenceConverter.convert(10));
		Assert.assertEquals("thirteen", number2SentenceConverter.convert(13));
		Assert.assertEquals("eighteen", number2SentenceConverter.convert(18));
		Assert.assertEquals("twenty", number2SentenceConverter.convert(20));
		Assert.assertEquals("twenty five", number2SentenceConverter.convert(25));
		Assert.assertEquals("thirty", number2SentenceConverter.convert(30));
		Assert.assertEquals("one hundred", number2SentenceConverter.convert(100));
		Assert.assertEquals("one hundred and one", number2SentenceConverter.convert(101));
		Assert.assertEquals("one hundred and ten", number2SentenceConverter.convert(110));
		Assert.assertEquals("one hundred and eleven", number2SentenceConverter.convert(111));
		Assert.assertEquals("one hundred and twenty one", number2SentenceConverter.convert(121));
		Assert.assertEquals("one thousand", number2SentenceConverter.convert(1000));
		Assert.assertEquals("one thousand one hundred", number2SentenceConverter.convert(1100));
		Assert.assertEquals("one thousand one hundred and ten", number2SentenceConverter.convert(1110));
		Assert.assertEquals("one thousand one hundred and eleven", number2SentenceConverter.convert(1111));
		Assert.assertEquals("one thousand one", number2SentenceConverter.convert(1001));
		Assert.assertEquals("one thousand one hundred and one", number2SentenceConverter.convert(1101));
		Assert.assertEquals("ten thousand one", number2SentenceConverter.convert(10001));
		Assert.assertEquals("one hundred thousand one", number2SentenceConverter.convert(100001));
		Assert.assertEquals("one million one", number2SentenceConverter.convert(1000001));
		Assert.assertEquals("one hundred and eleven million one", number2SentenceConverter.convert(111000001));
		Assert.assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
				number2SentenceConverter.convert(999999999));

		Assert.assertEquals("negative one", number2SentenceConverter.convert(-1));
		Assert.assertEquals("negative eight", number2SentenceConverter.convert(-8));
		Assert.assertEquals("negative ten", number2SentenceConverter.convert(-10));
		Assert.assertEquals("negative thirteen", number2SentenceConverter.convert(-13));
		Assert.assertEquals("negative eighteen", number2SentenceConverter.convert(-18));
		Assert.assertEquals("negative twenty", number2SentenceConverter.convert(-20));
		Assert.assertEquals("negative twenty five", number2SentenceConverter.convert(-25));
		Assert.assertEquals("negative thirty", number2SentenceConverter.convert(-30));
		Assert.assertEquals("negative one hundred", number2SentenceConverter.convert(-100));
		Assert.assertEquals("negative one hundred and one", number2SentenceConverter.convert(-101));
		Assert.assertEquals("negative one hundred and ten", number2SentenceConverter.convert(-110));
		Assert.assertEquals("negative one hundred and eleven", number2SentenceConverter.convert(-111));
		Assert.assertEquals("negative one hundred and twenty one", number2SentenceConverter.convert(-121));
		Assert.assertEquals("negative one thousand", number2SentenceConverter.convert(-1000));
		Assert.assertEquals("negative one thousand one hundred", number2SentenceConverter.convert(-1100));
		Assert.assertEquals("negative one thousand one hundred and ten", number2SentenceConverter.convert(-1110));
		Assert.assertEquals("negative one thousand one hundred and eleven", number2SentenceConverter.convert(-1111));
		Assert.assertEquals("negative one thousand one", number2SentenceConverter.convert(-1001));
		Assert.assertEquals("negative one thousand one hundred and one", number2SentenceConverter.convert(-1101));
		Assert.assertEquals("negative ten thousand one", number2SentenceConverter.convert(-10001));
		Assert.assertEquals("negative one hundred thousand one", number2SentenceConverter.convert(-100001));
		Assert.assertEquals("negative one million one", number2SentenceConverter.convert(-1000001));
		Assert.assertEquals("negative one hundred and eleven million one", number2SentenceConverter.convert(-111000001));
		Assert.assertEquals("negative nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
				number2SentenceConverter.convert(-999999999));
	}

	@Test
	public void runTestsForTurkish() {
		NumberLanguage numberLanguage = LanguageFactory.getLanguage(new Locale("tr", "TR"));
		NumberParser numberParser = new GroupRecursiveNumberParser(numberLanguage);
		Number2SentenceConverter number2SentenceConverter = new Number2SentenceConverter(numberLanguage, numberParser);

		Assert.assertEquals("eksi dokuz yuz doksan dokuz milyon dokuz yuz doksan dokuz bin dokuz yuz doksan dokuz",
				number2SentenceConverter.convert(-999999999));
	}
}
