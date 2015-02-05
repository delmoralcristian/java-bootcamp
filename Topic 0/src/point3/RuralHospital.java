package point3;

public class RuralHospital implements HospitalBuilder {

	private final Hospital hospital;

	public RuralHospital() {
		hospital = new Hospital();
	}

	public void setNurses() {
		this.getHospital().setNursesNumber(15);
	}

	public void setDoctor() {
		this.getHospital().setDoctorsNumber(8);

	}

	public void setDimension() {
		this.getHospital().setDimension("Small Hospital");

	}

	public void setRoom() {
		this.getHospital().setRoomNumber(10);
	}

	public Hospital getHospital() {
		return hospital;
	}

}
