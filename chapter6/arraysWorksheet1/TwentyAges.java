
/*
 * Programmer: Dylan Yang
 * Date: November 14, 2017
 * Purpose: to store the ages of 20 people in an array
 */

import java.util.Scanner;

public class TwentyAges {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] ages = new int[20];
		int count = 0;

		for (int i = 0; i < ages.length; i++) {
			System.out.print("Enter age #" + (i + 1) + ": ");
			ages[i] = in.nextInt();
		}

		for (int i = 0; i < ages.length; i++) {
			if (ages[i] > 15)
				count++;
		}

		if (count == 1)
			System.out.println("There is " + count + " age greater than 15.");
		else if (count > 1)
			System.out.println("There are " + count + " ages greater than 15.");

		in.close();

	}

}
