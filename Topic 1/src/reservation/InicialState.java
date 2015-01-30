package reservation;

public class InicialState implements StateReservation {

	@Override
	public void accept(ContextReservation context) {
		System.out.println("Accepted the reservation");
		context.setState(new AcceptedState());

	}

	@Override
	public void cancel(ContextReservation context) {
		System.out.println("Cancelled the reservation");
		context.setState(new CancelledState());

	}

	@Override
	public void pay(ContextReservation context) {
		System.out.println("You can't perform this action");

	}

}
