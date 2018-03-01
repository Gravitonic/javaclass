
/*
 * Programmer: Dylan Yang
 * Date: Dec 6, 2017
 * Purpose: to automate Mr. Kulla's Video Store's collection of late fees
 */

public class VideoStoreSystem {

	public static void calculateLateFees(int[] rentalCodes, int[] rentalDays, double[] lateFees) {

		for (int i = 0; i < rentalCodes.length; i++) {
			if (rentalDays[i] > rentalCodes[i]) {
				if (rentalCodes[i] == 1)
					lateFees[i] = 1.49 * (rentalDays[i] - rentalCodes[i]);
				else
					lateFees[i] = 0.69 * (rentalDays[i] - rentalCodes[i]);
			} else {
				lateFees[i] = 0.0;
			}
		}

	}

	public static void exchangeSort(int[] array, int[] array2, int[] array3, int[] array4, String[] array5, double[] array6, int direction) {

		if (direction > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						swap(i, j, array );
						swap(i, j, array2);
						swap(i, j, array3);
						swap(i, j, array4);
						swap(i, j, array5);
						swap(i, j, array6);
					}
				}
			}
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] < array[j]) {
						swap(i, j, array );
						swap(i, j, array2);
						swap(i, j, array3);
						swap(i, j, array4);
						swap(i, j, array5);
						swap(i, j, array6);
					}
				}
			}
		}

	}

	private static void swap(int i, int j, int[] array) {

		int temp;

		temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	private static void swap(int i, int j, String[] array) {

		String temp;

		temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	private static void swap(int i, int j, double[] array) {

		double temp;

		temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static void printLateCustomers(String[] names, int[] customerIDs, int[] movieIDs, int[] rentalCodes, int[] rentalDays, double[] lateFees) {
		System.out.println("LATE CUSTOMERS:");
		System.out.printf("%-25s | %-11s | %-11s | %-11s | %-11s | %-11s %n", 
				"Customer Name", "Customer ID", "Movie ID", "Rental Code", "Days Rented", "Late Fees");
		System.out.println("---------------------------------------------------------------------------------------------");
		for (int i = 0; i < names.length; i++ ) {
			if (lateFees[i] > 0.0)
				System.out.printf("%-25s | %-11d | %-11d | %-11d | %-11d | $%-10.2f %n", 
						names[i], customerIDs[i], movieIDs[i], rentalCodes[i], rentalDays[i], lateFees[i]);
		}
	}

	public static void printOnTimeCustomers(String[] names, int[] customerIDs, int[] movieIDs, int[] rentalCodes, int[] rentalDays, double[] lateFees) {
		System.out.println("ON-TIME CUSTOMERS:");
		System.out.printf("%-25s | %-11s | %-11s | %-11s | %-11s | %-11s %n", "Customer Name", "Customer ID", "Movie ID", "Rental Code", "Days Rented", "Late Fees");
		System.out.println("---------------------------------------------------------------------------------------------");
		for (int i = 0; i < names.length; i++ ) {
			if (lateFees[i] == 0.0)
				System.out.printf("%-25s | %-11d | %-11d | %-11d | %-11d | $%-10.2f %n", 
						names[i], customerIDs[i], movieIDs[i], rentalCodes[i], rentalDays[i], lateFees[i]);
		}
	}

	public static void main(String[] args) {

		String[] names = {
				"Lanelle Ellingwood", 
				"Harland Ellebracht", 
				"Stephanie Jenderer", 
				"Clark Jauhar", 
				"Christian Michelotti", 
				"Marc Kulla", 
				"Demetra Ringlein",
				"Berry Pendergrass",
				"Mose Grygiel", 
				"Jeffrey Meng"
		};
		int[] customerIDs = { 183,  001,  397,  855,  178,  794,  386,  189,  295,  795};
		int[] movieIDs	  = {1980, 2856, 8875, 2985, 9235, 2866, 1855, 9824, 1334, 1800};
		int[] rentalCodes = {   1,    5,    5,    1,    5,    5,    1,    5,    1,    1};
		int[] rentalDays  = {   1,    7,    9,    3,    8,    4,    7,    9,    2,   16};
		double[] lateFees = new double[10];

		calculateLateFees(rentalCodes, rentalDays, lateFees);

		exchangeSort(customerIDs, movieIDs, rentalCodes, rentalDays, names, lateFees, 1);

		printLateCustomers(names, customerIDs, movieIDs, rentalCodes, rentalDays, lateFees);

		System.out.println();

		printOnTimeCustomers(names, customerIDs, movieIDs, rentalCodes, rentalDays, lateFees);

	}

}

