package com.yefe.n2sc;

import org.junit.Assert;
import org.junit.Test;

import com.yefe.n2sc.Number2SentenceMain;

public class Number2SentenceMainShould {

	@Test
	public void shouldStartConverterAndConvert999999999NumberToSentence() {
		Number2SentenceMain.main(null);

		Assert.assertEquals("negative nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
				Number2SentenceMain.value);
	}

}
