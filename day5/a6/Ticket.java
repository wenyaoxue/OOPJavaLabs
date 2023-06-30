package a6;

public abstract class Ticket {
	protected static int tottix = 0;
	protected int ticketNo;
	protected int issueDay;
	protected String origin;
	protected String destination;
	protected int tripsRemaining;

	protected int matchStations(Trip trip) {
		if (this.origin.equals(trip.getOrigin()) && this.destination.equals(trip.getDestination()))
			return 1;
		if (this.destination.equals(trip.getOrigin()) && this.origin.equals(trip.getDestination()))
			return -1;
		return 0;
	}
	public abstract boolean use(Trip trip);
}
