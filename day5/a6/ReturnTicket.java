package a6;

public class ReturnTicket extends Ticket {
	private boolean depUsed, retUsed;
	public ReturnTicket(int issueDay, String origin, String destination) {
		tottix++;
		ticketNo = tottix;
		this.issueDay = issueDay;
		this.origin = origin;
		this.destination = destination;
		depUsed = false;
		retUsed = false;
	}
	@Override
	public boolean use(Trip trip) {
		System.out.println("\n" + trip);
		System.out.println("Trying to use ReturnTicket: no"+ticketNo + ":" + this.origin + ", " + this.destination + ", " + this.issueDay);
		if (matchStations(trip) == 1) {
			if (issueDay != trip.getDay()) {
				System.out.println("Cannot use, this ticket can only be used for departure on day " + issueDay);
				return false;
			}
			if (depUsed) {
				System.out.println("Cannot use, this ticket has already been used for departure");
				return false;
			}
			depUsed = true;
			System.out.println("Welcome Aboard!");
			return true;
		}
		if (matchStations(trip) == -1) {
			if (trip.getDay() >= (issueDay + 7)) {
				System.out.println("Cannot use, this ticket could only be used for return until day " + (issueDay + 6));
				return false;
			}
			if (retUsed) {
				System.out.println("Cannot use, this ticket has already been used for return");
				return false;
			}
			retUsed = true;
			System.out.println("Welcome Aboard!");
			return true;
		}
		System.out.println("Cannot use, this ticket is only to be used for traveling between " +
							this.origin + " and " + this.destination);
		return false;
	}
	
}
