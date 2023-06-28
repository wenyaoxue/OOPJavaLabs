package a7;

public class Student {
	private int studentId;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;

	public static void main(String[] args) {
		//cla: id, firstname, lastname, resStat, semfees, (hostfees if resStat=Hostelite)
		try {
			int id = Integer.parseInt(args[0]);
			String fn = args[1];
			String ln = args[2];
			String resStat = args[3];
			long fees = Long.parseLong(args[4]);
			if (resStat.equals("Hostelite"))
				fees += Long.parseLong(args[5]) ;
			Student student;
			student = new Student();
			student.setStudentId(id);
			student.setStudentName(fn, ln);
			student.setResidentialStatus(resStat);
			student.setFees(fees);
			
			System.out.println("id="+student.getStudentId() + "; name="+student.getStudentName());
			System.out.println("residentialstatus="+student.getResidentialStatus()+";fees="+student.getFees());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Make sure to provide command line arguments:");
			System.out.println("id-integer firstname-String lastname-String residentialStatus-String semesterFees-long hostfees-long-ifHostelite");
		}
	}
	public Student() {
		super();
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public long getFees() {
		return feesPerMonth;
	}
	public void setFees(long fees) {
		this.feesPerMonth = fees;
	}
}