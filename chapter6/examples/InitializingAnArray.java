
public class InitializingAnArray {

	public static void main(String[] args) {
		
		int[] array = new int[4];
		array[0] = 0; System.out.println("array[0] is " + array[0]);
		array[1] = 1; System.out.println("array[1] is " + array[1]);
		array[2] = 2; System.out.println("array[2] is " + array[2]);
		array[3] = 3; System.out.println("array[3] is " + array[3]);
		
		System.out.println();
		
		int[] array2 = {0, 1, 2, 3};
		System.out.println("array2[0] is " + array2[0]);
		System.out.println("array2[1] is " + array2[1]);
		System.out.println("array2[2] is " + array2[2]);
		System.out.println("array2[3] is " + array2[3]);
		
	}
	
}
