

/*
 * Programmer: Dylan Yang
 * Date: September 5 2017
 * Purpose: To concatenate @google.com to the user's name.
 */

import java.util.Scanner;

public class Address {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name;
		String streetAddress;
		String cityStateZip;
		String city;
		
		System.out.println("What is your name?");
		name = in.nextLine();
		
		System.out.println("What is your street address?");
		streetAddress = in.nextLine();
		
		System.out.println("What is your city, state, and ZIP code?");
		cityStateZip = in.nextLine();
		
		System.out.println(name + "\n"
						 + streetAddress + "\n"
						 + cityStateZip);
		
		city = cityStateZip.substring(0, cityStateZip.indexOf(","));
		
		System.out.println("The length of " + city + " is " + (cityStateZip.indexOf(",") - 1) + ".");
		
		in.close();
		
	}

}
