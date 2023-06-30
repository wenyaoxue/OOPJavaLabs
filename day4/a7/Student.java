package a7;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees=12000;
	protected int feesPerMonth;
	Student() {
		super();
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName+lastName;
	}

	public void calculateFees() {
		feesPerMonth = semesterFees / 6;
	}

	public final void displayDetail()  {
		System.out.println("id="+studentId+"; type="+studentType+"; name="+studentName);
		System.out.println("semester fees: "+semesterFees + "; fees per month: " + feesPerMonth);
	}
}
