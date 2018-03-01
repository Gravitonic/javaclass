/*
 * Programmer: Dylan Yang
 * Date: October 25, 2017
 * Purpose: to write a program to double an user-inputted number
 */

import java.util.Scanner;

public class DoubleNumber {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double input;
		
		System.out.println("Please enter a number.");
		input = in.nextDouble();
		
		System.out.println("Your number, doubled, is " + timesTwo(input) + ".");
		
		in.close();
		
	}
	
	public static double timesTwo(double num) {
		return num * 2;
	}
	
}
