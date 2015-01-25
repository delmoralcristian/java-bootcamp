package bootcamp.exercices;


public abstract class AbstractProduct{
	
	private String id;
	private String name;
	private double price;
	
	public AbstractProduct(String id, String name, double price){
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
	}
	
	public abstract String getDescription();
	
	public abstract double subTotalPrice();

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
