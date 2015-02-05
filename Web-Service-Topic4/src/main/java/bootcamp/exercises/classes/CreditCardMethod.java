package bootcamp.exercises.classes;

import bootcamp.exercises.services.ShoppingCartService;

public class CreditCardMethod implements PaymentInterface {

	private String name;
	private int creditNumber;
	private double percentage;

	public CreditCardMethod(String name, int creditNumber) {
		this.name= name;
		this.creditNumber= creditNumber;
		this.percentage= 0.10;

	}

	@Override
	public double discount(ShoppingCartService shoppingCart) {
		return shoppingCart.getSubTotal() * this.getPercentage();
	}
	
	@Override
	public String toString(){
		return("Paid using credit card payment: "+ "\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
