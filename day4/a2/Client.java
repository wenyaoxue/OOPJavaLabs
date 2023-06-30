package a2;

public class Client {
	public static void main(String[] args) {
		Hostelite hostelite= new Hostelite(123, 'F', "Crystal Wen", 2000, "HostelName", 1001);
		
		System.out.println("id: " + hostelite.getStudentId());
		System.out.println("type: " + hostelite.getStudentType());
		System.out.println("name: " + hostelite.getStudentName());
		System.out.println("fees per mo: " + hostelite.getFeesPerMonth());
		System.out.println("hostel name: " + hostelite.getHostelName());
		System.out.println("room num: " + hostelite.getRoomNumber());
	}
}
