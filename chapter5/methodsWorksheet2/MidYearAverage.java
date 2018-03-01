/*
 * Programmer: Dylan Yang
 * Date: October 25, 2017
 * Purpose: to write a program to respond to a user's inputed mid-year average in Java Programming
 */

import java.util.Scanner;

public class MidYearAverage {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int average;
		
		System.out.print("What is your mid-year average in Java Programming? ");
		average = in.nextInt();
		average = trapError(average);
		
		if (average >= 65)
			printPassingMessage();
		else
			printFailingMessage();
		
		in.close();
		
	}
	
	public static void printPassingMessage() {
		System.out.println("Good work! You are passing.");
	}
	
	public static void printFailingMessage() {
		System.out.println("Hook up with a smart classmate and STUDY!");
	}
	
	public static int trapError(int num) {
		
		Scanner in = new Scanner(System.in);
		
		while (num < 0 || num > 100) {
			System.out.println("Your average should be a positive integer between 1 and 100. Please try again. ");
			num = in.nextInt();
		}
		
		in.close();
		
		return num;
		
	}
	
}
