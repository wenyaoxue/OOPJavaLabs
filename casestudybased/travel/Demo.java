package travel;

public class Demo {
	public static void main(String[] args) {
		Travel trav = new Travel();
		trav.setModeOfTravel('F');
		trav.setNoOfTickets(3);
		if (trav.getModeOfTravel() == 'F')
			trav.setAmount(500*trav.getNoOfTickets());
		else if (trav.getModeOfTravel() == 'T')
			trav.setAmount(100*trav.getNoOfTickets());
		else if (trav.getModeOfTravel() == 'B')
			trav.setAmount(50*trav.getNoOfTickets());
	}
}
