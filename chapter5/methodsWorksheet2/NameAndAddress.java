/*
 * Programmer: Dylan Yang
 * Date: October 25, 2017
 * Purpose: to write a program using two methods to print personal information between lines of $-symbols
 */

public class NameAndAddress {
	
	public static void main(String[] args) {
		
		printCharGrid('$', 2, 30);
		printNameAndAddress();
		printCharGrid('$', 3, 30);
		
	}
	
	public static void printCharGrid(char c, int rows, int cols) {
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++)
				System.out.print(c);
			System.out.println();
		}
		
	}
	
	public static void printNameAndAddress() {
		
		System.out.println("Bill Gates\n"
						 + "1 Microsoft Way\n"
						 + "Redmond, WA 98104");
		
	}
	
}