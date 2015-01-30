package bootcamp.exercises.classes;

import java.io.Serializable;

public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 339264700921888582L;
	private String id;
	private String name;
	private double price;
	private int units;
	
	public Product(String id, String name, double price, int units) {
		this.id=id;
		this.name= name;
		this.price=price;
		this.units= units;
	}
	

	public double subTotalPrice(){
		return (this.getPrice()* this.getUnits());
	}
	

	public String getDescription() {
		return (" - Item " + this.getName() + " --------- $" + this.getPrice());
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
