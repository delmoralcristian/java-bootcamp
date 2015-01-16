package point6;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
	private static final Transaction _INSTANCE = new Transaction();
	
	private List<ShoppingCart> transactions;
	private MailList mailList;
	
	private Transaction(){
		this.transactions= new ArrayList<ShoppingCart>();
	}

	public static Transaction getTransaction(){
		return _INSTANCE;
	}
	
	public int numberTransactions(){
		return this.transactions.size();
	}
	
	public void addTransaction(ShoppingCart shoppingCart){
		this.transactions.add(shoppingCart);
		mailList.SendEmail(this.toString() , "-");
		
	}
	
	public String toString(){
		return ("One transaction was made with number of transaction: " + this.numberTransactions() + "\n");
	}
	
	
	public void deleteTransaction(ShoppingCart shoppingCart){
		this.transactions.remove(shoppingCart);
	}

	public MailList getMailList() {
		return mailList;
	}

	public void setMailList(MailList mailList) {
		this.mailList = mailList;
	}
}
