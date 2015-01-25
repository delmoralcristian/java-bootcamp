package bootcamp.exercices;

public interface ShoppingCartInterface {
	
	public double getTotal();
	
	public  void addProduct(AbstractProduct abstractProduct);
	
	public void deleteProduct(AbstractProduct abstractProduct);
}
