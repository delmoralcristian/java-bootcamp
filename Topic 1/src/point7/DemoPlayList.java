package point7;

public class DemoPlayList {
	/**
	 * 
	 * @author cris14
	 * State Pattern
	 *
	 */
	
	public static void main(String[] args) {
		
		PauseState pauseState= new PauseState();
		PlayState playState= new PlayState();
		StopState stopState= new StopState();
		Context context = new Context(stopState); 
	     /**
	      * suppose that the initial state is stop
	      */
	    playState.doAction(context);
	    stopState.doAction(context);
	    pauseState.doAction(context);
	    playState.doAction(context);
	
	}

}
