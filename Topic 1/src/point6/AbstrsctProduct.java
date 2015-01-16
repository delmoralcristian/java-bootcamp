package point6;

public abstract class AbstrsctProduct {
	
	private int id;
	private String name;
	private double price;
	private int units;
	private MailList mailList;
	
	public AbstrsctProduct(int id, String name, double price, int units, MailList mailList){
		this.id= id;
		this.name= name;
		this.price= price;
		this.units= units;
		this.mailList= mailList;
	}
	
	public abstract String getDescription();
	
	public double subTotalPrice(){
		return (this.getPrice()* this.getUnits());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) { //Notify
		this.price = price;
		this.mailList.SendEmail("This price was chanched", this.getDescription());
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public MailList getMailList() {
		return mailList;
	}

	public void setMailList(MailList mailList) {
		this.mailList = mailList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
