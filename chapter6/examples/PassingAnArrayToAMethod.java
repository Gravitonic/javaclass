
public class PassingAnArrayToAMethod {

	public static void main(String[] args) {
		
		char[] arr = {'J', 'A', 'V', 'A'};
		
		System.out.println(getHighestAlphabetical(arr));
		
	}
	
	public static char getHighestAlphabetical(char[] arr) {
		char min = arr[0];
		
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		
		return min;
		
	}
	
}
