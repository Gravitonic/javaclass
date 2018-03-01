/*
 * Programmer: Dylan Yang
 * Date: Dec 13, 2017
 * Purpose: to test the CheckingAccount class 
 */

import java.util.Scanner;

public class TestCheckingAccount {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input;
		boolean repeat = false;
		
		do {
			
			System.out.println("Welcome to the Java World Bank. How can I help you?\n"
							 + "\t1. View balance\n"
							 + "\t2. Deposit money\n"
							 + "\t3. Process a check\n"
							 + "Please enter the corresponding number.");
			input = in.nextInt();
			while (input < 1 || input > 3) {
				System.out.println("Sorry, I didn't get that. Please enter a number from one to three, inclusive.");
				input = in.nextInt();
			}
			
			switch (input) {
			case 1:
				System.out.printf("Your account balance is $%.2f. %n", CheckingAccount.getBalance());
				break;
			case 2:
				System.out.print("How much money would you like to deposit? ");
				input = in.nextInt();
				while (input <= 0) {
					System.out.println("Sorry, I didn't get that. Please enter a positive number.");
					input = in.nextInt();
				}
				CheckingAccount.processDeposit(input);
				System.out.printf("Your account balance is now $%.2f. %n", CheckingAccount.getBalance());
				break;
			case 3:
				System.out.print("How much money is the check worth? ");
				input = in.nextInt();
				while (input <= 0) {
					System.out.println("Sorry, I didn't get that. Please enter a positive number.");
					input = in.nextInt();
				}
				if (CheckingAccount.getBalance() - input >= 0) {
					CheckingAccount.processCheck(input);
					System.out.printf("Your account balance is now $%.2f. %n", CheckingAccount.getBalance());
				} else {
					System.out.println("You do not have enough money in your account.");
					System.out.printf("Your account balance is only $%.2f. %n", CheckingAccount.getBalance());
				}
				
			}
			
			System.out.println("Is there anything else that I can help you with?\n"
					+ "\t1. Yes\n"
					+ "\t2. No\n"
					+ "Please enter the corresponding number.");
			input = in.nextInt();
			while (input < 1 || input > 2) {
				System.out.println("Sorry, I didn't get that. Please enter either one or two.");
				input = in.nextInt();
			}
			
			if (input == 1)
				repeat = true; // repeat is false by default
			
		} while (repeat);
		
		System.out.println("Thank you for choosing the Java World Bank. We hope to see you again soon.");
		
		in.close();
		
	}

}
