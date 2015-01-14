package point2;

public class Architect {

	private Builder roombuilder= null;

	public Architect(Builder roombuilder){
		this.roombuilder= roombuilder;
	}
	
	public Room getRoom() {
		return roombuilder.getRoom();
	}

	public void setRoombuilder(Builder roombuilder) {
		this.roombuilder = roombuilder;
	}
	
	public void build(){
		roombuilder.sizeRoom();
		roombuilder.paintRoom();
		roombuilder.buildRoom();
	}
	
	
}
