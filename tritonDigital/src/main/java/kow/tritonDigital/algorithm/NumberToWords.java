package kow.tritonDigital.algorithm;

import java.util.Stack;

public class NumberToWords {

	/**
	 * 
	 * @param i
	 *            param should be between 1 and 10
	 * @return word version the number i
	 */
	private String _1To10(int i) {

		String inWords = "";
		switch (i) {
		case 1:
			inWords = "one";
			break;
		case 2:
			inWords = "two";
			break;
		case 3:
			inWords = "three";
			break;
		case 4:
			inWords = "four";
			break;
		case 5:
			inWords = "five";
			break;
		case 6:
			inWords = "six";
			break;
		case 7:
			inWords = "seven";
			break;
		case 8:
			inWords = "eight";
			break;
		case 9:
			inWords = "nine";
			break;
		case 10:
			inWords = "ten";
			break;
		default:
			inWords = "";
			break;
		}
		return inWords;
	}

	/**
	 * 
	 * @param i
	 *            i should be between 11 and 20
	 * @return word version the number i
	 */
	private String _11To19(int i) {
		String inWords = "";
		switch (i % 20) {
		case 11:
			inWords = "eleven";
			break;
		case 12:
			inWords = "twelve";
			break;
		case 13:
			inWords = "thirteen";
			break;
		default:
			inWords = _1To10(i) + "teen";
			break;
		}
		return inWords;
	}

	/**
	 * 
	 * @param i
	 *            i should be between 20 and 100
	 * @return word version the number i
	 */
	private String _20To99(int i) {
		int remainder = i % 10;
		int quotient = i / 10;
		StringBuilder inWords = new StringBuilder();

		switch (quotient) {
		case 2:
			inWords.append("twen");
			break;
		case 3:
			inWords.append("thir");
			break;
		case 4:
			inWords.append("for");
			break;
		case 5:
			inWords.append("fif");
			break;
		case 8:
			inWords.append("eigh");
			break;
		default:
			inWords.append(_1To10(quotient));
			break;
		}
		inWords.append("ty ");
		if (remainder != 0)
			inWords.append(_1To10(remainder));

		return inWords.toString();
	}

	/**
	 * 
	 * @param i
	 *            i should be between 1 and 99 inclusive
	 * @return word version the number i
	 */
	public String lessthan100(int i) {
		String inWords = "";
		if (i <= 10) {
			inWords = _1To10(i);
		}

		if ((i > 10) && (i < 20)) {
			inWords = _11To19(i);
		}

		if (i > 20) {
			inWords = _20To99(i);
		}
		return inWords;
	}

	/**
	 * 
	 * @param i
	 *            i should be less than 1000
	 * @return
	 */
	public String lessthan1000(int i) {
		i = i % 1000;// to ensure value < 1000
		int hundreds = i / 100;
		int remainder = i % 100;
		StringBuilder inWords = new StringBuilder();
		if (hundreds > 0)
			inWords.append(_1To10(hundreds)).append(" ").append("hundred");
		if (remainder > 0)
			inWords.append(" ").append(lessthan100(remainder));
		return inWords.toString();
	}

	/**
	 * 
	 * @param i
	 *            i can be any positive long greater than 0 *
	 * @return number in words
	 */
	public String inWords(long i) {

		if (i == 0) {
			return "Zero";
		}

		byte thousandPower = 0;
		String numberTowords = "";
		Stack<String> s = new Stack<String>();

		do {
			int remainder = (int) (i % 1000);
			if (remainder != 0) {
				numberTowords += (lessthan1000(remainder)) + " "
						+ thousandPowerInWords(thousandPower);
				s.push(numberTowords);
			}

			numberTowords = "";
			i = i / 1000;

			if (i > 0) {
				thousandPower += 1;
			}
		} while (i > 0);

		StringBuilder sb = new StringBuilder();
		while (!s.isEmpty()) {
			sb.append(s.pop());
			if (!s.empty())
				sb.append(", ");
		}

		// we make the first character uppercase
		String firstCharacter = (sb.charAt(0) + "").toUpperCase();
		sb.replace(0, 1, firstCharacter);
		return sb.toString().trim();
	}

	private String thousandPowerInWords(byte b) {
		String inWords = "";
		switch (b) {
		case 1:
			inWords = "thousand";
			break;
		case 2:
			inWords = "million";
			break;
		}
		return inWords;
	}

	public static void main(String[] args) {
		NumberToWords numToWord = new NumberToWords();
		// System.out.println(numToWord.lessthan1000(981));
		System.out.println(numToWord.inWords(100282));
		System.out.println(numToWord.inWords(10));
	}

}
