package point7;

public class StopState implements PlayListState {
	/**
	 * 
	 * @author cris14
	 * State Pattern
	 *
	 */
	@Override
	public void play() {
		System.out.println("The playlist went from stopped to playing");

	}

	@Override
	public void pause() {
		System.out.println("the playlist can't be paused");

	}

	@Override
	public void stop() {
		System.out.println("The playlist was stopped");

	}

}
