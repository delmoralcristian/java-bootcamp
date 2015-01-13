package Classes;

public class Home extends Builder {
	private int people; // number of people living in the house

	public Home(int r, int w, String d, String ph, int pe){
		super(r, w, d, ph);
		people= pe;
	}
	
	public int getPeople(){
		return people;
	}
	
	public void setPeople( int people){
		this.people= people;
	}
	public void printout() {
		System.out.println(" The house has people " + people + "; phone : " + this.getPhone() + "; street : " + this.getStreet() + "; windows : " + this.getWindows() + "; rooms : " + this.getRooms());

	}

}
