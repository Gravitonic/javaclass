/*
 * Programmer: Dylan Yang
 * Date: September 29 2017
 * Purpose: To respond to a number inputted by the user.
 */

import java.util.Scanner;

public class NumberMessage {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("Please enter a number between 1 and 10 inclusive.");
		num = in.nextInt();
		
		switch (num) {
		case 1:
		case 3:
			System.out.println("Your number is a low odd number.");
			break;
		case 2:
		case 4:
			System.out.println("Your number is a low even number.");
			break;
		case 5:
			System.out.println("Your number is the middle odd number.");
			break;
		case 6:
			System.out.println("Your number is the middle even number.");
			break;
		case 7:
		case 9:
			System.out.println("Your number is a high odd number.");
			break;
		case 8:
		case 10:
			System.out.println("Your number is a high even number.");
			break;
		default:
			System.out.println("Your number is invalid.");
			break;
		}

		in.close();

	}
}
