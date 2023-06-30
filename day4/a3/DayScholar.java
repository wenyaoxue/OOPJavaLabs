package a3;

public class DayScholar extends Student{
	private String residentialAddress;
	public DayScholar() {
		super();
	}
	public DayScholar(int studentId, char studentType, String studentName, double feesPerMonth, String addy) {
		super(studentId, studentType, studentName, "");
		setFeesPerMonth(feesPerMonth);
		this.residentialAddress = addy;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	@Override
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Residing at " + residentialAddress);
	}
	
	
}
