package point6;

public abstract class AbstrsctProduct {
	
	private int id;
	private String name;
	private double price;
	private int units;
	
	public AbstrsctProduct(int id, String name, double price, int units){
		this.id= id;
		this.name= name;
		this.price= price;
		this.units= units;
	}
	
	public abstract String getDescription();
	
	public double subTotalPrice(){
		return (this.getPrice()* this.getUnits());
	}

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

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
