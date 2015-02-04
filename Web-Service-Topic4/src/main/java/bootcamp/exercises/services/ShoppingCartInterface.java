package bootcamp.exercises.services;

import bootcamp.exercises.classes.PaymentInterface;
import bootcamp.exercises.classes.Product;

public interface ShoppingCartInterface {
	
	public double getSubTotal();
	
	public  void addProductToShoppingCart(Product product, int units);
	
	public void deleteProduct(String id_product, int units);
	
	public void cancelPurchase();
	
	public String payShoppingCart(PaymentInterface paymentInterface);

}
