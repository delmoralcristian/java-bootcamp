package point6;

import java.util.ArrayList;
import java.util.List;

public class DemoShoppingCart {

	public static void main(String[] args) {
		MailList MarketManager= new MailList("marketmanager@gmail.com");
		Factory factory= new Factory();
		Transaction.getTransaction().setMailList(MarketManager);
		
		Product product1= new Product(0001, "notebook", 6000, 2, MarketManager);
		Product product2= new Product(0002, "phone", 5000, 3, MarketManager);
		Product product3= new Product(0003, "tv", 12000, 1, MarketManager);
		
		List<Product> products= new ArrayList<Product>();
		products.add(product1);
		products.add(product2);
		
		Offer offer1= new Offer(0010, "Combo", 10000, 3, MarketManager, products);
		
		
		User user1= new User("Cristian", "delmoral@gmail.com", "123456", 123456789);
		
		ShoppingCart shoppingCart= new ShoppingCart(user1);
		
		shoppingCart.addProduct(offer1); //Notify
		shoppingCart.addProduct(product3); //Notify
			
		try{
			AbstractPayment payment= factory.getPayment("Credit Card", shoppingCart.getSubtotal(), shoppingCart, MarketManager);
			System.out.println(shoppingCart.SubTotal());
			payment.setPercentage(0.1);
			payment.discount(shoppingCart);
			shoppingCart.setPayment(payment);
			Transaction.getTransaction().addTransaction(shoppingCart); //Notify
			System.out.println(payment.toString());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(MarketManager.ShowNotification());

		
	}

}
