package a8;

public class Hostelite extends Student{
	private String hostelName;
	private int roomNumber;
	public Hostelite() {
		super();
	}
	public Hostelite(int studentId, char studentType, String studentName, double feesPerMonth, String hostelName, int roomNumber) {
		super(studentId, studentType, studentName, "");
		setFeesPerMonth(feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Residing in " + hostelName + " room " + roomNumber);
	}
	@Override
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0 + 1200;
		
	}
	
	
}
