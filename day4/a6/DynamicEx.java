package a6;

public class DynamicEx {
	public static void main(String[] args) {
//		Student dayScholar = new DayScholar();
		DayScholar dayScholar = new DayScholar(); //otherwise can't call setResidentialAddress
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		dayScholar.setResidentialAddress("No 32/3 Vijayanagar");
		dayScholar.getDetails();
	}
}
