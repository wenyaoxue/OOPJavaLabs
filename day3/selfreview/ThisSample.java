package selfreview;

public class ThisSample {
	public static void main(String[] args) {
		Square square = new Square();
		square.display(5);
		int area = square.calculateArea();
		System.out.println("The area of the Square is : " + area); //25
	}
}
