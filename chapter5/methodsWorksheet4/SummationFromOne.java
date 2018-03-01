/* Programmer: Dylan Yang
 * Date: October 30, 2017
 * Purpose: to write a program that prints the late fee for an overdue library book
 */

import java.util.Scanner;

public class SummationFromOne {

	public static void main(String[] args) {

		int input;

		input = getInput("a positive integer", 1);

		System.out.println(addNumbersFromOne(input));

	}

	public static int addNumbersFromOne(int num) {

		int result = 0;

		for (int i = 1; i <= num; i++)
			result += i;

		return result;

	}

	public static int getInput(String parameter, int min) {

		Scanner in = new Scanner(System.in);
		int input;

		System.out.print("Please enter " + parameter + ": ");
		input = in.nextInt();

		while (input < min) {
			System.out.println("Your input was invalid. Please enter " + parameter + ": ");
			input = in.nextInt();
		}

		in.close();

		return input;

	}

}
