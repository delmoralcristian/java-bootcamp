package point6;

public enum EnumPayment {
	Cash("Cash"), CreditCard("Credit Card"), Paypal("Paypal");
	
	private String name;
	
	EnumPayment(String name){
		this.name= name;
	}

	public String getName() {
		return name;
	}
}
