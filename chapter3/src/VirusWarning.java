/*
 * Programmer: Dylan Yang
 * Date: September 22 2017
 * Purpose: To create a program to send and respond to a virus warning.
 */

import java.util.Scanner;

public class VirusWarning {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char input;

		System.out.println("This program may contain a virus. Do you wish to continue (y/n)?");
		input = in.next().toLowerCase().charAt(0);

		if (input == 'y')
			System.out.println("You are a gambler!");
		else if (input == 'n' || input == 'N')
			System.out.println("Smart choice!");
		else
			System.out.println("That was not a Y or N. You did not answer correctly!");
		
		in.close();
		
	}
}
