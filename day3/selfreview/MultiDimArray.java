package selfreview;

public class MultiDimArray {
	public static void main(String[] args) {
		String[][] names = {{"Mrs.", "Ms.", "Mr."},
							{"Vani", "Lesitha", "Nishit", "Meenakshi"}};
		System.out.println(names[0][0] + names[1][0]); //mrs vani
		System.out.println(names[0][2] + names[1][2]); //mr nishit
	}
}
