package point6;

import java.util.HashSet;
import java.util.Set;

public class Product extends AbstractProduct {
	
	private int units;
	
	public Product(String id, String name, double price) {
		super(id, name, price);
		this.units= 1;
	}
	
	public Product(String id, String name, double price, int units) {
		super(id, name, price);
		this.units= units;
	}
	
	@Override
	public Set<Product> allProducts() {
		Set<Product> result= new HashSet<Product>();
		result.add(this);
		return result;
	}

	@Override
	public double subTotalPrice(){
		return (this.getPrice()* this.getUnits());
	}
	
	@Override
	public String getDescription() {
		return (" - Item " + this.getName() + " --------- $" + this.getPrice());
	}
	
	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

}
