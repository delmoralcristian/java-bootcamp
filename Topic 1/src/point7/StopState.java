package point7;

public class StopState implements PlayListState {

	@Override
	public String getDescription() {
		return ("Stop State");
	}

	@Override
	public void pause(Context contextState) {
        System.out.println("Nothing to pause");	
	}

	@Override
	public void play(Context contextState) {
		 System.out.println("Playing from the beginning of the playlist");
	     contextState.setState(new PlayState());		
	}

	@Override
	public void stop(Context contextState) {
		 System.out.println("Nothing to stop..");		
	}


	

}
