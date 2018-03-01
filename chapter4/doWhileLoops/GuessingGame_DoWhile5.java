/*
 * Programmer: Dylan Yang
 * Date: Oct 9 2017
 * Purpose: to simulate a guessing game
 */

import java.util.Scanner;

public class GuessingGame_DoWhile5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int rand = (int)(Math.random() * 100) + 1, input, count = 0;

		do {
			
			System.out.println("Please enter a number between 1 and 100.");
			input = in.nextInt();
			
			count++;
			
			while (input < 1 || input > 100) {
				
				System.out.println("Your number was not between 1 and 100. Please try again.");
				input = in.nextInt();
				
			}
			
			if (input < rand)
				System.out.println("Your guess is too low.");
			
			else if (input > rand)
				System.out.println("Your guess is too high.");
			
			else
				System.out.println("Correct!");
		
		} while (input != rand);
		
		System.out.println("It took you " + count + " guesses.");
		
		in.close();

	}
}
