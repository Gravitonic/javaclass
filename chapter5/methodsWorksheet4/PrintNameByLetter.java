/*
 * Programmer: Dylan Yang
 * Date: October 30, 2017
 * Purpose: to write a program that prints the user's name letter by letter and then says goodbye to the user
 */

import java.util.Scanner;

public class PrintNameByLetter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name;
		
		System.out.print("What is your name? ");
		name = in.nextLine();
		
		printByLetter(name);
		
		System.out.println("Goodbye, " + name + ".");
		
		in.close();
		
	}
	
	public static void printByLetter(String word) {
		
		for (int i = 0; i < word.length(); i++)
			System.out.println(word.charAt(i));
		
	}
	
}
