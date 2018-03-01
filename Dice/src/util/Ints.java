package util;

public class Ints {

	public static String getSuffix(int num) {

		if (num % 100 - num % 10 == 10)
			return "th";
		else {
			switch (num % 10) {
			case 1:
				return "st";
			case 2:
				return "nd";
			case 3:
				return "rd";
			default:
				return "th";
			}
		}

	}

	public static double average(int... numArray) {

		double total = 0;

		for (int i = 0; i < numArray.length; i++) {
			total += numArray[i];
		}

		return total / numArray.length;

	}

	public static boolean isPrime(int num) {

		if (num < 2)
			return false;

		if (num == 2)
			return true;

		for (int i = num - 1; i > 2; i++)
			if (num % i == 0)
				return false;

		return true;

	}

	
	
}
