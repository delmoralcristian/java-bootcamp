package point6;


import java.util.List;

public class Offer extends AbstrsctProduct {
	private List<Product> offers;
	
	public Offer(int id, String name, double price, int units, MailList mailList, List<Product> offers) {
		super(id, name, price, units, mailList);
		this.offers= offers;
	}

	@Override
	public String getDescription() {
		String title = " - Offer " + this.getName() + " --------- $" + getPrice() + "\n";
		String offer= "";
		for(Product i: this.offers){
			offer+= i.getDescription() + "\n";
		}
		return title + offer;
	}

	public List<Product> getOffers() {
		return offers;
	}

	public void setOffers(List<Product> offers) {
		this.offers = offers;
	}

}
