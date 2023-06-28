package a2;

public class DemoArray {
	public static void main(String[] args) {
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2},{2,2,2}};
		System.out.println("Matrix 1");
		display2dArray(firstArrayMatrix);
		System.out.println();
		System.out.println("Matrix 2");
		display2dArray(secondArrayMatrix);
		System.out.println();
		System.out.println("Sum of the Matrices");
		display2dSum(firstArrayMatrix, secondArrayMatrix);
		
		System.out.println();
		int thirdArrayMatrix[][] = {{2,2,2,4},{2,2},{3,8,7,9,2}};
		display2dArray(secondArrayMatrix);
		System.out.println();
		display2dArray(thirdArrayMatrix);
		System.out.println();
		display2dSum(thirdArrayMatrix, secondArrayMatrix);
	}
	
	private static void display2dSum(int[][] arr1, int[][] arr2) {
		for (int i = 0; i < Math.max(arr1.length, arr2.length); i++) {
			int js;
			if (i < arr1.length && i < arr2.length)
				js  = Math.max(arr1[i].length, arr2[i].length);
			else if (i < arr1.length)
				js = arr1[i].length;
			else
				js = arr2[i].length;
			
			
			for (int j = 0; j < js; j++) {
				int a1val = getArrVal(arr1, i, j);
				int a2val = getArrVal(arr2, i, j);

				System.out.print(a1val+a2val + " ");
			}
			System.out.println();
		}
	}

	private static int getArrVal(int[][] arr, int i, int j) {
		if (i < arr.length && j < arr[i].length)
			return arr[i][j];
		return 0;
	}

	private static void display2dArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
}
