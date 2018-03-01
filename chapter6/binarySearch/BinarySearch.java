
/*
 * Programmer: Dylan Yang
 * Date: November 29, 2017
 * Purpose: to perform a binary search for the number 22 in a presorted array of 10 integers
 */

public class BinarySearch {

	public static int[] binarySearch(int[] array, int key, int start /* index to start search */, int end /* index to end search */) {

		int search /* index being searched */, comparisons = 1;
		int[] result = new int[2];

		search = (start + end) / 2;

		while ((array[search] != key) && (start <= end)) {
			comparisons++;
			if (array[search] > key)
				end = search - 1;
			else
				start = search + 1;
			search = (start + end) / 2;
		}
		if (start <= end) {
			result[0] = search; // first number is index of key
			result[1] = comparisons; // second number is number of comparisons
		}
		else{
			result[0] = -1; // index of key is given as -1 if key is not found in array
			result[1] = comparisons;
		}
		return result;

	}

	public static void main(String[] args) {

		int[] array = {11, 16, 22, 23, 34, 46, 48, 50, 75, 78};
		int searchValue = 22;
		
		if (binarySearch(array, 22, 0, 9)[0] > -1) // if index was found in array
			System.out.println("The value " + searchValue + " was found in the array at index " + binarySearch(array, 22, 0, 9)[0]
					+ " after " + binarySearch(array, 22, 0, 9)[1] + " comparisons.");
		else
			System.out.println("The value " + searchValue + " was found to not be in the array "
					+ "after " + binarySearch(array, 22, 0, 9)[1] + "comparisons");
		
	}

}
