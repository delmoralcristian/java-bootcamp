package bootcamp.exercices;

public class Product extends AbstractProduct{
	
private int units;
	
	public Product(String id, String name, double price) {
		super(id, name, price);
		this.setUnits(1);
	}
	
	public Product(String id, String name, double price, int units) {
		super(id, name, price);
		this.setUnits(units);
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
