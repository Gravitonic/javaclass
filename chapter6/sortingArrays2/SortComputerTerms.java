
/*
 * Programmer: Dylan Yang
 * Date: December 1, 2017
 * Purpose: to sort an array of 10 computer terms and search for the word "keyboard"
 */

import java.util.Scanner;

public class SortComputerTerms {

	public static void exchangeSort(String[] array, int direction) {

		String temp;

		if (direction > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++){
					if (array[i].compareTo(array[j]) > 0) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++){
					if (array[i].compareTo(array[j]) > 0){
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
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

	public static int[] binarySearch(String[] array, String key, int start /* index to start search */, int end /* index to end search */) {

		int search /* index being searched */, comparisons = 1;
		int[] result = new int[2];

		search = (start + end) / 2;

		while (!(array[search].equalsIgnoreCase(key)) && (start <= end)) {
			comparisons++;
			if (array[search].compareTo(key) > 0)
				end = search - 1;
			else
				start = search + 1;
			search = (start + end) / 2;
		}
		if (start <= end) {
			result[0] = search; // first number is index of key
			result[1] = comparisons; // second number is number of comparisons
		}
		else {
			result[0] = -1; // index of key is given as -1 if key is not found in array
			result[1] = comparisons;
		}
		return result;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] terms = new String[10];

		for (int i = 0; i < terms.length; i++) {
			System.out.print("Please enter a computer term: ");
			terms[i] = in.nextLine();
		}

		System.out.print("Unsorted: ");
		printArray(terms);

		System.out.println();

		exchangeSort(terms, 1);

		System.out.print("  Sorted: ");
		printArray(terms);

		System.out.println();

		if (binarySearch(terms, "keyboard", 0, terms.length - 1)[0] >= 0)
			System.out.println("\"Keyboard\" was found at index " + binarySearch(terms, "keyboard", 0, terms.length) + ".");
		else
			System.out.println("\"Keyboard\" was not found in the array.");

		in.close();

	}

}
