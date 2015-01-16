package point6;

public class CreditCardMethod extends AbstractPayment {
	private String name;
	private int creditNumber;

	public CreditCardMethod(double amount, String name, int creditNumber) {
		super(amount);
		this.name= name;
		this.creditNumber= creditNumber;


	}

	@Override
	public void discount(ShoppingCart shoopingCart) {
		double discount= shoopingCart.getSubtotal() * this.getPercentage();
		this.setDiscount(discount);
		this.setAmount(this.getAmount() - discount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

}
