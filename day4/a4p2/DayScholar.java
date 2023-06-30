package a4p2;

public class DayScholar extends Student{
	private String residentialAddress;
	//added cName
	DayScholar(int studentId, char studentType, String studName, int semFees, String residentialAddress, String cName) {
		//added cName
		super(studentId, studentType, studName, semFees, cName);
		this.residentialAddress = residentialAddress;
	}
	public void displayDetails() {
		System.out.println("id="+studentId+"; type="+studentType+"; name="+studentName);
		System.out.println("semester fees: "+ semesterFees);
		System.out.println("Residing at " + residentialAddress);
		super.displayDetails();
	}
	
	
}
