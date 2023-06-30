package a7;

public final class DayScholar extends Student{
	private String residentialAddress;
	DayScholar() {
		super();
	}
	DayScholar(int studentId, char studentType, String studName, double semFees, String residentialAddress) {
		this.setStudentId(studentId);
		this.setStudentType(studentType);
		this.setStudentName(studName, "");
		this.residentialAddress = residentialAddress;
	}
	public void displayDaySDetails() {
		System.out.println("Residing at " + residentialAddress);
	}
	
	
}
