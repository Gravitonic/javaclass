/*
 * Programmer: Dylan Yang
 * Date: September 21 2017
 * Purpose: To create a program to calculate the entry fee for a local art museum.
 */

import java.util.Scanner;

public class EntryFee {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int age;

		System.out.println("Please enter your age below.");
		age = in.nextInt();

		if (age < 5) 
			System.out.println("You can visit the museum for free!");
		else if (age >= 65)
			System.out.println("You can visit the museum for a cost of $1.50");
		else
			System.out.println("You can visit the museum for $2.50"); 
		
		in.close();
		
	}
}
