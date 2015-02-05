package reservation;

public class AcceptedState implements StateReservation {

	@Override
	public void accept(ContextReservation context) {
		System.out.println("You can't perform this action");


	}

	@Override
	public void cancel(ContextReservation context) {
		System.out.println("Cancelled the reservation");
		context.setState(new CancelledState());

	}

	@Override
	public void pay(ContextReservation context) {
		System.out.println("Paid the reservation");
		context.setState(new PaidState());

	}

}
