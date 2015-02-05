package point6;
/**
 * 
 * @author cris14
 * Strategy Pattern
 *
 */

public interface PaymentMethod {
	
	public double discount(ShoppingCart shoppingCart);
	public String toString();
	

}
