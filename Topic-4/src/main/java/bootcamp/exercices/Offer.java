package bootcamp.exercices;

import java.util.List;

public class Offer extends AbstractProduct {

	private List<AbstractProduct> offers;
	
	public Offer(String id, String name, double price, List<AbstractProduct> offers) {
		super(id, name, price);
		this.offers= offers;
	}
	
	@Override
	public double subTotalPrice() {
		return this.getPrice();
	}
	
	@Override
	public String getDescription() {
		String title = " - Offer " + this.getName() + " --------- $" + getPrice() + "\n";
		String offer= "";
		for(AbstractProduct i: this.offers){
			offer+= i.getDescription() + "\n";
		}
		return title + offer;
	}
	
	public List<AbstractProduct> getOffers() {
		return offers;
	}

	public void setOffers(List<AbstractProduct> offers) {
		this.offers = offers;
	}
	
}
