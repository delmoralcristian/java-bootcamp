package reservation;



public class Reservation {
	
	private ContextReservation context;
	
	public Reservation(){
		StateReservation initialState = new InicialState();
        this.context = new ContextReservation(initialState);
	}
	
	 public void accept() {
		 this.context.getState().accept(this.context);
	 }

	 public void cancel() {
		 this.context.getState().cancel(this.context);
	 }

	 public void change() {
	     this.context.getState().pay(this.context);
	 }
	
	
}
