package a9;

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
	private int studentId;
	private char studentType;
	private String studentName;
	
	public Student() {
		this.studentId = nextId;
		nextId++;
		this.studentType = ' ';
		this.studentName = "";
	}
	public Student(char sType, String fname, String lname) {
		this.studentId = nextId;
		this.studentType = sType;
		this.studentName = fname + " " + lname;
	}
	public static void displayDetails(Student student) {
		System.out.println("Student [id="+student.studentId+"; type="+student.studentType+"; name="+student.studentName+"]");
	}
	
}
