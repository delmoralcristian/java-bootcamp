package point7;

public class StopState implements PlayListState {

	@Override
	public void doAction(Context context) throws Exception {
		if((context.getState()== null) ||(State.Play.getName().equals(context.getState().getDescription()))){
			System.out.println("Player is in Stop state");
			context.setState(this);	
		}
		else{
			throw new Exception("You can't do this action");
		}	
	}

	@Override
	public String getDescription() {
		return ("Stop State");
	}


	

}
