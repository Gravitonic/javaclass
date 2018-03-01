/*
 * Programmer: Dylan Yang
 * Date: September 21 2017
 * Purpose: To create a program to sort two positive integers.
 */

import java.util.Scanner;

public class SortTwoIntegers {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Please enter a positive integer.");
		num1 = in.nextInt();
		
		System.out.println("Please enter another positive integer.");
		num2 = in.nextInt();
		
		if (num1 < num2)
			System.out.println(num1 + " " + num2);
		else if (num1 > num2)
			System.out.println(num2 + " " + num1);
		else if (num1 == num2)
			System.out.println("Your numbers are equal.");
		else
			System.out.println("Your input is not valid. Please enter positive integers.");
		
		in.close();
		
	}
}
