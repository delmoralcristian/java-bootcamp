package point3;

public class RuralHospital extends HospitalBuilder {
	@Override
	public void setNurses() {
		this.getHospital().setNursesNumber(15);
	}

	@Override
	public void setDoctor() {
		this.getHospital().setDoctorsNumber(8);
		
	}

	@Override
	public void setDimension() {
		this.getHospital().setDimension("Small Hospital");
		
	}

	@Override
	public void setRoom() {
		this.getHospital().setRoomNumber(10);	
	}
	
}
