
/* Programmer: Dylan Yang
 * Date: November 30, 2017
 * Purpose: to sort an array of 5 doubles into ascending order using the exchange sort
 */

public class ExchangeSort {

	public static void ascendingExchangeSort(double[] array) {

		double temp;

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

	public static void printArray(double[] num) {

		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i < num.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}

	public static void main(String[] args) {

		double[] doubles = {43.2, 13.6, 91.4, 23.6, 72.1};

		System.out.println("Before sorting: ");
		printArray(doubles);
		
		System.out.println("\n");
		
		System.out.println("After sorting into descending order: ");
		ascendingExchangeSort(doubles);
		printArray(doubles);

	}

}
