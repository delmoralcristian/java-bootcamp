package point6;

public class Factory {
	public AbstractPayment getPayment(String name, double amount, ShoppingCart shoppingCart, MailList mailList) throws Exception {
		AbstractPayment abstractPayment;
		if(EnumPayment.CreditCard.getName().equals(name)){
			abstractPayment= new CreditCardMethod(amount, shoppingCart.getUser().getName(), shoppingCart.getUser().getCreditNumber());
		}
		else { 
			if(EnumPayment.Paypal.getName().equals(name)){
				abstractPayment= new PaypalMethod(amount, shoppingCart.getUser().getEmail(), shoppingCart.getUser().getPassword());
			}
			else {
				if(EnumPayment.Cash.getName().equals(name)){
					abstractPayment= new CashMethod(amount);
				}
				else {
					throw new Exception("The method of payment is incorrect");
				}
			}
		}
		mailList.SendEmail("A payment was made:", shoppingCart.getUser().toString() + "\n");
		return abstractPayment;
	}
}
