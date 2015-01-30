package point3;

public class CityHospital implements HospitalBuilder {

	private final Hospital hospital;

	public CityHospital() {
		hospital = new Hospital();
	}

	public void setNurses() {
		this.getHospital().setNursesNumber(50);
	}

	public void setDoctor() {
		this.getHospital().setDoctorsNumber(25);

	}

	public void setDimension() {
		this.getHospital().setDimension("Big Hospital");

	}

	public void setRoom() {
		this.getHospital().setRoomNumber(40);
	}

	public Hospital getHospital() {
		return hospital;
	}

}
