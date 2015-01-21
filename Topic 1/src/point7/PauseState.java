package point7;
/**
 * 
 * @author cris14
 * State Pattern
 *
 */
public class PauseState implements PlayListState {
	/**
	 * I can pause the playlist only if there a song playing.
	 */
	
	@Override
	public void doAction(Context context){
			if(State.Play.getName().equals(context.getState().getDescription())){
				System.out.println("Player is in pause state");
				context.setState(this);	
			}
			else{
				System.out.println("You can't do this action");
			}
	}
	

	@Override
	public String getDescription() {
		return ("Pause State");
	}

}
