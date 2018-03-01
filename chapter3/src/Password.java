/*
 * Programmer: Dylan Yang
 * Date: September 26 2017
 * Purpose: To prompt the user for a password and test whether the input is correct.
 */

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		final String PASSWORD = "password";
		String input;

		System.out.print("Password: ");
		input = in.nextLine();

		if (input.equals(PASSWORD))
			System.out.println("Hello! You're in!");
		else
			System.out.println("The password you entered was incorrect.");

		in.close();
		
	}
}
