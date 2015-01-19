package point7;

public class PlayState implements PlayListState {
	/**
	 * 
	 * @author cris14
	 * State Pattern
	 *
	 */
	@Override
	public void play() {
		System.out.println("The playlist is already playing");
		

	}

	@Override
	public void pause() {
		System.out.println("The playlist was paused");

	}

	@Override
	public void stop() {
		System.out.println("The playlist was stopped");

	}

}
