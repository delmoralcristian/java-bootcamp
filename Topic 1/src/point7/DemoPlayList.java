package point7;

public class DemoPlayList {
	/**
	 * 
	 * @author cris14
	 * State Pattern
	 *
	 */

	public static void main(String[] args) {
	
	     
	     try{	
			 Context context = new Context();

		     PauseState playState = new PauseState();
		     
	    	 playState.doAction(context);

	    	 PauseState pause = new PauseState();
	     
	    	 pause.doAction(context);

	     }catch (Exception e) {
				System.out.println(e.getMessage());
	     }	
		
		

	}

}
