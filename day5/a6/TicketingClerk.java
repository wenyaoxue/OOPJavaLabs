package a6;

import java.util.ArrayList;

public class TicketingClerk {
	private static ArrayList<Trip> allTrips;
	private static int day;
	public static void main(String[] args) {
		allTrips = new ArrayList<Trip>();
		
		day = 1;
		
		//issue tickets
		Ticket a = new OneTimeTicket(day, "a", "b");
		Ticket b = new OneTimeTicket(day, "a", "b");
		Ticket c = new ReturnTicket(day, "a", "b");
		Ticket d = new ReturnTicket(day, "a", "b");
		Ticket e = new MultiUseTicket(day, "a", "b", 10);
		
		//today's trips
		Trip ab = new Trip("a", "b", day);
		Trip ba = new Trip("b", "a", day);
		Trip ac = new Trip("a", "c", day);
		Trip dc = new Trip("d", "c", day);
		allTrips.add(ab);
		allTrips.add(ba);
		allTrips.add(ac);
		allTrips.add(dc);
		
		//use tickets
		a.use(ba);
		a.use(ab);
		a.use(ab);
		b.use(ac);
		b.use(dc);
		c.use(ab);
		d.use(ba);
		e.use(ab);
		e.use(ba);
		e.use(ac);
		e.use(dc);
		

		//time pass
		nextDay(); //also advances trips
		
		b.use(ab);
		c.use(ab);
		c.use(ba);
		d.use(ba);
		d.use(ab);

		nextDay(); //also advances trips
		e.use(ab);
		nextDay(); //also advances trips
		e.use(ba);
		nextDay(); //also advances trips
		e.use(ab);
		nextDay(); //also advances trips
		e.use(ba);
		nextDay(); //also advances trips
		e.use(ab);
		nextDay(); //also advances trips
		e.use(ba);
		nextDay(); //also advances trips
		e.use(ab);
		nextDay(); //also advances trips
		for (int i = 0; i < 51; i++)
			nextDay();
		e.use(ba);
		e.use(ba);
	}
	private static void nextDay() {
		day++;
		for (Trip t: allTrips)
			t.nextDay();
	}
}
