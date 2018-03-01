
/*
 * Programmer: Dylan Yang
 * Date: November 17, 2017
 * Purpose: to search an array of food items for an orange with a method
 */

public class FoodItems {
	
	public static void main(String[] args) {
		
		String[] foods = {"grape", "banana", "apple", "apricot", "cherry", "strawberry", "orange", "peach", "clementine", "pear"};
		final String KEY = "orange";
		
		if (countKeysInArray(foods, KEY) == 1)
			System.out.println("The word \"" + KEY + "\" appears one time.");
		else
			System.out.println("The word \"" + KEY + "\" appears " + countKeysInArray(foods, KEY) + " times.");
		
	}
	
	public static int countKeysInArray(String[] array, String key) {
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++)
			if (array[i].equalsIgnoreCase(key))
				count++;
		
		return count;
		
	}
	
}
