package a8;

public class Class1 {
	public static void main(String[] args) {
		int i = 22;
		int j = 14000;
		boolean k;
		boolean l;
		i = 22;
		j = 14000;
		Class1 class1 = new Class1();
		k = class1.method1(i);
		l = class1.method2(j);
		
		if (k && l)
			System.out.println("is a new employee");
		else
			System.out.println("is not a new employee");
	}
	
	public boolean method1(int i) {
		return (i > 20 && i < 30);
	}
	
	public boolean method2(int j) {
		return(j >= 14000 && j < 20000);
	}
}
