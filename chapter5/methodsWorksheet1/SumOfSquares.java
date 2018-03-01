/*
 * Programmer: Dylan Yang
 * Date: October 24, 2017
 * Purpose: to write a method that adds the squares
 */

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x, y;
		
		System.out.println("Please enter an integer.");
		x = in.nextInt();
		
		System.out.println("Please enter another integer.");
		y = in.nextInt();
		
		printSumOfSquares(x, y);
		
		in.close();
		
	}
	
	public static void printSumOfSquares(int a, int b) {
		
		System.out.println(a*a + b*b);
		
	}
	
}
