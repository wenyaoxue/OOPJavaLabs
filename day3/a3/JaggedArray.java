package a3;

public class JaggedArray {
	public static void main(String[] args) {
		String[][] tutorials = {{"Tony", "JAVA", "C", "C++"},
								{"Thomas","JAVA","UNIX"},
								{"Dinil", "Linux", "Oracle"},
								{"Delvin", "RDBMS", "C#", "ORACLE"}};
		
		for (String s: tutorials[3])
			System.out.print(s + " ");
		
		System.out.println();
		
		for (String[] rec: tutorials) {
			if (rec[0].equals("Delvin"))
				for (String s: rec)
					System.out.print(s + " ");
		}
	}
}
