package point6;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private User user;
	private List<AbstrsctProduct> products;
	private AbstractPayment payment;
	
	public ShoppingCart(User user){
		this.user= user;
		this.products= new ArrayList<AbstrsctProduct>();
	}
	
	public double getSubtotal(){
		double aux= 0;
		for(AbstrsctProduct i: this.products){
			aux += i.subTotalPrice();
		}
		return aux;	
	}
	
	public void addProduct(AbstrsctProduct p){
		this.products.add(p);
		p.getMailList().SendEmail("A new product is added to cart:"  + "\n", p.getDescription());
	}
	
	public double getMoreExpensive(){
		double max= 0;
		for(AbstrsctProduct i: this.products){
			if(i.getPrice()> max){
				max= i.getPrice();
			}
		}
		return max;
	}
	
	public double getLessExpensive(){
		double min= Double.MAX_VALUE;
		for(AbstrsctProduct i: this.products){
			if(i.getPrice()< min){
				min= i.getPrice();
			}
		}
		return min;
	}
	
	public String ticket() {
		String sale= "";
		for (AbstrsctProduct i: this.products){
			sale+= i.getDescription() + "\n";
		}
		return sale;
	}
	
	public String SubTotal(){
		return ("The subtotal is: " + this.getSubtotal() + "\n");
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<AbstrsctProduct> getProducts() {
		return products;
	}
	public void setProducts(List<AbstrsctProduct> products) {
		this.products = products;
	}

	public AbstractPayment getPayment() {
		return payment;
	}

	public void setPayment(AbstractPayment payment) {
		this.payment = payment;
	}
	
}
