package bootcamp.exercises;

public class ConvertToText {
	private static final String[] UNITS = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	private static final String[] TENS = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	static final int hundred = 100;
	static final int thousand = 1000;
	static final int ten = 10;
	static final int nineteen = 19;
	static final int zeroHundred = 000;

	private boolean numberValid(String number) {
		try {
			Integer.parseInt(number);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public String convert(String number) {
		if (number == null) {
			throw new OverflowException();
		} else {
			number = number.replace(".", ",");
			if (number.indexOf(",") == -1) {
				number = number + ",00";
			}
			String Num[] = number.split(",");
			String decimalPart = Num[1];
			String integerPart = Num[0];
			int lenght = Num[0].length();
			int lenght2 = decimalPart.length();
			if ((lenght < 10) && (lenght2 < 3) && numberValid(integerPart) && numberValid(decimalPart)) {
				decimalPart = "and " + decimalPart + "/100 dollars.";
				if (Integer.parseInt(integerPart) == 0) {
					return "zero" + " " + decimalPart;
				} else {
					if (Integer.parseInt(integerPart) > 999999) {
						return getMillions(integerPart) + " " + decimalPart;
					} else {
						if (Integer.parseInt(integerPart) > 999) {
							return getThousands(integerPart) + " " + decimalPart;
						} else {
							if (Integer.parseInt(integerPart) > 99) {
								return getHundreds(integerPart) + " " + decimalPart;
							} else {
								if (Integer.parseInt(integerPart) > 9) {
									return getTens(integerPart) + " " + decimalPart;
								} else {
									return getUnits(integerPart) + " " + decimalPart;
								}
							}
						}
					}
				}
			} else {
				throw new OverflowException();
			}
		}
	}

	private String getUnits(String number) {
		String num = number.substring(number.length() - 1);
		return UNITS[Integer.parseInt(num)];
	}

	private String getTens(String number) {
		int n = Integer.parseInt(number);
		if (n < ten) {
			return getUnits(number);
		} else {
			if (n > nineteen) {
				String u = getUnits(number);
				if (u.equals("")) {
					return TENS[Integer.parseInt(number.substring(0, 1)) + 8];
				} else {
					return TENS[Integer.parseInt(number.substring(0, 1)) + 8] + "-" + u;
				}
			} else {
				return TENS[n - ten];
			}
		}
	}

	private String getHundreds(String number) {
		if (Integer.parseInt(number) == zeroHundred) {
			return "";
		} else {
			if (Integer.parseInt(number) == hundred) {
				return "hundred";
			} else {
				String unit = this.getUnits(number.substring(0, 1));
				if (number.substring(1, 2).equals("0")) {
					return (unit + " hundred " + this.getUnits(number.substring(2)));
				} else {
					return (unit + " hundred " + this.getTens(number.substring(1)));
				}
			}
		}
	}

	private String getThousands(String number) {
		if (Integer.parseInt(number) == thousand) {
			return "thousand";
		} else {
			if (number.length() == 4) {
				return (this.getUnits(number.substring(0, 1)) + " thousand " + this.getHundreds(number.substring(1)));
			} else {
				if (number.length() == 5) {
					if (number.substring(2, 3).equals("0")) {
						return (this.getTens(number.substring(0, 2)) + " thousand " + this.getTens(number.substring(3)));
					} else {
						return (this.getTens(number.substring(0, 2)) + " thousand " + this.getHundreds(number.substring(2)));
					}
				} else {
					return (this.getUnits(number.substring(0, 1)) + " hundred and " + this.getTens(number.substring(1, 3)) + " thousand " + this
							.getHundreds(number.substring(3)));
				}
			}
		}
	}

	private String getMillions(String number) {
		return (this.getHundreds(number.substring(0, 3)) + " million " + this.getThousands(number.substring(3)));
	}
}
