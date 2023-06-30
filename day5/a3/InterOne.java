package a3;

public interface InterOne {
//	int varOne; //interfaces can only have final variables
	int varTwo=100;
	void methodOne();
	void methodTwo();
}
class Example implements InterOne {
//	void methodOne() { //can't reduce visibility
	public void methodOne() {
//		varTwo = varTwo + 10; //can't reassign interface variable
		System.out.println("Value of varTwo:"+varTwo);
		System.out.println("Good Morning");
	}
	public void methodTwo() {
		System.out.println("Good Afternoon");
	}
}
class DemoInterface {
	public static void main(String[] args) {
		Example obj = new Example();
		obj.methodOne();
		obj.methodTwo();
	}
}
