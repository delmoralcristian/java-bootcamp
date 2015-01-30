package bootcamp.exercises.services;

import bootcamp.exercises.classes.Product;

public interface ShoppingCartInterface {
	
	public double getTotal();
	
	public  void addProductToShoppingCart(Product product);
	
	public void deleteProduct(Product product);

}
