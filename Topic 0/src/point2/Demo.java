package point2;

public class Demo {

	public static void main(String[] args) {
		
		Builder builder = new LivingRoom();
		Architect architecte = new Architect(builder);
		architecte.build();
		Room room = architecte.getRoom();
		System.out.println(room.toString());
	}

}
