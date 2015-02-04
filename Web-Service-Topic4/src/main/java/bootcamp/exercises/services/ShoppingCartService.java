package bootcamp.exercises.services;

import java.util.ArrayList;
import java.util.List;


import bootcamp.exercises.classes.PaymentInterface;
import bootcamp.exercises.classes.Product;

public class ShoppingCartService implements ShoppingCartInterface {

private List<Product> products;
	
	public ShoppingCartService(){
		this.products= new ArrayList<Product>();
	}
	
	@Override
	public double getSubTotal() {
		double aux= 0;
		for(Product i: this.products){
			aux += i.subTotalPrice();
		}
		return aux;
	}

	@Override
	public void addProductToShoppingCart(Product product, int units) {
		product.setUnits(units);
		this.products.add(product);
		
	}
	
	@Override
	public void deleteProduct(String id_product, int units) {		
		int index= productSearch(id_product);
		if(index > -1){
			int unt= this.products.get(index).getUnits();
			if(unt - units > 0){
				this.products.get(index).setUnits(unt - units);
			}
			else if(unt - units == 0){
					this.products.remove(index);
			}
		}	
	}
	
	private int productSearch(String id_product){
		for(int i=0; i<this.products.size(); i++){
			if(this.products.get(i).getId().equals(id_product)){
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void cancelPurchase(){
		this.products.clear();
	}
	
	@Override
	public String payShoppingCart(PaymentInterface paymentMethod){
		double discount= paymentMethod.discount(this);
		double total= this.getSubTotal()- discount;
		return("The Total Amount is: " + total + " and the Discount is: " + discount);		
	}
	
	public double getMoreExpensive(){
		double max= 0;
		for(Product i: this.products){
			if(i.getPrice()> max){
				max= i.getPrice();
			}
		}
		return max;
	}
	
	public double getLessExpensive(){
		double min= Double.MAX_VALUE;
		for(Product i: this.products){
			if(i.getPrice()< min){
				min= i.getPrice();
			}
		}
		return min;
	}
	
	public void getDescription(){
		System.out.println("The total is: " + this.getSubTotal());
	}

}
