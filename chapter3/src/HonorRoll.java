/*
 * Programmer: Dylan Yang
 * Date: September 22 2017
 * Purpose: To create a program to determine the honor roll eligibility of the student.
 */

import java.util.Scanner;

public class HonorRoll {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double average;
		int courses;
		char infractions;

		System.out.println("What is your grade average?");
		average = in.nextDouble();

		System.out.println("How many courses do you take?");
		courses = in.nextInt();

		System.out.println("Do you have any discipline infractions? (Y/N)");
		infractions = in.next().toLowerCase().charAt(0);
		
		if (average >= 90.00 && courses >= 5 && (infractions == 'n'))
			System.out.println("You are eligible for honor roll.");
		else
			System.out.println("You are not eligible for honor roll.");

		in.close();

	}
}
