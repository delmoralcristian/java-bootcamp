package point7;

/**
 * 
 * @author cris14
 * State Pattern
 *
 */

public class PlayState implements PlayListState {
	/**
	 * if there a song that is playing, I throw an error.
	 */
	@Override
	public void doAction(Context context) {
		if(this.getDescription().equals(context.getState().getDescription())){
			System.out.println("You can't do this action");
		}
		else{
			System.out.println("Player is in play state");
			context.setState(this);	
		}
	}

	@Override
	public String getDescription() {
		return ("Play State");
	}
	
	
}
