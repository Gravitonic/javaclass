/*
 * Programmer: Dylan Yang
 * Date: September 20 2017
 * Purpose: To create a program to determine the cost of a telegram.
 */

import java.util.Scanner;

public class YearAndFruit {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int year;
		String fruit;
		
		System.out.println("Please enter your year of birth.");
		year = in.nextInt();
		in.nextLine();
		
		if (year < 1970)
			System.out.println("You qualify for the Juke Box Rally.");
		
		System.out.println("Please enter your favorite fruit");
		fruit = in.nextLine();
		
		if (fruit.equalsIgnoreCase("strawberry"))
			System.out.println("Strawberry Fields Forever");
		else
			System.out.println("Bye, bye Miss American Pie");
		
		in.close();
		
	}
}
