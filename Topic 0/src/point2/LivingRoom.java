package point2;

public class LivingRoom implements Builder {
	private final Room room;

	public LivingRoom() {
		room = new Room();
	}

	public void buildRoom() {
		room.setDescription("Living Room");

	}

	public void paintRoom() {
		room.setColor("white");
	}

	public void sizeRoom() {
		room.setSize("5.70 x 1.70");
	}

	public Room getRoom() {
		return room;
	}

}
