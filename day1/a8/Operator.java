package a8;

public class Operator {
	public static void main(String[] args) {
		int intVal = 100;
		byte byteVal = (byte) intVal;
		byte max = 127;
		byte min = -128;
		//error: max + min is type int, sum is type byte
//		byte sum = max + min;
		System.out.println("Sum="+sum);
	}
}
