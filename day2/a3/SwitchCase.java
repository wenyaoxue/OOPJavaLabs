package a3;

public class SwitchCase {
	public static void main(String[] args) {
		printMarks('A');
		printMarks('B');
		printMarks('C');
		printMarks('D');
		printMarks('E');
		printMarks('F');
	}
	public static void printMarks(char grade) {
		System.out.println("Range of marks for Grade " + grade);
		
		switch(grade) {
			case 'A': System.out.println("80-100"); break;
			case 'B': System.out.println("73-79"); break;
			case 'C': System.out.println("65-72"); break;
			case 'D': System.out.println("55-64"); break;
			case 'E': System.out.println("<55"); break;
			default: System.out.println("Grade does not exist");
		}
	}
}
