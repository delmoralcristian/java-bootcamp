package point6;

public class Product extends AbstrsctProduct {

	public Product(int id, String name, double price, int units, MailList mailList) {
		super(id, name, price, units, mailList);
	}

	@Override
	public String getDescription() {
		return (" - Item " + this.getName() + " --------- $" + this.getPrice());
	}

}
