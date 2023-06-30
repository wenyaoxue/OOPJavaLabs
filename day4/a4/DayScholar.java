package a4;

public class DayScholar extends Student{
	private String residentialAddress;
	DayScholar(int studentId, char studentType, String studName, int semFees, String residentialAddress) {
		//fixed line below, and swapped 2 lines, super needs to be first
		super(studentId, studentType, studName, semFees);
		this.residentialAddress = residentialAddress;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Residing at " + residentialAddress);
	}
	
	
}
