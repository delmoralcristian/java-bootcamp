package bootcamp.exercises;

public class Roman {
	private final char[] romanNumbers= {' ','I','V','X','L','C','D','M'};
	private final int[] numbers = {0,1,5,10,50,100,500,1000};
	 
	
	
	private boolean validWord (char word){
		for(int i = 0; i < romanNumbers.length; i++){
			if(romanNumbers[i]== word){
				return true;
			}
		}
		return false;
	}
	
	private boolean validRomanNumber(String romanNumber){
		char aux;
		for(int i = 0; i < romanNumber.length(); i++){
			aux = romanNumber.charAt(i);
			if(!this.validWord(aux)){
				return false;
			}
		}
		return true;
	}
	
	public int toDecimal(String romanNumber) {
		if(this.validRomanNumber(romanNumber)){
			int before = 0;
			int sum = 0;
			char aux;
			for(int i = 0; i < romanNumber.length(); i++){
				aux = romanNumber.charAt(i);
				for(int j = 0; j < romanNumbers.length; j++){
					if(aux == romanNumbers[j]){             
						sum += numbers[j];
						if( before < numbers[j]){ 
							sum -= before*2 ; 
							before = numbers[j];
						}
						else{
							before = numbers[j];
						}
					}	              
				}
			}
			return sum;
		}
		else{
			throw new OverflowException();
		}
	}
}	
