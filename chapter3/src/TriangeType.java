/*
 * Programmer: Dylan Yang
 * Date: September 22 2017
 * Purpose: To create a program to determine the type of triangle.
 */

import java.util.Scanner;

public class TriangeType {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double s1, s2, s3;

		System.out.println("Please enter the first side length of the triangle.");
		s1 = in.nextDouble();
		System.out.println("Please enter the second side length.");
		s2 = in.nextDouble();
		System.out.println("Please enter the third and final side length.");
		s3 = in.nextDouble();

		if ((s1 + s2 > s3 && s1 < s3 && s2 < s3) || (s1 + s3 > s2 && s1 < s2 && s3 < s2) || (s2 + s3 > s1 && s2 < s1 && s3 < s1)) {
			if ((s1 == s2) && (s1 == s3))
				System.out.println("The triangle is equilateral.");
			else if ((s1 == s2) || (s1 == s3) || (s2 == s3))
				System.out.println("The triangle is isosceles.");
			else
				System.out.println("The triangle is scalene.");
		}
		else
			System.out.println("That's not a valid triangle.");
		if (s1*s1 + s2*s2 == s3*s3)
			System.out.println("That's a right triangle.");

		in.close();

	}
}
