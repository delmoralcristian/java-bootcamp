package point6;

public class MarketManager implements Observer {
	
	@Override
	public void doUpdate(String note) {
		System.out.println("e-mail: " + note);
	}

}
