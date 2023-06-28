package a5;

import java.util.Scanner;

public class JavaDoc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your username -> ");
		String username = sc.next();
		System.out.println("Length of username: " + username.length());
		System.out.println("Hi " + username);
		System.out.println("Lowercase: " + username.toLowerCase());
		System.out.println("Uppercase: " + username.toUpperCase());
		System.out.println("Starts with a: " + (username.charAt(0) == 'a'));
		username = "SEED";
		System.out.println("New username: " + username);
	}
}
