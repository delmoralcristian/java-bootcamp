package point6;

import java.util.Set;


public abstract class AbstractProduct {
	
	private String id;
	private String name;
	private double price;
	
	public AbstractProduct(String id, String name, double price){
		this.id= id;
		this.name= name;
		this.price= price;
	}
	
	public abstract String getDescription();
	
	public abstract double subTotalPrice();
	/**
	 * 
	 * This method returns a set with all the items, 
	 * and then get the more expensive item and the item cheaper
	 */
	public abstract Set<Product> allProducts();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) { //Notify
		this.price = price;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
