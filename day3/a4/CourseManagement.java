package a4;

public class CourseManagement {
	public static void main(String[] args) {
		Student student;
		student = new Student();		
		System.out.println("id="+student.getStudentId()+ "; type="+student.getStudentType() + "; name="+student.getStudentName());
		int id = 1;
		char type = 'x';
		String fn = "Crystal";
		String ln = "Wen";
		student.setStudentId(id);
		student.setStudentType(type);
		student.setStudentName(fn, ln);
		System.out.println("id="+student.getStudentId()+ "; type="+student.getStudentType() + "; name="+student.getStudentName());
		
		student = new Student(id, type, fn, ln);
		System.out.println("id="+student.getStudentId()+ "; type="+student.getStudentType() + "; name="+student.getStudentName());
		
	}
}
