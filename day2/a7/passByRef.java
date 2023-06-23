package a7;

public class passByRef {
	public static void main(String[] args) {
		Student student = new Student();
		passByRef val = new passByRef();
		System.out.println(student.getStudentId());
		val.passTheValueMethod(student);
		System.out.println(student.getStudentId()); //changes, passed by reference - method modified the object
	}
	public void passTheValueMethod(Student student) {
		student.setStudentId(1000);
		System.out.println(student.getStudentId());
	}
}
