package bootcamp.exercices;

import junit.framework.Assert;

import org.junit.Test;


public class ShoppingCartTest {

	@Test
	public void testTotal() {
		AbstractProduct product1= new Product("0001", "notebook", 1000);
		AbstractProduct product2= new Product("0002", "phone", 1000);
		AbstractProduct product3= new Product("0003", "tv", 1000);
		ShoppingCart shoppingCart= new ShoppingCart();
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		shoppingCart.addProduct(product3);
		Assert.assertEquals(shoppingCart.getTotal(), 3000.0);
	}

}
