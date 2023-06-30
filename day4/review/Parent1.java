package review;

public class Parent1 {
	//change to protected to print from child
	protected int num;

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

class Child1 extends Parent1 {
	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int num) {
		this.val = num;
	}
	public void display() {
		System.out.println("Number: " + num);
		System.out.println("Value: " + val);
	}
}

class CourseMgmt1 {
	public static void main(String[] args) {
		Child1 child;
		child = new Child1();
		child.setNum(100);
		child.setVal(200);
		child.display(); //100 200
	}
}
