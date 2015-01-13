package Classes;

public class Hospital extends Builder {
	private int staff;
	private int reception;
	private String name;
	
	
	public Hospital(int r, int w, String d, String ph, int st, int rec, String nam) {
		super(r, w, d, ph);
		staff= st;
		reception= rec;
		name= nam;
	}


	public int getStaff() {
		return staff;
	}


	public void setStaff(int staff) {
		this.staff = staff;
	}


	public int getReception() {
		return reception;
	}


	public void setReception(int reception) {
		this.reception = reception;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void printout() {
		System.out.println(" The Hospital has reception : " + reception + "; staff : " + staff + "; name : " + name + "; phone : " + this.getPhone() + "; street : " + this.getStreet() + "; windows : " + this.getWindows() + "; rooms : " + this.getRooms());
		
	}
	

}
