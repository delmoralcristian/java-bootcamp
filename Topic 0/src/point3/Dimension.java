package point3;

public enum Dimension {
	HospitalSmall("Small"), HospitalBig("Big");
	
	private String name;
	
	Dimension(String name){
		this.name= name;
	}

	public String getName() {
		return name;
	}	
}
