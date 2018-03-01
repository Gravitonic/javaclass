

/*
 * Programmer: Dylan Yang
 * Date: September 5 2017
 * Purpose: To concatenate @google.com to the user's name.
 */

import java.util.Scanner;

public class GoogleEmail {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name;
		
		System.out.println("Please enter your last name below.");
		name = in.nextLine();
		
		System.out.println(name.toLowerCase() + "@google.com");
		
		in.close();
		
	}
}
