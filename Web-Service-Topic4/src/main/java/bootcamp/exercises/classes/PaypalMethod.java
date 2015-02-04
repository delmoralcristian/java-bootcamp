package bootcamp.exercises.classes;


import bootcamp.exercises.services.ShoppingCartService;

public class PaypalMethod implements PaymentInterface {

	private String email;
	private String password;
	
	public PaypalMethod(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);

	}

	@Override
	public double discount(ShoppingCartService shoppingCart) {
		return shoppingCart.getLessExpensive();
	}
	
	@Override
	public String toString(){
		return("Paid using paypal payment: " + "\n");
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
