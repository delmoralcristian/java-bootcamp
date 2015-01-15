package point2;

import java.util.ArrayList;


public class Architect {

	private Builder roombuilder;
	private ArrayList<Room> rooms; //room list includes the architect to build the house

	public Architect(Builder roombuilder){
		this.roombuilder= roombuilder;
		this.rooms= new ArrayList<Room>();
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

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
	
}
