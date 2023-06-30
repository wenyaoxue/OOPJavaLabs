package a7;

public class CourseReg {
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(1001, 'D', "Eugene", 12000, "No 32/68 Vijayanagar");
		dayscholar.calculateFees();
		dayscholar.displayDetail();
		dayscholar.displayDaySDetails();
	}
}