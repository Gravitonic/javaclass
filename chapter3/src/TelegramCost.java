/*
 * Programmer: Dylan Yang
 * Date: September 20 2017
 * Purpose: To create a program to determine the cost of a telegram.
 */

import java.util.Scanner;

public class TelegramCost {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int words;

		System.out.println("How many words are in your telegram?");
		words = in.nextInt();

		if (words <= 15)
			System.out.println("Your telegram costs $8.50");
		else if (words > 15)
			System.out.printf("Your telegram costs $%.2f.", 8.5 + 0.25 * (words - 15));
		else
			System.out.println("The program experienced an unexpected error. Please try again.");
		
		in.close();

	}
}
