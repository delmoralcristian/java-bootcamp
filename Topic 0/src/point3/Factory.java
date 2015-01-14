package point3;

public class Factory {
	
	public Hospital getHospital(String dimension){
		Director director= null;
		if (dimension.equals("small"))
			director = new Director(new RuralHospital()); 
		else 
			if (dimension.equals("big"))
				director = new Director(new CityHospital()); 
		director.biuld();
		return director.getHospital();
	}

}
