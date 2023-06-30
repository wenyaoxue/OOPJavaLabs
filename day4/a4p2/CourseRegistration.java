package a4p2;

public class CourseRegistration {
	static protected int regId;
	protected String courseName;
	CourseRegistration() {
		regId++;
	}
	CourseRegistration (String cName) {
		//swapped lines, this() has to be first
		this();
		courseName = cName;
	}
	public void displayDetails() {
		System.out.println("Registration ID: " + regId);
		System.out.println("CourseName: " + courseName);
	}
}
