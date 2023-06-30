package review;

public class Parent2 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void display() {
		System.out.println("Number: " + num);
	}
}

class Child2 extends Parent2 {
	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int num) {
		this.val = num;
	}
	public void display() {
		super.display();
		System.out.println("Value: " + val);
	}
}

class CourseMgmt2 {
	public static void main(String[] args) {
		Child2 child;
		child = new Child2();
		child.setNum(100);
		child.setVal(200);
		child.display(); //100 200
	}
}
