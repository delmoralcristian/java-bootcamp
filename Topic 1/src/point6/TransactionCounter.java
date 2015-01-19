package point6;
/**
 * 
 * @author cris14
 * Singleton Pattern
 *
 */
public class TransactionCounter {
	private static TransactionCounter transaction;
	
	private int sequence;
	
	private TransactionCounter(){
		this.sequence= 0;
	}

	public static TransactionCounter getTransaction(){
		if(transaction== null){
			transaction= new TransactionCounter();
		}
		return transaction;
	}
	public int getSecuense() {
		this.sequence++;
		return this.sequence;
	}
}
