/*
 * Programmer: Dylan Yang
 * Date: October 30, 2017
 * Purpose: to write a program that prints the late fee for an overdue library book
 */

import java.util.Scanner;

public class OverdueLibraryBook {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int days;
		
		System.out.print("How many days past due is the library book? ");
		days = in.nextInt();
		
		printLateFee(days);
		
		in.close();
		
	}
	
	public static void printLateFee(int days) {
		
		System.out.printf("The late fee is $%.2f. %n", days * 0.15);
		
		if (days > 10)
			System.out.println("WAY OVERDUE");
		
	}
	
}
