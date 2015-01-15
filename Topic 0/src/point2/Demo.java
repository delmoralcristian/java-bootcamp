package point2;

import java.util.ArrayList;


public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Room> aux= new ArrayList<Room>();
		Builder builder = new LivingRoom();
		Architect architecte = new Architect(builder);
		architecte.build();
		Room room = architecte.getRoom();
		aux.add(room);
		builder= new Kitchen();
		architecte.setRoombuilder(builder);
		architecte.build();
		room= architecte.getRoom();
		aux.add(room);
		architecte.setRooms(aux);
		for(Room i: aux)
			System.out.println(i.toString());
	}

}
