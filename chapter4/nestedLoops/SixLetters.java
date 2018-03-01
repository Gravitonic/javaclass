/*
 * Programmer: Dylan Yang
 * Date: Oct 13 2017
 * Purpose: to use nested loops to print a design using six letters of the alphabet
 */

public class SixLetters {

	public static void main(String[] args) {

		char n;
		char a;

		for (a = 'A'; a <= 'F'; a++) {
			for (n = 'A'; n <= a; n++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
