
/*
 * Programmer: Dylan Yang
 * Date: December 1, 2017
 * Purpose: to sort an array of 8 String values in alphabetical order
 */

public class SortAnimals {

	public static void ascendingExchangeSort(String[] array) {

		String temp;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++){
				if (array[i].compareTo(array[j]) < 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
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

	public static void main(String[] args) {

		String[] animals = {"camel", "ant", "dog", "cat", "horse", "mule", "java", "goose"};

		System.out.print("Unsorted: ");
		printArray(animals);

		System.out.println();

		ascendingExchangeSort(animals);

		System.out.print("  Sorted: ");
		printArray(animals);

	}

}
