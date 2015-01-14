package point3;

public class Director {
	private HospitalBuilder hospitalbuilder= null;
	
	public Director(HospitalBuilder hospitalbuilder){
		this.hospitalbuilder= hospitalbuilder;
	}

	public void biuld(){
		hospitalbuilder.setDimension();
		hospitalbuilder.setDoctor();
		hospitalbuilder.setNurses();
		hospitalbuilder.setRoom();
	}

	public Hospital getHospital(){
		return hospitalbuilder.getHospital();
	}
}
