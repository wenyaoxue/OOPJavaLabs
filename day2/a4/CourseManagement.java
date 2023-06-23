package a4;

public class CourseManagement {
	public static void main(String[] args) {
		int id = 1;
		char type = 'r';
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentType(type);
		
		System.out.println("id="+student.getStudentId()+ "; type="+student.getStudentType());
	}
}
