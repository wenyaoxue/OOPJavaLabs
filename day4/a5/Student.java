package a5;

public class Student {
	protected static int studentId;
	protected char studentType;
	protected String studentName;
	Student() {
		super();
		studentId++;
	}
	public Student(int studentId, char studentType, String studentName) {
		this();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
	}
	public static int getStudentId() {
		return studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	
	
}
