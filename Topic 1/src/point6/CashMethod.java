package point6;
/**
 * 
 * @author cris14
 * Strategy Pattern
 *
 */
public class CashMethod implements PaymentMethod {
	
	private double percentage;
	
	public CashMethod() {
		this.percentage= 0.90;
	}

	@Override
	public double discount(ShoppingCart shoppingCart) {
		System.out.println(this.toString());	
		return shoppingCart.getMoreExpensive() * this.getPercentage();
	}
	
	@Override
	public String toString(){
		return("Paid using cash payment: " + "\n");
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	

}
