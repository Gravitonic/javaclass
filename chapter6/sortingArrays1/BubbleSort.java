
/*
 * Programmer: Dylan Yang
 * Date: November 30, 2017
 * Purpose: to sort an array of 10 integers into descending order using the bubble sort
 */

public class BubbleSort {
	
	public static void descendingBubbleSort(int[] array) {
		
		boolean swapped = true;
		int temp;
		
		while (swapped) {
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					swapped = true;
				}
			}
		}
		
	}
	
	public static void printArray(int[] num) {
		
		System.out.print("[");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i < num.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");
		
	}
	
	public static void main(String[] args) {
		
		int[] ints = {65, 45, 34, 12, 99, 54, 39, 2, 88, 18};
		
		System.out.println("Before sorting: ");
		printArray(ints);
		
		System.out.println("\n");
		
		System.out.println("After sorting into descending order: ");
		descendingBubbleSort(ints);
		printArray(ints);
		
	}
	
}
