package a1;

public class Student {
	public static void main(String[] args) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		displayDetails(studentOne);
		Student studentTwo = new Student('H', "Dinil", "Bose");
		displayDetails(studentTwo);
		
		Student studentThree = new Student();
		displayDetails(studentThree);
		Student studentFour = new Student();
		displayDetails(studentFour);
	}

	private static int nextId=550;
	private static int studentCount = 0;
	private int studentId;
	private char studentType;
	private String studentName;

	static {
		studentCount = 10;
	}
	
	public Student() {
		studentCount++;
		this.studentId = studentCount;
		this.studentType = ' ';
		this.studentName = "";
	}
	public Student(char sType, String fname, String lname) {
		studentCount++;
		this.studentId = nextId;
		this.studentType = sType;
		this.studentName = fname + " " + lname;
	}
	public int getStudentCount() { return studentCount; }
	public static void displayDetails(Student student) {
		System.out.println("Student [id="+student.studentId+"; type="+student.studentType+"; name="+student.studentName+"]");
	}
	
}
