/*
 * Programmer: Dylan Yang
 * Date: Oct 9 2017
 * Purpose: to print the even numbers between 2 and 40, inclusive, each on a new line
 */

public class EvenIntegers_DoWhile4 {

	public static void main(String[] args) {

		int num;

		num = 2;

		do {

			System.out.println(num);
			num += 2;

		} while (num <= 40);

	}
}
