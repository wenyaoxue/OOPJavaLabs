package selfreview;

public class TypeCasting {
	public static void main(String[] args) {
		int intVal=10;
		double doubleVal = 20.0;
//		intVal = doubleVal; //compilation error
		intVal = (int) doubleVal;
		System.out.println(intVal);
	}
}
