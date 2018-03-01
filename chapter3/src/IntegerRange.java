/*
 * Programmer: Dylan Yang
 * Date: September 22 2017
 * Purpose: To create a program to determine whether the integer input is within a given range.
 */

import java.util.Scanner;

public class IntegerRange {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("Please enter an integer between 50 and 100.");
		num = in.nextInt();

		if (num >= 50 && num <= 100)
			System.out.printf("Congratulations! You've just won $%d.00", num);
		else
			System.out.println("Sorry, you are not following directions!");

		in.close();

	}
}
