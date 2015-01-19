package point7;
/**
 * 
 * @author cris14
 * State Pattern
 *
 */
public class PauseState implements PlayListState {

	@Override
	public void play() {
		System.out.println("The playlist went from paused to playing");

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
