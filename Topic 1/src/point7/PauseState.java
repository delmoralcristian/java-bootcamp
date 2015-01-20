package point7;
/**
 * 
 * @author cris14
 * State Pattern
 *
 */
public class PauseState implements PlayListState {

	@Override
	public void doAction(Context context) throws Exception {
			if((context.getState()== null) ||(State.Play.getName().equals(context.getState().getDescription()))){
				System.out.println("Player is in pause state");
				context.setState(this);	
			}
			else{
				throw new Exception("You can't do this action");
			}
	}
	

	@Override
	public String getDescription() {
		return ("Pause State");
	}

}
