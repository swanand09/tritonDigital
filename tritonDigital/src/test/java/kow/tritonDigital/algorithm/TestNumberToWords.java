package kow.tritonDigital.algorithm;

import org.junit.Test;

public class TestNumberToWords {
	@Test
	public void testHaveSpace() {
		NumberToWords numToWord = new NumberToWords();
		numToWord.inWords(12);
	    org.junit.Assert.assertEquals("must be true", "One hundred thousand, two hundred eighty two", numToWord.inWords(100282));
	  }
}
