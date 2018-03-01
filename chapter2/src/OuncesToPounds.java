/*
 * Programmer: Dylan Yang
 * Date: August 30 2017
 * Purpose: To convert a weight in ounces to pounds.
 */

import java.util.Scanner;

public class OuncesToPounds {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int ounces;
		
		System.out.println("Please enter the number of ounces below.");
		ounces = in.nextInt();
		
		System.out.println(ounces + " ounces is equal to " + ounces/16 + " pounds and " + ounces%16 + " ounces.");
		
		in.close();
		
	}
}
