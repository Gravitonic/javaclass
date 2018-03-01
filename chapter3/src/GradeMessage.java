/*
 * Programmer: Dylan Yang
 * Date: September 29 2017
 * Purpose: To respond to the user's grade.
 */

import java.util.Scanner;

public class GradeMessage {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char grade;

		System.out.println("Please enter your letter grade below.");
		grade = in.next().toUpperCase().charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("Your work is outstanding!");
			break;
		case 'B':
			System.out.println("You are doing good work!");
			break;
		case 'C':
			System.out.println("Your work is satisfactory.");
			break;
		case 'D':
			System.out.println("You need to work a little harder.");
			break;
		case 'F':
			System.out.println("Please see me for extra help!");
			break;
		default:
			System.out.println("I couldn't understand that. Please enter your letter grade as a capital letter.");
			break;
		}

		in.close();

	}
}
