package point6;

public abstract class AbstractPayment {
	private double amount;
	private double discount;
	private double percentage; 
	
	public AbstractPayment(double amount){
		this.amount= amount;
		this.percentage= 1; // if do not add anything, there will not be discount percentage.
		
	}

	public abstract void discount(ShoppingCart shoopingCart);
	
	public String toString() {
		return ("The Total Amount is: " + this.getAmount() + " and the Discount is: " + this.getDiscount() + "\n");
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	

}
