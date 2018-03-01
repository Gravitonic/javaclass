/*
 * Programmer: Dylan Yang
 * Date: September 20 2017
 * Purpose: To create a program to determine whether an input is odd or even.
 */

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a positive integer below.");
		num = in.nextInt();
		
		if (num % 2 == 0)
			System.out.println("Your integer is even.");
		else if (num % 2 == 1)
			System.out.println("Your integer is odd.");
		else
			System.out.println("Your input is invalid. It should be a positive integer.");
		
		in.close();
		
	}
}
