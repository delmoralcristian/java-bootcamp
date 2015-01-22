package reservation;


public interface StateReservation {
	
	public void accept(ContextReservation context);
	
	public void cancel(ContextReservation context);
	
	public void pay(ContextReservation context);

}
