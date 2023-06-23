package selfreview;

public class Example3 {
	public static void main(String[] args) {
		int intValOne = 0;
		int intValTwo = 0;
		for (short index = 0; index < 5; index++)
			if ((++intValOne > 2) || (++intValTwo > 2)) //second part of conditional doesn't execute when first is true
				intValOne++;
		//1,1 2,2 4,2 6,2 8,2
		System.out.println(intValOne + " " + intValTwo);
	}
}
