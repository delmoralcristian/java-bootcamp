package point2;

public class Kitchen implements Builder {
	private Room room;
	
	public Kitchen(){
		room= new Room();
	}
	
	
	
	public void buildRoom() {
		room.setDescription("Kitchen");

	}

	
	public void paintRoom() {
		room.setColor("Beige");

	}

	public void sizeRoom(){
		room.setSize("2.60 x 3.35");
	}

	public Room getRoom() {
		return room;
	}


}
