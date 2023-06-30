package review;

public class Parent4 {
	private int num;
	
	public Parent4(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}

class Child4 extends Parent4 {
	private int val;

	public Child4(int num, int val) {
		super(num);
		this.val = val;
	}
	public int getVal() {
		return val;
	}
}

class CourseMgmt4 {
	public static void main(String[] args) {
		Child4 child;
		child = new Child4(100, 200);
		System.out.println("Parent: Num: " + child.getNum()); //100
		System.out.println("Child: Val: " + child.getVal()); //200
	}
}
