
/*
 * Programmer: Dylan Yang
 * Date: December 1, 2017
 * Purpose: to sort an array of 5 friends' names and search for the name "Bob"
 */

import java.util.Scanner;

public class SortFriends {
	
	public static void bubbleSort(String[] array, int direction) {

		boolean swapped = true;
		String temp;

		while (swapped) {
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if ((direction > 0) && (array[i].compareTo(array[i+1]) > 0)) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					swapped = true;
				} else {
					if (array[i].compareTo(array[i+1]) > 0) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
						swapped = true;
					}
				}
			}
		}

	}

	public static void printArray(String[] num) {

		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i < num.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}
	
	public static int sequentialSearch(String[] array, String key) {
		
		for (int i = 0; i < array.length; i++)
			if (array[i].equalsIgnoreCase(key))
				return i;
		
		return -1;
		
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] friends = new String[5];

		for (int i = 0; i < friends.length; i++) {
			System.out.print("Please enter the first name of a friend: ");
			friends[i] = in.nextLine();
		}

		System.out.print("Unsorted: ");
		printArray(friends);
		
		System.out.println();
		
		bubbleSort(friends, 1);
		
		System.out.print("  Sorted: ");
		printArray(friends);
		
		System.out.println();
		
		if (sequentialSearch(friends, "Bob") >= 0)
			System.out.println("\"Bob\" was found at index " + sequentialSearch(friends, "Bob") + " in the sorted array.");
		else
			System.out.println("\"Bob\" was not found in the array.");
		
		in.close();

	}

}
