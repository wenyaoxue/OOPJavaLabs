package a4p2;

public class Student extends CourseRegistration{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	//changed below to protected
	protected int semesterFees;
	private int feesPerMonth;
	Student(int studentId, String cName) {
		super(cName);
		this.studentId = studentId;
	}
	Student(int studentId, char studentType, String studName, int semFees, String cName) {
		super(cName);
		//added line below
		this.studentId = studentId;
		//added this.
		this.studentType = studentType;
		studentName = studName;
		semesterFees = semFees;
	}
}
