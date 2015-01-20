package point7;

/**
 * 
 * @author cris14
 * State Pattern
 *
 */

public class Context {
	 private PlayListState state;

	   public Context(){
	   }

	   public void setState(PlayListState playListState){
	      this.state = playListState;		
	   }

	   public PlayListState getState(){
	      return state;
	   }
}
