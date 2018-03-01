/*
 * Programmer: Dylan Yang
 * Date: October 24, 2017
 * Purpose: to write a method that adds the squares
 */

import java.util.Scanner;

public class CharacterGrid {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		char c;
		int rows, cols;
		
		System.out.print("What character would you like to print? ");
		c = in.nextLine().charAt(0);
		
		System.out.print("How many times should this character be printed per line? ");
		cols = in.nextInt();
		
		System.out.print("How many lines should be printed? ");
		rows = in.nextInt();
		
		printCharGrid(c, rows, cols);
		
		in.close();
		
	}
	
	public static void printCharGrid(char c, int rows, int cols) {
		
		for (int row = 0; row < rows; row++) {
			
			for (int col = 0; col < cols; col++)
				System.out.print(c);
			
			System.out.println();
		}
		
	}
	
}
