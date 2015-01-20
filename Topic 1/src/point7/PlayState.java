package point7;

/**
 * 
 * @author cris14
 * State Pattern
 *
 */

public class PlayState implements PlayListState {

	@Override
	public void doAction(Context context) throws Exception {
		if(context.getState()!= null){
			if(this.getDescription().equals(context.getState().getDescription())){
				throw new Exception("You can't do this action");
			}
		}
		System.out.println("Player is in play state");
		context.setState(this);	
	}

	@Override
	public String getDescription() {
		return ("Play State");
	}
	
	
}
