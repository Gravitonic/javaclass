
/*
 * Programmer: Dylan Yang
 * Date: November 30, 2017
 * Purpose: to alphabetize an array of 10 chars
 */

public class AlphabetizeChars {

	public static void ascendingExchangeSort(char[] array) {

		char temp;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) 	{
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

	}

	public static void printArray(char[] num) {

		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i < num.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}

	public static void main(String[] args) {

		char[] chars = {'a', 'g', 'k', 'j', 't', 'i', 'f', 's', 'w', 'b'};

		System.out.println("Before sorting: ");
		printArray(chars);

		System.out.println("\n");

		System.out.println("After sorting into descending order: ");
		ascendingExchangeSort(chars);
		printArray(chars);

	}

}
