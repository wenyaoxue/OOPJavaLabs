package registrationpack;

//need in order to extend
import studentpack.Student2;

public class DayScholar extends Student2 {
	private String residentialAddress;
	public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}
	public void getDetails() {
		System.out.println("Student ID\t:"+studentId);
		System.out.println("Student Type\t:"+studentType);
		System.out.println("Student Name\t:"+studentName);
	}
}
class Registration {
	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Dinil");
		dayScholar.getDetails();
	}
}
