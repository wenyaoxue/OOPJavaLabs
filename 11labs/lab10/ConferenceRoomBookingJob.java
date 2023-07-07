package lab10;

public class ConferenceRoomBookingJob {
	private static int numRooms = 0;
	private int roomNum;
	private ProjectManager primary;
	public boolean book(ProjectManager requester) {
		System.out.println(requester +" is requesting room " + roomNum);
		if (isAvail()) {
			this.primary = requester;
			System.out.println("Success");
			return true;
		}
		System.out.println("This room is already booked");
		return false;
	}
	public boolean isAvail() {
		return primary == null;
	}
	public ConferenceRoomBookingJob() {
		super();
		numRooms++;
		this.roomNum = numRooms;
		this.primary = null;
	}
}
