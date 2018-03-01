/*
 * Programmer: Dylan Yang
 * Date: October 30, 2017
 * Purpose: to write a program that uses two methods to produce the sum and product of two numbers
 */

import java.util.Scanner;

public class SumAndProduct {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int int1, int2;
		
		System.out.println("Please enter a number.");
		int1 = in.nextInt();
		System.out.println("Please enter another number.");
		int2 = in.nextInt();
		
		printSum(int1, int2);
		printProduct(int1, int2);
		
		in.close();
		
	}
	
	public static void printSum(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	public static void printProduct(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}
	
}
