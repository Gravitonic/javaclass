package util;

public class Arrays {


	// printArray()

	public static void printArray(byte[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}
	
	public static void printArray(short[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}
	
	public static void printArray(int[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}
	
	public static void printArray(long[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}
	
	public static void printArray(float[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}

	public static void printArray(double[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}

	public static void printArray(char[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}

	public static void printArray(String[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");

	}


	// average()

	public static double average(byte[] array) {

		double sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum / array.length;

	}
	
	public static double average(short[] array) {

		double sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum / array.length;

	}
	
	public static double average(int[] array) {

		double sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum / array.length;

	}

	public static double average(long[] array) {

		double sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum / array.length;

	}

	public static double average(float[] array) {

		double sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum / array.length;

	}

	public static double average(double[] array) {

		double sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum / array.length;

	}


	// min()

	public static int min(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] < result || i == 0)
				result = array[i];
		return result;
	}

	public static int min(int[] array, int startIndex, int stopIndex) { // Search includes startIndex but not stopIndex
		int result = 0;
		for (int i = startIndex; i < stopIndex; i++)
			if (array[i] < result || i == startIndex)
				result = array[i];
		return result;
	}


	// exchangeSort()

	public static void exchangeSort(int[] array, int direction) {

		int temp;

		if (direction > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++){
					if (array[i] > array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++){
					if (array[i] < array[j]){
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}

	}

	public static void exchangeSort(double[] array, int direction) {

		double temp;

		if (direction > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++){
					if (array[i] > array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++){
					if (array[i] < array[j]){
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}

	}

	public static void exchangeSort(char[] array, int direction) {

		char temp;

		if (direction > 0) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++){
					if (array[i] > array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++){
					if (array[i] < array[j]){
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}

	}

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


	// bubbleSort()

	public static void bubbleSort(int[] array, int direction) {

		boolean swapped = true;
		int temp;

		if (direction > 0) {
			while (swapped) {
				swapped = false;
				for (int i = 0; i < array.length - 1; i++) {
					if (array[i] > array[i+1]) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
						swapped = true;
					} 
				}
			}
		} else {
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

	}

	public static void bubbleSort(double[] array, int direction) {

		boolean swapped = true;
		double temp;

		if (direction > 0) {
			while (swapped) {
				swapped = false;
				for (int i = 0; i < array.length - 1; i++) {
					if (array[i] > array[i+1]) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
						swapped = true;
					} 
				}
			}
		} else {
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

	}

	public static void bubbleSort(char[] array, int direction) {

		boolean swapped = true;
		char temp;

		if (direction > 0) {
			while (swapped) {
				swapped = false;
				for (int i = 0; i < array.length - 1; i++) {
					if (array[i] > array[i+1]) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
						swapped = true;
					} 
				}
			}
		} else {
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

	}

	public static void bubbleSort(String[] array, int direction) {

		boolean swapped = true;
		String temp;

		if (direction > 0) {
			while (swapped) {
				swapped = false;
				for (int i = 0; i < array.length - 1; i++) {
					if (array[i].compareTo(array[i+1]) > 0) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
						swapped = true;
					} 
				}
			}
		} else {
			while (swapped) {
				swapped = false;
				for (int i = 0; i < array.length - 1; i++) {
					if (array[i].compareTo(array[i+1]) < 0) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
						swapped = true;
					} 
				}
			}
		}

	}

}
