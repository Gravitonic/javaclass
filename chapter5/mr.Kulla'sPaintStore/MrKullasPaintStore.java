/*
 * Programmer: Dylan Yang
 * Date: November 6, 2017
 * Purpose: to create a program for Mr. Kulla's Paint Store
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MrKullasPaintStore {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int gallons; // temporary counter
		double redCost = 0, greenCost = 0;
		String input = "yes";
		
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");

		System.out.println("* * * * * * * * * * * * * * *\n"
						 + "*     we welcome you to     *\n"
				 		 + "*  MR. KULLA'S PAINT STORE  *\n"
				 		 + "* * * * * * * * * * * * * * *");
		System.out.println("Mr. Kulla's Paint Store sells full gallons of red and green paint.");
		
		while (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {

			// finds paint color, stored in String input
			System.out.print("Which paint color do you wish to purchase? ");
			input = in.nextLine();
			// error trap
			while (!input.equalsIgnoreCase("red") && !input.equalsIgnoreCase("r") && !input.equalsIgnoreCase("green") && !input.equalsIgnoreCase("g")) {
				System.out.print("Mr. Kulla's Paint store only sells red and green paint. Please enter \"red\" or \"green\". ");
				input = in.nextLine();
			}

			// finds number of gallons, stored in int gallons
			System.out.print("How many gallons of paint do you wish to purchase? ");
			gallons = in.nextInt();
			// error trap
			while (gallons < 1) {
				System.out.print("Your input was invalid. Please enter an integer of value one or greater. ");
				gallons = in.nextInt();
			}
			in.nextLine();
			
			// finds cost of red and green paint
			if (input.equalsIgnoreCase("red") || input.equalsIgnoreCase("r")) {
				redCost += getRedCost(gallons);
			}
			else {
				greenCost += getGreenCost(gallons);
			}
			
			// tests for repeat
			System.out.print("Would you like to purchase more paint? ");
			input = in.nextLine();
			// error trap
			while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("no") && !input.equalsIgnoreCase("n")) {
				System.out.print("Your input was invalid. Please enter a \"yes\" or \"no\". ");
				input = in.nextLine();
			}

		}
		
		// bill composed of title, price, and thank-you message
		System.out.println();
		printStoreTitle();
		System.out.println("*    " + dateFormat.format(date) + "    *\n"
						 + "*                           *");
		System.out.printf("* %-15s %9.2f * %n", "Red Paint", redCost);
		System.out.printf("* %-15s %9.2f * %n", "Green Paint", greenCost);
		System.out.printf("* %-15s %9.2f * %n", "Subtotal", redCost + greenCost);
		System.out.printf("* %-15s %9.2f * %n", "Sales Tax (9%)", 0.09 * (redCost + greenCost));
		System.out.println("* ------------------------- *");
		System.out.printf("* %-15s %9.2f * %n", "Total", getTotalCost(redCost, greenCost));
		printThankYou();

		in.close();

	}

	public static double getRedCost(int gallons) {
		return 21.95 * gallons;
	}

	public static double getGreenCost(int gallons) {
		return 19.95 * gallons;
	}

	public static void printStoreTitle() {
		System.out.println("* * * * * * * * * * * * * * *\n"
						 + "*  MR. KULLA'S PAINT STORE  *\n"
						 + "*                           *\n"
						 + "*       821 Bubb Road       *\n"
						 + "*    Cupertino, CA 95014    *\n"
						 + "*                           *");
	}

	public static double getTotalCost(double redCost, double greenCost) {
		return 1.09 * (redCost + greenCost);
	}
	
	public static void printThankYou() {
		System.out.println("*                           *\n"
						 + "* thank you for shopping at *\n"
						 + "*  MR. KULLA'S PAINT STORE  *\n"
						 + "* * * * * * * * * * * * * * *");
	}
	
}
