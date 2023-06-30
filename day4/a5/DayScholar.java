package a5;

public class DayScholar extends PostGradStudent {
	private String residentialAddress;
	//added below
	private double fees;
	//added one int
	public DayScholar(int postCourseId, String postCourseName, int postCourseFees, int studentId, char studentType, String studentName, String residentialAddress) {
		super(postCourseId, postCourseName, postCourseFees, studentId, studentType, studentName);
		this.residentialAddress = residentialAddress;
	}
	public void calculateFees() {
		fees = postCourseFees/6;
	}
	//changed to double
	public double getFees() {
		return fees;
	}
}
