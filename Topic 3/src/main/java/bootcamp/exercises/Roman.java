package bootcamp.exercises;

public class Roman {
	private static final char[] ROMAN_NUMBERS = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	private static final int[] NUMBERS = { 1, 5, 10, 50, 100, 500, 1000 };

	private boolean validWord(char word) {
		for (char i : ROMAN_NUMBERS) {
			if (i == word) {
				return true;
			}
		}
		return false;
	}

	private boolean validRomanNumber(String romanNumber) {
		// char leftNumber = romanNumber.charAt(0);
		char[] romanLetters = romanNumber.toCharArray();
		for (char i : romanLetters) {
			if (!this.validWord(i)) {
				return false;
			} /*
			 * else { if (numberSearch(leftNumber) >= numberSearch(i)) {
			 * leftNumber = i; } else { return false; } }
			 */
		}
		return true;
	}

	/*
	 * private int numberSearch(char word) { int result = 0; int aux = 0; for
	 * (char i : ROMAN_NUMBERS) { if (i == word) { result = aux; } aux++; // ; }
	 * return result; }
	 */

	public int toDecimal(String romanNumber) {
		if (this.validRomanNumber(romanNumber)) {
			int before = 9999999;
			int sum = 0;
			int numAux;
			char[] romanLetters = romanNumber.toCharArray();
			for (char i : romanLetters) {
				for (int j = 0; j < ROMAN_NUMBERS.length; j++) {
					if (i == ROMAN_NUMBERS[j]) {
						numAux = NUMBERS[j];
						sum += numAux;
						if (before < numAux) {
							sum -= before * 2;
						}
						before = numAux;
						break;
					}
				}
			}
			return sum;
		} else {
			throw new OverflowException();
		}
	}
}
