/*
 * Programmer: Dylan Yang
 * Date: October 6 2017
 * Purpose: To use a while loop to print the user's name letter by letter
 */

import java.util.Scanner;

public class NameByLetter_WhileLoops5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String name;
		int index;

		System.out.print("Please enter your first name: ");
		name = in.nextLine();

		index = 0;

		while (index < name.length()) {

			System.out.println((index + 1) + ". " + name.charAt(index++));

		}

		in.close();
		
	}
}
