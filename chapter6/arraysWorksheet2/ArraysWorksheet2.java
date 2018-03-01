
/*
 * Programmer: Dylan Yang
 * Date: November 15, 2017
 * Purpose: to establish an integer array num that holds 10 user-entered values and to perform operations on num
 */

import java.util.Scanner;

public class ArraysWorksheet2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Please enter integer " + (i + 1) + ": ");
			num[i] = in.nextInt();
		}
		
		System.out.println("The first element of the array is " + num[0] + ".");
		System.out.println("The last element of the array is " + num[num.length - 1] + ".");
		
		System.out.print("The entire array is "); PrintMyArray(num); System.out.println(".");
		
		System.out.println("The average of the elements of the array is " + ArrayAverage(num) + ".");
		
		in.close();
		
	}
	
	public static void PrintMyArray(int[] num) {
		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i < num.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}
	
	public static double ArrayAverage(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++)
			sum += num[i];
		return (double)sum / num.length;
	}
	
}
