/*
 * Programmer: Dylan Yang
 * Date: October 23, 2017
 * Purpose: to write a complete Java program to assist in a study of coin flips
 */

import java.util.Scanner;

public class coinFlips {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int inputInt, hCount = 0, tCount = 0; // hCount is count of times coin flip resulted in heads, and tCount is the same for tails
		String inputStr;

		System.out.print("How many flips to analyze? ");
		inputInt = in.nextInt();

		// Error trap
		while (inputInt < 1) {
			System.out.println("Your input was invalid. Please enter a positive integer, otherwise you are not going to be testing very much!");
			inputInt = in.nextInt();
		}
		
		in.nextLine(); // Clears scanner

		System.out.println();
		
		for (int i = 0; i < inputInt; i++) {
			System.out.print((i + 1) + ". Flip coin and enter result (H or T) #" + (i + 1) + ": ");
			inputStr = in.nextLine();

			// Error trap
			while (!inputStr.equalsIgnoreCase("H") && !inputStr.equalsIgnoreCase("T")) {
				System.out.print("Your input was invalid. Please enter \"H\" or \"T\": ");
				inputStr = in.nextLine();
			}

			if (inputStr.equalsIgnoreCase("H"))
				hCount++;
			else if (inputStr.equalsIgnoreCase("T"))
				tCount++;
		}

		System.out.println("\nResults:");

		if (hCount != 1) {
			System.out.printf(hCount + " heads, or %.0f", ((double)hCount / inputInt) * 100);
			System.out.println("%");
		} else {
			System.out.printf(hCount + " head, or %.0f", ((double)hCount / inputInt) * 100);
			System.out.println("%");
		}

		if (tCount != 1) {
			System.out.printf(tCount + " tails, or %.0f", ((double)tCount / inputInt) * 100);
			System.out.println("%");
		} else {
			System.out.printf(tCount + " tail, or %.0f", ((double)tCount / inputInt) * 100);
			System.out.println("%");
		}

		in.close();

	}

}
