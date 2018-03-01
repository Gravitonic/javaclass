
/*
 * Programmer: Dylan Yang
 * Date: November 16, 2017
 * Purpose: to obtain the sum of user-entered integers and find what percentage of the sum each number takes up
 */

import java.util.Scanner;

public class SumPercentages {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] array;
		int sum = 0, input;
		
		System.out.print("How many numbers do you plan to enter? ");
		input = in.nextInt();
		while (input < 1) {
			System.out.println("Your input was invalid. Please enter a positive integer.");
			input = in.nextInt();
		}
		array = new int[input];
		
		if (array.length == 1)
			System.out.println("\nPlease enter the integer:");
		else
			System.out.println("\nPlease enter the " + array.length + " integers.");
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
			sum += array[i];
		}
		
		System.out.println("\nThe sum of your numbers is " + sum + ".");
		
		System.out.println("\nStatistics:");
		for (int i = 0; i < array.length; i++) {
			System.out.printf(array[i] + " is %.1f%% of the sum.", (double)100 * array[i] / sum);
			System.out.println();
		}
		
		in.close();
		
	}
	
}
