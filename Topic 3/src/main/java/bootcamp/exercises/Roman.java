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
		char[] romanLetters = romanNumber.toCharArray();
		for (char i : romanLetters) {
			if (!this.validWord(i)) {
				return false;
			}
		}
		return true;
	}

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
