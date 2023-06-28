package selfreview;

public class StaticDemo {
	static int count=10;
	StaticDemo() {
		count++;
	}
	static void display() {
		System.out.println(count);
	}
	static {
		System.out.println("Static Block written Before Main");
	}
	public static void main(String[] args) {
		//static block written before main
		//static block written after main
		StaticDemo t1 = new StaticDemo();
		StaticDemo t2 = new StaticDemo();
		
		StaticDemo.display(); //12
		t2.display(); //12
	}
	static {
		System.out.println("Static Block written after main");
	}
	
}
