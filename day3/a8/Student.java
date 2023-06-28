package a8;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;

	public static void main(String[] args) {
		try {
			Student student;
			student = new Student(1, 'F', "Crystal", "Wen");
			student.setResidentialStatus("Day Scholar");
			if (student.getResidentialStatus().equals("Day Scholar"))
				student.calculateFees(6000);
			else
				student.calculateFees(6000, 1000);
			
			System.out.println("id="+student.getStudentId() + ";type="+student.getStudentType()+";name="+student.getStudentName());
			System.out.println("residentialstatus="+student.getResidentialStatus()+";fees="+student.getFees());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Make sure to provide command line arguments:");
			System.out.println("id-integer name-String residentialStatus-String semesterFees-long hostfees-long-ifHostelite");
		}
	}
	public Student() {
		super();
	}
	
	public Student(int studentId, char studentType, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = firstName + " " + lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName + " " + lastName;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public String getFees() {
		return feesPerMonth + " per month";
	}
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
	}
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees/6.0;
		feesPerMonth += hostelFees;
	}
}