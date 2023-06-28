package selfreview;

public class StringEqual {
	public static void main(String[] args) {
		main1(); //eq
		main2(); //neq
		main3(); //eq
	}
	public static void main1() {
		String name1, name2;
		name1 = "God";
		name2 = name1; //assign reference
		if (name1 == name2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	public static void main2() {
		String name1, name2;
		name1 = new String("God");
		name2 = new String("God"); //new object
		if (name1 == name2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	public static void main3() {
		String name1, name2;
		name1 = new String("God");
		name2 = new String("God"); //same value, different reference
		if (name1.equals(name2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
