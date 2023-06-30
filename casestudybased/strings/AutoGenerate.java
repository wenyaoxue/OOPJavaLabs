package strings;

public class AutoGenerate {
	static int travCompCode = 115;
	static char modeOfTrav;
	static int tripCode;
	static int unqCode = 0;
	public static void main(String[] args) {
	
		String confnum;
	
		modeOfTrav = 'F';
		tripCode = 102;
		System.out.println(getConfNum(modeOfTrav, tripCode));
		
		modeOfTrav = 'T';
		tripCode = 202;
		System.out.println(getConfNum(modeOfTrav, tripCode));
		
		modeOfTrav = 'B';
		tripCode = 304;
		System.out.println(getConfNum(modeOfTrav, tripCode));
	}
	
	public static String getConfNum(char modeOfTrav, int tripCode) {
		unqCode++;
		return travCompCode + "" + modeOfTrav + String.format("%03d", tripCode) + String.format("%04d", unqCode);
	}
}
