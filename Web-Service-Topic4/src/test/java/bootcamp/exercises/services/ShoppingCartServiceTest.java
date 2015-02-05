package bootcamp.exercises.services;

import static org.junit.Assert.assertEquals;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import bootcamp.exercises.classes.CashMethod;
import bootcamp.exercises.classes.CreditCardMethod;
import bootcamp.exercises.classes.PaypalMethod;
import bootcamp.exercises.classes.Product;

public class ShoppingCartServiceTest {

	
	Product product1= new Product("0001", "notebook", 1000);
	Product product2= new Product("0002", "phone", 1000);
	Product product3= new Product("0003", "tv", 1000);
	ShoppingCartService shoppingCart= new ShoppingCartService();
	
	
	
	@Before
	public void startShoppicCart(){
		shoppingCart= new ShoppingCartService();
	}
	
	
	@After
	public void delete(){
		shoppingCart.cancelPurchase();
	}
	
	@Test
	public void testTotal() {
		shoppingCart.addProductToShoppingCart(product1, 1);
		shoppingCart.addProductToShoppingCart(product2, 2);
		shoppingCart.addProductToShoppingCart(product3, 3);
		Assert.assertEquals(shoppingCart.getSubTotal(), 6000.0);
	}
	
	
	@Test
	public void testDeleteProduct(){
		shoppingCart.addProductToShoppingCart(product1, 1);
		shoppingCart.addProductToShoppingCart(product2, 2);
		shoppingCart.addProductToShoppingCart(product3, 3);
		shoppingCart.deleteProduct("0003", 2);
		Assert.assertEquals(shoppingCart.getSubTotal(), 4000.0);
	}
	
	@Test
	public void testDeleteProduct2(){
		shoppingCart.addProductToShoppingCart(product1, 1);
		shoppingCart.addProductToShoppingCart(product2, 2);
		shoppingCart.addProductToShoppingCart(product3, 3);
		shoppingCart.deleteProduct("0003", 4);
		Assert.assertEquals(shoppingCart.getSubTotal(), 6000.0);
	}
	
	@Test
	public void testDeleteProduct3(){
		shoppingCart.addProductToShoppingCart(product1, 1);
		shoppingCart.addProductToShoppingCart(product2, 2);
		shoppingCart.addProductToShoppingCart(product3, 3);
		shoppingCart.deleteProduct("0003", 3);
		Assert.assertEquals(shoppingCart.getSubTotal(), 3000.0);
	}
	
	@Test
	public void testPayCashMethod(){
		shoppingCart.addProductToShoppingCart(product1, 1);
		shoppingCart.addProductToShoppingCart(product2, 2);
		shoppingCart.addProductToShoppingCart(product3, 3);
		assertEquals(shoppingCart.payShoppingCart(new CashMethod()), "The Total Amount is: 5100.0 and the Discount is: 900.0");
	}
	
	@Test
	public void testPayCreditCard(){
		shoppingCart.addProductToShoppingCart(product1, 1);
		shoppingCart.addProductToShoppingCart(product2, 2);
		shoppingCart.addProductToShoppingCart(product3, 3);
		assertEquals(shoppingCart.payShoppingCart(new CreditCardMethod("Cristian", 123456)), "The Total Amount is: 5400.0 and the Discount is: 600.0");
	}
	
	@Test
	public void testPayPaypal(){
		shoppingCart.addProductToShoppingCart(product1, 1);
		shoppingCart.addProductToShoppingCart(product2, 2);
		shoppingCart.addProductToShoppingCart(product3, 3);
		assertEquals(shoppingCart.payShoppingCart(new PaypalMethod("delmoral@gmail.com", "123456")), "The Total Amount is: 5000.0 and the Discount is: 1000.0");
	}

}
