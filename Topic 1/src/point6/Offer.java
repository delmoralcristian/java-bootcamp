package point6;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Offer extends AbstractProduct {
	private List<AbstractProduct> offers;
	
	public Offer(String id, String name, double price, List<AbstractProduct> offers) {
		super(id, name, price);
		this.offers= offers;
	}
	
	@Override
	public Set<Product> allProducts() {
		Set<Product> result= new HashSet<Product>();
		for(AbstractProduct i: this.offers){
			result.addAll(i.allProducts());
		}
		return result;
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
