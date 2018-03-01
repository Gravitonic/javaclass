/*
 * Programmer: Dylan Yang
 * Date: October 30, 2017
 * Purpose: to write a program that uses a method to print the user's favorite word their favorite number of times
 */

import java.util.Scanner;

public class FavoriteNumberAndWord {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int inputInt;
		String inputStr;

		inputInt = getIntInput(in, "your favorite number");
		inputStr = getStrInput(in, "your favorite word");

		repeatWord(inputStr, inputInt);
		
		in.close();
	}

	public static int getIntInput(Scanner in, String query) {

		System.out.println("Please enter " + query + ".");
		int input = in.nextInt();

		in.nextLine();

		return input;

	}

	public static String getStrInput(Scanner in, String query) {

		System.out.println("Please enter " + query + ".");
		String input = in.nextLine();

		return input;

	}

	public static void repeatWord(String word, int times) {

		for (int i = 0; i < times; i++)
			System.out.println(word);

	}

}
