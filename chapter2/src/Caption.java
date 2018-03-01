

/*
 * Programmer: Dylan Yang
 * Date: September 7 2017
 * Purpose: To print the length and fourth character of a caption.
 */

import java.util.Scanner;

public class Caption {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String caption;
		
		System.out.println("Please enter a saying or sentence below.");
		caption = in.nextLine();
		
		System.out.println("The length of your caption is " + caption.length() + ".");
		System.out.println("The fourth character is \"" + caption.charAt(3) + ".\"");
		
		in.close();
		
	}

}
