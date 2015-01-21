package point6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShoppingCart implements Notification {
	
	private List<AbstractProduct> products;
	private List<Observer> observers;
	
	public ShoppingCart(){
		this.products= new ArrayList<AbstractProduct>();
		this.observers= new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void doNotify(String note) {
		for(Observer i: this.observers){
			i.doUpdate(note);
		}	
	}
	
	public Set<Product> allItems(){
		Set<Product> result= new HashSet<Product>();
		for(AbstractProduct i: this.products){
			result.addAll(i.allProducts());
		}
		return result;
	}
	
	public void pay(PaymentMethod paymentMethod){
		System.out.println("Payment transaction number: " + TransactionCounter.getTransaction().getSecuense()+ "\n");
		double discount= paymentMethod.discount(this);
		double total= this.getSubtotal()- discount;
		System.out.println("The Total Amount is: " + total + " and the Discount is: " + discount + "\n");
		this.removeAllProducts();
		doNotify("New transaction was made"+ "\n");
	}
	
	public void removeAllProducts(){
		this.products.clear();
	}
	
	public double getSubtotal(){
		double aux= 0;
		for(AbstractProduct i: this.products){
			aux += i.subTotalPrice();
		}
		return aux;	
	}
	
	public void addProduct(AbstractProduct p){
		this.products.add(p);
		doNotify("New product is added to shoppingcart: "+ "\n");
		System.out.println(p.getDescription());
	}
		
	public void changePrice(String id, double newPrice) {
		for(AbstractProduct i: this.products){
			if(id.equals(i.getId())){
				i.setPrice(newPrice);
				doNotify("The price of an product was changed: "+ "\n");
				System.out.println(i.getDescription());
			}
		}
	}
	
	public double getMoreExpensive(){
		Set<Product> items= this.allItems();
		double max= 0;
		for(Product i: items){
			if(i.getPrice()> max){
				max= i.getPrice();
			}
		}
		return max;
	}
	
	public double getLessExpensive(){
		Set<Product> items= this.allItems();
		double min= Double.MAX_VALUE;
		for(Product i: items){
			if(i.getPrice()< min){
				min= i.getPrice();
			}
		}
		return min;
	}
	
	public String ticket() {
		String title= "The description of the sale is: " + "\n";
		String sale= "";
		for (AbstractProduct i: this.products){
			sale+= i.getDescription() + "\n";
		}
		return title +sale;
	}
	
	public String subTotal(){
		return ("The subtotal is: " + this.getSubtotal() + "\n");
	}
	
	public List<AbstractProduct> getProducts() {
		return products;
	}
	public void setProducts(List<AbstractProduct> products) {
		this.products = products;
	}	
}
