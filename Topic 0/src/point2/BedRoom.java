package point2;

public class BedRoom implements Builder {
	private Room room;
	
	public BedRoom(){
		room= new Room();
	}
	
	
	public void buildRoom() {
		room.setDescription("Bedroom");

	}

	
	public void paintRoom() {
		room.setColor("Orange");

	}
	
	public void sizeRoom(){
		room.setSize("3.00 x 2.00");
	}


	public Room getRoom() {
		return room;
	}

}
