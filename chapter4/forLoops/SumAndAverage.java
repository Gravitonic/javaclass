/*
 * Programmer: Dylan Yang
 * Date: Oct 11 2017
 * Purpose: to print the sum total and average of any number of numbers inputted by the user
 */

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int sum = 0, count, input, userCount;
		double average;

		System.out.println("How many numbers would you like to input?");
		userCount = in.nextInt();

		for (count = 0; count < userCount; count++) {

			System.out.println("Please enter a number.");
			input = in.nextInt();
			sum += input;

		}

		average = (double)sum/userCount;
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);

		in.close();

	}
}
