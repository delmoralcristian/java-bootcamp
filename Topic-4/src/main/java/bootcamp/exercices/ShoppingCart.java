package bootcamp.exercices;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingCartInterface{

	private List<AbstractProduct> products;
	
	public ShoppingCart(){
		this.setProducts(new ArrayList<AbstractProduct>());
	}
	
	@Override
	public double getTotal() {
		double aux= 0;
		for(AbstractProduct i: this.products){
			aux += i.subTotalPrice();
		}
		return aux;
	}

	@Override
	public void addProduct(AbstractProduct abstractProduct) {
		this.products.add(abstractProduct);
		
	}
	
	@Override
	public void deleteProduct(AbstractProduct abstractProduct) {
		this.products.remove(abstractProduct);
		
	}

	public List<AbstractProduct> getProducts() {
		return products;
	}

	public void setProducts(List<AbstractProduct> products) {
		this.products = products;
	}

	
	
	

}
