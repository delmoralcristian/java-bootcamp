package bootcamp.exercises;

public class Decimal {
	 private final String[] romanNumbers	= {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};

	 private final int[] numbers = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	 
	 
	 public String toRoman(int number) {
		 if((number==0)|| (number > 1000)){
			 throw new OverflowException();
		 }
		 else{
			StringBuilder result = new StringBuilder();
			int i = 0;
			while (number > 0 || numbers.length == (i - 1)) {
				while ((number - numbers[i]) >= 0) {
					number -= numbers[i];
					result.append(romanNumbers[i]);
				}
				i++;
			}
			return result.toString();
		 }
	}
		 
}
