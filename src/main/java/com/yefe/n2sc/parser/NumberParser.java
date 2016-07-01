package com.yefe.n2sc.parser;

import java.util.List;

/**
 * This interface is used to parse a number.
 * 
 * @author Yasin EFE
 */
public interface NumberParser {

	/**
	 * Parses the number and returns strings will construct the sentence
	 * 
	 * @param number
	 * @return string list. String list can contain null and empty string, they should be ignored
	 */
	List<String> parse(long number);

}
