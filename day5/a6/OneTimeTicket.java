package a6;

public class OneTimeTicket extends Ticket {
	public OneTimeTicket(int issueDay, String origin, String destination) {
		tottix++;
		ticketNo = tottix;
		this.issueDay = issueDay;
		this.origin = origin;
		this.destination = destination;
		tripsRemaining = 1;
	}
	
	@Override
	public boolean use(Trip trip) {
		System.out.println("\n" + trip);
		System.out.println("Trying to use OneTimeTicket: no"+ticketNo + ":" + this.origin + ", " + this.destination + ", " + this.issueDay);
		if (matchStations(trip) != 1) {
			System.out.println("Cannot use, this ticket is only to be used for traveling from " +
								this.origin + " to " + this.destination);
			return false;
		}
		if (issueDay != trip.getDay()) {
			System.out.println("Cannot use, this ticket can only be used on day " + issueDay);
			return false;
		}
		if (tripsRemaining != 1) {
			System.out.println("Cannot use, this ticket has already been used");
			return false;
		}
		tripsRemaining--;
		System.out.println("Welcome Aboard!");
		return true;
	}
	
}
