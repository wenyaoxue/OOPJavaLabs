package selfreview;

public interface Count {
	short counter = 0;
	void countUp();
}

class TestCount implements Count {
	public static void main(String[] args) {
		TestCount test = new TestCount();
		test.countUp();
	}
	public void countUp() {
		for (int x =6; x > counter; x--) {//, ++counter) {//can't change interface field values
			System.out.println(" " + counter);
		}
	}
}
