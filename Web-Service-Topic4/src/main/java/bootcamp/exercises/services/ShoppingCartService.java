package bootcamp.exercises.services;

import java.util.ArrayList;
import java.util.List;

import bootcamp.exercises.classes.Product;

public class ShoppingCartService implements ShoppingCartInterface {

private List<Product> products;
	
	public ShoppingCartService(){
		this.products= new ArrayList<Product>();
	}
	
	@Override
	public double getTotal() {
		double aux= 0;
		for(Product i: this.products){
			aux += i.subTotalPrice();
		}
		return aux;
	}

	@Override
	public void addProductToShoppingCart(Product product) {
		this.products.add(product);
		
	}
	
	@Override
	public void deleteProduct(Product product) {
		this.products.remove(product);
		
	}
	
	public void getDescription(){
		System.out.println("The total is: " + this.getTotal());
	}

}
