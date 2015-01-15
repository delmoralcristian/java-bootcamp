package point3;

public class Factory {
	
	public Hospital getHospital(String dimension) throws Exception{
		Director director;
		if (dimension.equals(Dimension.HospitalSmall.getName())){
			director = new Director(new RuralHospital()); 
		}
		else{ 
			if (dimension.equals(Dimension.HospitalBig.getName())){
				director = new Director(new CityHospital()); 
			}
			else{
				throw new Exception("The dimension is incorrect");
			}
		}
		director.biuld();
		return director.getHospital();
	}

}
