
/*
 * Programmer: Dylan Yang
 * Date: November 27, 2017
 * Purpose: to decrypt a message
 */

public class DecryptMessage {

	public static void main(String[] args) {

		String[] message = {
				"Nexa2f5",
				"Z52Bizlm",
				"Diskapr",
				"emkem9sD",
				"LaWYr4Us",
				"dAStn78L",
				"mPTuriye",
				"aaeeiuUu",
				"IL8Ctmpn"
		};
		
		String result = "";
		
		for (int i = 0; i < message.length; i++) {
			if (i % 2 == 0)
				result = result + message[i].charAt(4);
			else
				result = result + message[i].substring(2,4);
		}
		
		System.out.println(result);

	}

}
