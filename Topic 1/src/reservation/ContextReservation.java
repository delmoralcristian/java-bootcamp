package reservation;



public class ContextReservation {
	
	private StateReservation state;

	 public ContextReservation (StateReservation state){
		this.state= state;
	 }

	 public void setState(StateReservation state){
		 this.state = state;		
	 }

	 public StateReservation getState(){
	    return state;
	  }

}
