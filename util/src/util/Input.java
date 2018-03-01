package util;

import java.util.Scanner;

public class Input {

	// int range
	public static int getInput(int min, int max) {

		Scanner in = new Scanner(System.in);
		int input;

		System.out.print("Please enter a number between " + min + " and " + max + ", inclusive: ");
		input = in.nextInt();

		while (input < min || input > max) {
			System.out.println("Your input was not valid. Please enter a number between " + min + " and " + max + ".");
			input = in.nextInt();
		}

		in.close();

		return input;

	}

	// int range with custom String parameter
	public static int getInput(String parameter, int min, int max) {

		Scanner in = new Scanner(System.in);
		int input;

		System.out.print("Please enter " + parameter + ": ");
		input = in.nextInt();

		while (input < min || input > max) {
			System.out.println("Your input was invalid. Please enter " + parameter + ": ");
			input = in.nextInt();
		}

		in.close();

		return input;

	}

	// int min or max with custom String parameter
	public static int getInput(String parameter, int cap, String capType) {

		Scanner in = new Scanner(System.in);
		int input;

		System.out.print("Please enter " + parameter + ": ");
		input = in.nextInt();

		if (capType.equalsIgnoreCase("min") || capType.equalsIgnoreCase("minimum")) {
			while (input < cap) {
				System.out.println("Your input was invalid. Please enter " + parameter + ": ");
				input = in.nextInt();
			}
		} else if (capType.equalsIgnoreCase("max") || capType.equalsIgnoreCase("maximum")) {
			while (input > cap) {
				System.out.println("Your input was invalid. Please enter " + parameter + ": ");
				input = in.nextInt();
			}
		}

		in.close();

		return input;

	}

}
