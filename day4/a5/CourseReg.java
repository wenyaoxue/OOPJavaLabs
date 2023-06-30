package a5;

public class CourseReg {
	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar(5, "OOP", 16000, 1001, 'D', "Manu", "No 32/3 Vijayanagar");
		dayScholar.calculateFees();
		
		System.out.println("Student Info");
		System.out.print("id="+dayScholar.getStudentId()+"\t");
		System.out.print("type="+dayScholar.getStudentType()+"\t");
		System.out.print("name="+dayScholar.getStudentName()+"\t");
		
		System.out.println("\nPostGrad Info");
		System.out.print("courseid="+dayScholar.getPostCourseId()+"\t");
		System.out.print("coursename="+dayScholar.getPostCourseName()+"\t");
		
		System.out.println("\nDayScholar Info");
		System.out.println("fees="+dayScholar.getFees());
	}
}