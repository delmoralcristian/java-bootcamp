package point7;

public class DemoPlayList {
	/**
	 * 
	 * @author cris14
	 * State Pattern
	 *
	 */
	
	public static void main(String[] args) {
		
		 PlayList playlist = new PlayList();
         
		 playlist.play();
         playlist.play();
         playlist.stop();
         playlist.play();
         playlist.pause();
         playlist.pause();
         playlist.play();
	
	}

}
