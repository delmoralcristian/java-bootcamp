package point7;

public class DemoPlayList {

	public static void main(String[] args) {
	
		
		PlayList playList= new PlayList (new PlayState());
		
		playList.play();
		
		playList.setPlayListState(new StopState());
		
		playList.pause();
		
		playList.stop();
		

	}

}
