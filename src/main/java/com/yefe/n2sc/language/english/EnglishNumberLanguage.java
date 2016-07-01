package com.yefe.n2sc.language.english;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import com.yefe.n2sc.language.NumberLanguage;

/**
 * This class is English implementation of NumberLanguage interface for Locale.ENGLISH
 * 
 * @author Yasin EFE
 */
public class EnglishNumberLanguage implements NumberLanguage {

	public static final String AND = "and";
	public static final String SPACE = " ";
	public static final String NEGATIVE = "negative";

	private Map<Long, String> numberWordMap = new TreeMap<Long, String>();

	private Locale locale = Locale.ENGLISH;

	public EnglishNumberLanguage() {
		numberWordMap.put(0L, toLowerCase(EnglishWordOfNumber.ZERO));
		numberWordMap.put(1L, toLowerCase(EnglishWordOfNumber.ONE));
		numberWordMap.put(2L, toLowerCase(EnglishWordOfNumber.TWO));
		numberWordMap.put(3L, toLowerCase(EnglishWordOfNumber.THREE));
		numberWordMap.put(4L, toLowerCase(EnglishWordOfNumber.FOUR));
		numberWordMap.put(5L, toLowerCase(EnglishWordOfNumber.FIVE));
		numberWordMap.put(6L, toLowerCase(EnglishWordOfNumber.SIX));
		numberWordMap.put(7L, toLowerCase(EnglishWordOfNumber.SEVEN));
		numberWordMap.put(8L, toLowerCase(EnglishWordOfNumber.EIGHT));
		numberWordMap.put(9L, toLowerCase(EnglishWordOfNumber.NINE));
		numberWordMap.put(10L, toLowerCase(EnglishWordOfNumber.TEN));
		numberWordMap.put(11L, toLowerCase(EnglishWordOfNumber.ELEVEN));
		numberWordMap.put(12L, toLowerCase(EnglishWordOfNumber.TWELVE));
		numberWordMap.put(13L, toLowerCase(EnglishWordOfNumber.THIRTEEN));
		numberWordMap.put(14L, toLowerCase(EnglishWordOfNumber.FOURTEEN));
		numberWordMap.put(15L, toLowerCase(EnglishWordOfNumber.FIFTEEN));
		numberWordMap.put(16L, toLowerCase(EnglishWordOfNumber.SIXTEEN));
		numberWordMap.put(17L, toLowerCase(EnglishWordOfNumber.SEVENTEEN));
		numberWordMap.put(18L, toLowerCase(EnglishWordOfNumber.EIGHTEEN));
		numberWordMap.put(19L, toLowerCase(EnglishWordOfNumber.NINETEEN));
		numberWordMap.put(20L, toLowerCase(EnglishWordOfNumber.TWENTY));
		numberWordMap.put(30L, toLowerCase(EnglishWordOfNumber.THIRTY));
		numberWordMap.put(40L, toLowerCase(EnglishWordOfNumber.FORTY));
		numberWordMap.put(50L, toLowerCase(EnglishWordOfNumber.FIFTY));
		numberWordMap.put(60L, toLowerCase(EnglishWordOfNumber.SIXTY));
		numberWordMap.put(70L, toLowerCase(EnglishWordOfNumber.SEVENTY));
		numberWordMap.put(80L, toLowerCase(EnglishWordOfNumber.EIGHTY));
		numberWordMap.put(90L, toLowerCase(EnglishWordOfNumber.NINETY));
		numberWordMap.put(100L, toLowerCase(EnglishWordOfNumber.HUNDRED));
		numberWordMap.put(1000L, toLowerCase(EnglishWordOfNumber.THOUSAND));
		numberWordMap.put(1000000L, toLowerCase(EnglishWordOfNumber.MILLION));
		// numberWordMap.put(1000000000L, toLowerCase(EnglishWordOfNumber.BILLION));
	}

	private String toLowerCase(EnglishWordOfNumber word) {
		return word.name().toLowerCase(locale);
	}

	public String getNegative() {
		return NEGATIVE;
	}

	public String getGroup(long groupIndex) {
		return numberWordMap.get((long) Math.pow(1000, groupIndex));
	}

	public String getHundred(long hundredDigit) {
		return numberWordMap.get(hundredDigit) + SPACE + numberWordMap.get(100L);
	}

	public String getWord(long number) {
		return numberWordMap.get(number);
	}

	public String getZero() {
		return EnglishWordOfNumber.ZERO.name().toLowerCase();
	}

	public String getSpace() {
		return SPACE;
	}

	public String getAnd() {
		return AND;
	}

}
