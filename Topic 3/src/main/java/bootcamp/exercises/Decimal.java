package bootcamp.exercises;

public class Decimal {
	private static final String[] ROMAN_NUMBERS = { "M", "XM", "CM", "D", "XD", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	private static final int[] NUMBERS = { 1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	public String toRoman(int number) {
		if ((number < 1) || (number > 1000)) {
			throw new OverflowException();
		} else {
			StringBuilder result = new StringBuilder();
			int i = 0;
			while (number > 0 || NUMBERS.length == (i - 1)) {
				while ((number - NUMBERS[i]) >= 0) {
					number -= NUMBERS[i];
					result.append(ROMAN_NUMBERS[i]);
				}
				i++;
			}
			return result.toString();
		}
	}

}
