package a3;

public class Client {
	public static void main(String[] args) {
		Student student;
		
		if (args[0].equals("Hostelite"))
			student = new Hostelite(123, 'F', "Crystal Wen", 2000, "HostelName", 1001);
		else if (args[0].equals("Dayscholar"))
			student = new DayScholar(123, 'F', "Crystal Wen", 2000, "123 Street Ln");
		else {
			System.out.println("First argument should be Hostelite or Dayscholar");
			return;
		}
		
		student.displayStudentDetails();
	}
}
