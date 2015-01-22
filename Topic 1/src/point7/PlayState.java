package point7;

/**
 * 
 * @author cris14
 * State Pattern
 *
 */

public class PlayState implements PlayListState {
	
	@Override
	public String getDescription() {
		return ("Play State");
	}

	@Override
	public void pause(Context contextState) {
        System.out.println("Pausing the play list");
        contextState.setState(new PauseState());	
	}

	@Override
	public void play(Context contextState) {
		System.out.println("Nothing to do, the playlist is playing");		
	}

	@Override
	public void stop(Context contextState) {
		System.out.println("Stopping the play list");
		contextState.setState(new StopState());
	}
	
	
}
