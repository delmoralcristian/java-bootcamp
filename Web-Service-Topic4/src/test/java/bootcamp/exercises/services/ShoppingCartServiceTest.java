package bootcamp.exercises.services;

import junit.framework.Assert;

import org.junit.Test;


import bootcamp.exercises.classes.Product;

public class ShoppingCartServiceTest {

	@Test
	public void testTotal() {
		Product product1= new Product("0001", "notebook", 1000, 1);
		Product product2= new Product("0002", "phone", 1000, 2);
		Product product3= new Product("0003", "tv", 1000, 3);
		ShoppingCartService shoppingCart= new ShoppingCartService();
		shoppingCart.addProductToShoppingCart(product1);
		shoppingCart.addProductToShoppingCart(product2);
		shoppingCart.addProductToShoppingCart(product3);
		Assert.assertEquals(shoppingCart.getTotal(), 6000.0);
	}

}
