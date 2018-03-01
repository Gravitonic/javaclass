/*
 * Programmer: Dylan Yang
 * Date: October 12 2017
 * Purpose: to create a salute to pets
 */

import java.util.Scanner;

public class Pets {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String name;
		String format;
		int times;

		System.out.println("What is the name of your favorite pet?");
		name = in.nextLine();

		System.out.println("How many times would you like to see the name appear on the screen?");
		times = in.nextInt();
		in.nextLine();
		
		while (times < 1) {
			
			System.out.println("Your input was invalid. Please input a nonnegative integer.");
			times = in.nextInt();
			
		}
		
		System.out.println("Would you like to see the names one per line, or arranged horizontally? "
                         + "Please enter \"vertically\" or \"horizontally\".");
		format = in.nextLine();
		
		if (format.equalsIgnoreCase("vertically")) {
			
			for (int i = 0; i < times; i++)
				System.out.println(name);
			
		}
		else if (format.equalsIgnoreCase("horizontally")) {
			
			for (int i = 0; i < times; i++)
				System.out.print(name + " ");
			
		}

		in.close();
		
	}
}
