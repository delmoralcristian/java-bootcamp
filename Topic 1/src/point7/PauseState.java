package point7;
/**
 * 
 * @author cris14
 * State Pattern
 *
 */
public class PauseState implements PlayListState {
	
	
	@Override
	public String getDescription() {
		return ("Pause State");
	}


	@Override
	public void pause(Context contextState) {
		System.out.println("Nothing to do, the playlist is pausing");
	}


	@Override
	public void play(Context contextState) {
		System.out.println("Playing from the place the user paused");
		contextState.setState(new PlayState());	
	}


	@Override
	public void stop(Context contextState) {
		System.out.println("Stopping the play list");
		contextState.setState(new StopState());
		
	}

}
