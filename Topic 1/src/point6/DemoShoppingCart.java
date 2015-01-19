package point6;

import java.util.ArrayList;
import java.util.List;

public class DemoShoppingCart {

	public static void main(String[] args) {
		Observer marketManager= new MarketManager();

		AbstractProduct product1= new Product("0001", "notebook", 6000, 2);
		AbstractProduct product2= new Product("0002", "phone", 5000, 3);
		AbstractProduct product3= new Product("0003", "tv", 9000);
		
		List<AbstractProduct> products= new ArrayList<AbstractProduct>();
		products.add(product1);
		products.add(product2);
		
		Offer offer1= new Offer("0010", "Combo", 10000, products);
		
		
		
		ShoppingCart shoppingCart= new ShoppingCart();
		
		shoppingCart.addObserver(marketManager);
		
		shoppingCart.addProduct(offer1); //Notify
		shoppingCart.addProduct(product3); //Notify
		
		shoppingCart.changePrice("0003", 8000);
			
		System.out.println(shoppingCart.SubTotal());
		
		shoppingCart.pay(new CashMethod());
		

		
	}

}
