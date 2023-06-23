package a7;

public class passByVal {
	public static void main(String[] args) {
		int sId = 25;
		passByVal val = new passByVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId is " + sId); //does not change, passed by value - method created a copy
	}
	public void passTheValueMethod(int sId) {
		sId = 10;
		System.out.println("The sId is " + sId);
	}
}
