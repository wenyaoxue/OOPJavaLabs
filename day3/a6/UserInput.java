package a6;

public class UserInput {
	public static void main(String[] args) {
		int number, iterations;
		number = Integer.parseInt(args[0]);
		iterations = Integer.parseInt(args[1]);
		
		System.out.println("Multiplication table from " + number + " to " + iterations);
		for (int m = number; m <= iterations; m++) {
			for (int n = number; n <= iterations; n++) {
				System.out.print(m + " x " + n + " = " + (m*n) + "\t");
			}
			System.out.println();
		}
	}
}
