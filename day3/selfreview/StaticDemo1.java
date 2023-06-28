package selfreview;

public class StaticDemo1 {
	private int num;
	static void display() {
//		System.out.println(num); //can't use non-static variables in a static func
	}
	public static void main(String args[]) {
		StaticDemo.display();
	}
}
