/*
 * Programmer: Dylan Yang
 * Date: September 8 2017
 * Purpose: To
 */

import java.util.Scanner;

/*
 * Programmer: Dylan Yang
 * Date: September 8 2017
 * Purpose: To display the digits of a three-digit number and the sum of the digits.
 */

public class ThreeDigits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int number;
		int first;
		int second;
		int third;	

		System.out.println("Enter a three-digit number below.");
		number = in.nextInt();

		first = number/100;
		second = number/10 - number/100 * 10;
		third = number%10;

		System.out.println("The first digit is " + first + ".\n"
				 + "The second digit is " + second + ".\n"
				 + "The third digit is " + third + ".");

		System.out.println("The sum of each of the three digits is "
				+ (first + second + third) + ".");

		in.close();

	}
	
}
