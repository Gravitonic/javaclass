/*
 * Programmer: Dylan Yang
 * Date: August 31 2017
 * Purpose: To calculate the gas mileage of the user.
 */

import java.util.Scanner;

public class GasMileage {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float miles;
		float gallons;
		
		System.out.println("Please enter your commute distance in miles below.");
		miles = in.nextFloat();
		
		System.out.println("Please enter how many gallons of gasoline are purchased each 5-day week.");
		gallons = in.nextFloat();
		
		System.out.println("Your average gas mileage is " + (miles * 2)/(gallons / 5) + " miles per gallon.");
		
		in.close();
		
	}
}
