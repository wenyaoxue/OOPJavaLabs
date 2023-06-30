package a4;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	Student(int studentId) {
		this.studentId = studentId;
	}
	Student(int studentId, char studentType, String studName, int semFees) {
		super();
		//added this.
		this.studentType = studentType;
		studentName = studName;
		semesterFees = semFees;
	}
	public void displayDetails() {
		System.out.println("id="+studentId+"; type="+studentType+"; name="+studentName);
		System.out.println("semester fees: "+semesterFees);
	}
}
