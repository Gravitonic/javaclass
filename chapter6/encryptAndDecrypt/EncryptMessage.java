
/*
 * Programmer: Dylan Yang
 * Date: November 28, 2017
 * Purpose: to create two methods to encrypt  
 */

import java.util.Scanner;

public class EncryptMessage {

	public static String encrypt(String message) {

		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghij";
	 // String shift = "18394739385492957393859392039493928749683958392849487403859603";
		String encrypted = "";

		for (int i = 0; i < message.length(); i++)
			encrypted = encrypted + chars.charAt(chars.indexOf(message.charAt(i)) + 4) + "";

		return encrypted;
	}

	public static String decrypt(String encrypted) {

		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghij";
	 // String shift = "18394739385492957393859392039493928749683958392849487403859603";
		String message = "";

		for (int i = 0; i < encrypted.length(); i++)
			message = message + chars.charAt(chars.indexOf(encrypted.charAt(i)) - 4) + "";

		return message;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String message;
		int input;

		System.out.print("Please enter a message: "); 
		message = in.nextLine();

		System.out.println("Would you like to encrypt or decrypt your message?\n"
				+ "\t1. Encrypt\n"
				+ "\t2. Decrypt"); 
		input = in.nextInt(); 
		in.nextLine();

		while (input != 1 && input != 2) {
			System.out.println("Your input was invalid. Please enter 1 or 2."); 
			input = in.nextInt(); 
			in.nextLine();
		}

		if (input == 1) {
			System.out.println("Encrypted: " + encrypt(message));

			System.out.println("Would you like to decrypt this message?\n"
					+ "\t1. Yes\n"
					+ "\t2. No");
			input = in.nextInt();
			while (input != 1 && input != 2) {
				System.out.println("Your input was invalid. Please enter 1 or 2.");
				input = in.nextInt();
				in.nextLine();
			}
			if (input == 1)
				System.out.println("Decrypted: " + decrypt( encrypt(message)));
		}
		else
			System.out.println("Decrypted: " + decrypt(message));

		in.close();

	}

}
