package point6;
/**
 * 
 * @author cris14
 * Strategy Pattern
 *
 */
public class CreditCardMethod implements PaymentMethod {
	private String name;
	private int creditNumber;
	private double percentage;

	public CreditCardMethod(String name, int creditNumber) {
		this.name= name;
		this.creditNumber= creditNumber;
		this.percentage= 0.10;

	}

	@Override
	public double discount(ShoppingCart shoppingCart) {
		System.out.println(this.toString());
		return shoppingCart.getSubtotal() * this.getPercentage();
	}
	
	@Override
	public String toString(){
		return("Paid using credit card payment: "+ "\n");
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
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
