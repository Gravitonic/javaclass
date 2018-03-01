/*
 * Programmer: Dylan Yang
 * Date: September 8 2017
 * Purpose: To display the digits of a two-digit number.
 */

import java.util.Scanner;

public class TwoDigits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int number;

		System.out.println("Enter a two digit number below.");
		number = in.nextInt();

		System.out.println("The first digit is " + number / 10 + ".");
		System.out.println("The second digit is " + number % 10 + ".");

		in.close();

	}
}
