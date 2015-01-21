package point7;

public class StopState implements PlayListState {
	/**
	 * I can stop the playlist only if there a song playing.
	 */
	
	@Override
	public void doAction(Context context) {
		if(State.Play.getName().equals(context.getState().getDescription())){
			System.out.println("Player is in Stop state");
			context.setState(this);	
		}
		else{
			System.out.println("You can't do this action");
		}	
	}

	@Override
	public String getDescription() {
		return ("Stop State");
	}


	

}
