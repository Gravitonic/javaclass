/*
 * Programmer: Dylan Yang
 * Date: September 20 2017
 * Purpose: To create a program to determine whether the user is old enough to drive.
 */

import java.util.Scanner;

public class DrivingAge {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String name, first;
		int age;

		System.out.println("What is your name?");
		name = in.nextLine();
		name = name.substring(0,1).toUpperCase() + name.substring(1); 						 // Capitalizes first letter
		if (name.indexOf(" ") > 1) {
			name = name.substring(0, name.indexOf(" ")+1) 									 // Maintains first name up to space
					+ name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase()  // Finds first letter of last name after space
					+ name.substring(name.indexOf(" ") + 2); 								 // Maintains rest of last name
			first = name.substring(0,name.indexOf(" ")); 									 // Sets variable to first name
		}
		else
			first = name;

		System.out.println("How old are you?");
		age = in.nextInt();

		if (age > 16)
			System.out.println("It's scary, " + first + " ... you are old enough to drive!");
		else
			System.out.println("It's " + (16 - age) + " years, " + name + ", until you are old enough to drive.");

		in.close();

	}
}
