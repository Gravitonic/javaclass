/*
 * Programmer: Dylan Yang
 * Date: October 25, 2017
 * Purpose: to write two functions that return the square and cube of a number, respectively
 */

import java.util.Scanner;

public class SquareAndCube {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double input;
		
		System.out.println("Please enter a number to square and cube.");
		input = in.nextDouble();
		
		System.out.println("Square: " + square(input));
		System.out.println("Cube:   " + cube(input));
		
		in.close();
		
	}
	
	public static double square(double num) {
		return num * num;
	}
	
	public static double cube(double num) {
		return num * num * num;
	}
	
}
