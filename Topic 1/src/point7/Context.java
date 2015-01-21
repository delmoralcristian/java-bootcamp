package point7;

/**
 * 
 * @author cris14
 * State Pattern
 *
 */

public class Context {
	 
	
	private PlayListState state;

	 public Context(PlayListState state){
		this.state= state;
	 }

	 public void setState(PlayListState playListState){
		 this.state = playListState;		
	 }

	 public PlayListState getState(){
	    return state;
	  }
}
