package point3;

public class Hospital {
	
	private int nursesNumber;
	private int doctorsNumber;
	private String dimension;
	private int roomNumber; // number of operating rooms
	
	public int getNursesNumber() {
		return nursesNumber;
	}
	
	public void setNursesNumber(int nursesNumber) {
		this.nursesNumber = nursesNumber;
	}
	
	public int getDoctorsNumber() {
		return doctorsNumber;
	}
	
	public void setDoctorsNumber(int doctorsNumber) {
		this.doctorsNumber = doctorsNumber;
	}
	
	
	public String getDimension() {
		return dimension;
	}
	
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String toString(){
		return ("This is a " + dimension + " hospital which " + doctorsNumber + " doctors, " + nursesNumber + " nurses and " + roomNumber + " operating rooms ");
	}
}
