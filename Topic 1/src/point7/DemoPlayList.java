package point7;

public class DemoPlayList {

	public static void main(String[] args) {
		Music m1= new Music("Civilización", "Los Piojos","Manjar", 243);
		Music m2= new Music("Civilización", "Los Piojos","Pacifico", 253);
		Music m3= new Music("Civilización", "Los Piojos","Bicho de ciudad", 252);
		Music m4= new Music("Civilización", "Los Piojos","Bicho de ciudad", 200);
				
		PlayList playlist = new PlayList("Taylors record");	
		playlist.addMusic(m1);
		playlist.addMusic(m2);
		playlist.addMusic(m3);
		playlist.addMusic(m4);
		playlist.printOut();
		//playlist.playMusic(2);
		//playlist.pauseMusic(2);
		playlist.stopMusic();
		

	}

}
