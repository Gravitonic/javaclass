/* Programmer: Dylan Yang
 * Date: October 30, 2017
 * Purpose: to write a program that prints the late fee for an overdue library book
 */

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		int radius;
		
		radius = getInput(1, 10);
		
		System.out.printf("The area of the circle with a radius of %d unit(s) is %.2f square unit(s).", radius, circleArea(radius));
		
	}
	
	public static double circleArea(int radius) {
		
		return (radius * radius * Math.PI);
		
	}
	
	public static int getInput(int min, int max) {

		Scanner in = new Scanner(System.in);
		int input;

		System.out.print("Please enter a number between " + min + " and " + max + ", inclusive: ");
		input = in.nextInt();

		while (input < min || input > max) {
			System.out.println("Your input was not valid. Please enter a number between " + min + " and " + max + ".");
			input = in.nextInt();
		}

		in.close();

		return input;

	}
	
}
