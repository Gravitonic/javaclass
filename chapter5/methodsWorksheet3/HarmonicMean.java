/*
 * Programmer: Dylan Yang
 * Date: October 25, 2017
 * Purpose: to write a function that returns the harmonic mean of two inputted numbers
 */

import java.util.Scanner;

public class HarmonicMean {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double input1, input2;
		
		System.out.println("Please enter a number.");
		input1 = in.nextDouble();
		
		System.out.println("Please enter another number.");
		input2 = in.nextDouble();
		
		System.out.println("The harmonic mean of your two numbers is " + getHarmonicMean(input1, input2) + ".");
		
		in.close();
		
	}
	
	public static double getHarmonicMean(double a, double b) {
		
		return java.lang.Math.pow(((java.lang.Math.pow(a, -1) + java.lang.Math.pow(b, -1)) / 2), -1);
		
	}
	
}
