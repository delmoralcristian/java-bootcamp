package bootcamp.exercises.classes;

import bootcamp.exercises.services.ShoppingCartService;



public interface PaymentInterface {
	
	public double discount(ShoppingCartService shoppingCart);
	
	public String toString();
}
