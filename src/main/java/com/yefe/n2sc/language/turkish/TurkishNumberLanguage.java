package com.yefe.n2sc.language.turkish;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import com.yefe.n2sc.language.NumberLanguage;

/**
 * This class is Turkish implementation of NumberLanguage longerface for Locale tr-TR
 * 
 * @author Yasin EFE
 */
public class TurkishNumberLanguage implements NumberLanguage {

	public static final String AND = "";
	public static final String SPACE = " ";
	public static final String NEGATIVE = "eksi";

	private Map<Long, String> numberWordMap = new TreeMap<Long, String>();

	public TurkishNumberLanguage() {
		numberWordMap.put(0L, toLowerCase(TurkishWordOfNumber.SIFIR));
		numberWordMap.put(1L, toLowerCase(TurkishWordOfNumber.BIR));
		numberWordMap.put(2L, toLowerCase(TurkishWordOfNumber.IKI));
		numberWordMap.put(3L, toLowerCase(TurkishWordOfNumber.UC));
		numberWordMap.put(4L, toLowerCase(TurkishWordOfNumber.DORT));
		numberWordMap.put(5L, toLowerCase(TurkishWordOfNumber.BES));
		numberWordMap.put(6L, toLowerCase(TurkishWordOfNumber.ALTI));
		numberWordMap.put(7L, toLowerCase(TurkishWordOfNumber.YEDI));
		numberWordMap.put(8L, toLowerCase(TurkishWordOfNumber.SEKIZ));
		numberWordMap.put(9L, toLowerCase(TurkishWordOfNumber.DOKUZ));
		numberWordMap.put(10L, toLowerCase(TurkishWordOfNumber.ON));
		String tmp = toLowerCase(TurkishWordOfNumber.ON) + getSpace();
		numberWordMap.put(11L, tmp + toLowerCase(TurkishWordOfNumber.BIR));
		numberWordMap.put(12L, tmp + toLowerCase(TurkishWordOfNumber.IKI));
		numberWordMap.put(13L, tmp + toLowerCase(TurkishWordOfNumber.UC));
		numberWordMap.put(14L, tmp + toLowerCase(TurkishWordOfNumber.DORT));
		numberWordMap.put(15L, tmp + toLowerCase(TurkishWordOfNumber.BES));
		numberWordMap.put(16L, tmp + toLowerCase(TurkishWordOfNumber.ALTI));
		numberWordMap.put(17L, tmp + toLowerCase(TurkishWordOfNumber.YEDI));
		numberWordMap.put(18L, tmp + toLowerCase(TurkishWordOfNumber.SEKIZ));
		numberWordMap.put(19L, tmp + toLowerCase(TurkishWordOfNumber.DOKUZ));
		numberWordMap.put(20L, toLowerCase(TurkishWordOfNumber.YIRMI));
		numberWordMap.put(30L, toLowerCase(TurkishWordOfNumber.OTUZ));
		numberWordMap.put(40L, toLowerCase(TurkishWordOfNumber.KIRK));
		numberWordMap.put(50L, toLowerCase(TurkishWordOfNumber.ELLI));
		numberWordMap.put(60L, toLowerCase(TurkishWordOfNumber.ALTMIS));
		numberWordMap.put(70L, toLowerCase(TurkishWordOfNumber.YETMIS));
		numberWordMap.put(80L, toLowerCase(TurkishWordOfNumber.SEKSEN));
		numberWordMap.put(90L, toLowerCase(TurkishWordOfNumber.DOKSAN));
		numberWordMap.put(100L, toLowerCase(TurkishWordOfNumber.YUZ));
		numberWordMap.put(1000L, toLowerCase(TurkishWordOfNumber.BIN));
		numberWordMap.put(1000000L, toLowerCase(TurkishWordOfNumber.MILYON));
	}

	private String toLowerCase(TurkishWordOfNumber word) {
		return word.name().toLowerCase(Locale.ENGLISH);
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
		return TurkishWordOfNumber.SIFIR.name().toLowerCase();
	}

	public String getSpace() {
		return SPACE;
	}

	public String getAnd() {
		return AND;
	}

}
