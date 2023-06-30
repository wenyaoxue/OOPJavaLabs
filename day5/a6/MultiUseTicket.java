package a6;

public class MultiUseTicket extends Ticket {
	public MultiUseTicket(int issueDay, String origin, String destination, int tripsRemaining) {
		tottix++;
		ticketNo = tottix;
		this.issueDay = issueDay;
		this.origin = origin;
		this.destination = destination;
		this.tripsRemaining = tripsRemaining;
	}
	@Override
	public boolean use(Trip trip) {
		System.out.println("\n" + trip);
		System.out.println("Trying to use MultiUseTicket: no"+ticketNo + ":" + this.origin + ", " + this.destination + ", " + this.issueDay);
		if (matchStations(trip) == 0) {
			System.out.println("Cannot use, this ticket is only to be used for traveling between " +
								this.origin + " and " + this.destination);
			return false;
		}
		if (tripsRemaining == 0) {
			System.out.println("Cannot use, this ticket has no trips remaining");
			return false;
		}
		if (trip.getDay() >= issueDay+60) {
			System.out.println("Cannot use, this ticket could only be used for return until day " + (issueDay + 59));
			return false;
		}
		tripsRemaining--;
		System.out.println("Welcome Aboard!");
		return true;
	}
	
}
