package studentpack;

public class Student2 {
//	int studentId; //can't access in DayScholar, different package
	protected int studentId;
//	private char studentType; //can't access in DayScholar, different class
	protected char studentType;
	protected String studentName;
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
