package point6;

public class CashMethod extends AbstractPayment {
	
	
	public CashMethod(double amount) {
		super(amount);
	}

	@Override
	public void discount(ShoppingCart shoopingCart) {
		double discount= shoopingCart.getMoreExpensive() * this.getPercentage();
		this.setDiscount(discount);
		this.setAmount(this.getAmount()- discount);
	}
	

}
