package point6;

public class PaypalMethod extends AbstractPayment {
	private String email;
	private String password;
	
	public PaypalMethod(double amount, String email, String password) {
		super(amount);
		this.setEmail(email);
		this.setPassword(password);

	}

	@Override
	public void discount(ShoppingCart shoopingCart) {
		double discount= shoopingCart.getLessExpensive();
		this.setDiscount(discount);
		this.setAmount(this.getAmount() - discount);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
