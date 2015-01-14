package point3;

public class CityHospital extends HospitalBuilder{

	@Override
	public void setNurses() {
		this.getHospital().setNursesNumber(50);
	}

	@Override
	public void setDoctor() {
		this.getHospital().setDoctorsNumber(25);
		
	}

	@Override
	public void setDimension() {
		this.getHospital().setDimension("Big Hospital");
		
	}

	@Override
	public void setRoom() {
		this.getHospital().setRoomNumber(40);	
	}

}
