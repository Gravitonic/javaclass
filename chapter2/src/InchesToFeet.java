/*
 * Programmer: Dylan Yang
 * Date: August 29 2017
 * Purpose: To print the user's height in feet and inches.
 */
import java.util.Scanner;

public class InchesToFeet {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int height;
		
		System.out.println("Please enter your height in inches below.");
		height = in.nextInt();
		
		System.out.println("Your height is " + height/12 + " feet and " + height%12 + " inches.");
		
		in.close(); // IMPORTANT
	}
}
