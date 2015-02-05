package bootcamp.exercises.classes;


import bootcamp.exercises.services.ShoppingCartService;

public class CashMethod implements PaymentInterface {

	private double percentage;
	
	public CashMethod() {
		this.percentage= 0.90;
	}

	@Override
	public double discount(ShoppingCartService shoppingCart) {	
		return shoppingCart.getMoreExpensive() * this.getPercentage();
	}
	
	@Override
	public String toString(){
		return("Paid using cash payment: " + "\n");
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
