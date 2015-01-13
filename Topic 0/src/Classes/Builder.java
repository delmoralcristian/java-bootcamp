package Classes;

public abstract class Builder {
	public class Home {

	}

	private int rooms;
	private int windows;
	private String street;
	private String phone;
	
	public Builder(int r, int w, String s, String p) {
		setRooms(r);
		setWindows(w);
		setStreet(s);
		setPhone(p);
	}
	
	public abstract void printout();

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
