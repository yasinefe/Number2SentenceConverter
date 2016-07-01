package com.yefe.n2sc.language;

/**
 * This interface is used for define number language for different locales
 * 
 * @author Yasin EFE
 */
public interface NumberLanguage {

	/**
	 * @return negative
	 */
	String getNegative();

	/**
	 * @param groupIndex
	 *            contains group index, group index = 0 for first NNN group.
	 * @return group name for example return thousand for 1
	 */
	String getGroup(long groupIndex);

	/**
	 * @param hundredDigit
	 * @return hundred sentence like 'one hundred'
	 */
	String getHundred(long hundredDigit);

	/**
	 * @param number
	 * @return name of the given number
	 */
	String getWord(long number);

	/**
	 * @return zero
	 */
	String getZero();

	/**
	 * @return space
	 */
	String getSpace();

	/**
	 * @return and if you dont want to use return empty string
	 */
	String getAnd();

}
