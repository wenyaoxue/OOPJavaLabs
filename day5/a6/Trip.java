package a6;

public class Trip {
	private String origin, destination;
	private int day;
	public Trip(String og, String dest, int d) {
		origin = og;
		destination = dest;
		day = d;
	}
	public String toString() {
		return "TRIP: " + origin + " -> " + destination + " -- day " + day;
	}
	public String getOrigin() {
		return origin;
	}
	public String getDestination() {
		return destination;
	}
	public int getDay() {
		return day;
	}
	public void nextDay() {
		day++;
	}
	
	
}