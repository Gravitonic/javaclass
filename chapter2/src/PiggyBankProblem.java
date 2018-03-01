/*
 * Programmer: Dylan Yang
 * Date: September 14 2017
 * Purpose: to create a program to assist children with totaling the amount of money in their piggy bank.
 */

import java.util.Scanner;

public class PiggyBankProblem {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name, first; // Full name and first name
		int quarters, dimes, nickels, pennies, weeks; // Variables represent quantities
		double total, average; // Total and average value of input
		
		System.out.println("* * * * * * * * * * * * * *\n"
						 + "* MyPIGGY ACCOUNT MANAGER *\n"
						 + "* * * * * * * * * * * * * *\n");
		
		System.out.println("What is your full name?"); // Only first or last name will return error
		name = in.nextLine();
		
		name = name.substring(0,1).toUpperCase() + name.substring(1); // Capitalizes first letter
		
		name = name.substring(0, name.indexOf(" ")+1) 								 // Maintains first name up to space
			 + name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase() // Finds first letter of last name after space
			 + name.substring(name.indexOf(" ") + 2); 								 // Maintains rest of last name

		first = name.substring(0,name.indexOf(" ")); // Sets variable to first name
		
		System.out.println("How many quarters do you have?");
		quarters = in.nextInt();
		
		System.out.println("How many dimes do you have?");
		dimes = in.nextInt();
		
		System.out.println("How many nickels do you have?");
		nickels = in.nextInt();
		
		System.out.println("How many pennies do you have?");
		pennies = in.nextInt();
		
		System.out.println("How many weeks have you been saving for?");
		weeks = in.nextInt();
		
		total = quarters * 0.25 + dimes * 0.1 + nickels * 0.05 + pennies * 0.01; // Total value
		average = total / weeks; // Average value
		
		System.out.println("\nHere's your account summary, " + first + ".\n"); // Prints a chart
		System.out.printf("\tCOIN TYPE      QUANTITY    VALUE %n");
		System.out.printf("\t--------------------------------%n");
		System.out.printf("\tQuarters       %-11d $%-8.2f %n", quarters, quarters*0.25);
		System.out.printf("\tDimes          %-11d $%-8.2f %n", dimes, dimes*0.1);
		System.out.printf("\tNickels        %-11d $%-8.2f %n", nickels, nickels*0.05);
		System.out.printf("\tPennies        %-11d $%-8.2f %n", pennies, pennies*0.01);
		System.out.printf("\tTotal          %-11d $%-8.2f %n", quarters+dimes+nickels+pennies, total);
		System.out.printf("\tAverage/Week   %-11d ~$%-8.2f %n %n", weeks, average);
		
		System.out.printf(name + ", you saved a total of S%.2f during " + weeks + " week(s).\n", total);
		System.out.printf("At this rate, you can save $%.2f in one year.", average*52); // Estimate of yearly savings
		
		in.close();
		
	}
}
