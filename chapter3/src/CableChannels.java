/*
 * Programmer: Dylan Yang
 * Date: September 26 2017
 * Purpose: To prompt the user for their favorite cable channel.
 */

import java.util.Scanner;

public class CableChannels {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int channel;

		System.out.println("In this town, there are 5 non-cable TV channels.\nWhich non-cable channel is your favorite (2, 4, 6, 8, 11)?");
		channel = in.nextInt();

		switch (channel) {
		case 2:
			System.out.println("Channel 2 got top ratings last week!");
			break;
		case 4:
			System.out.println("Channel 4 shows primarily news!");
			break;
		case 6:
			System.out.println("Channel 6 shows old movies!");
			break;
		case 8:
			System.out.println("Channel 8 covers local events!");
			break;
		case 11:
			System.out.println("Channel 11 is public broadcasting!");
			break;
		default:
			System.out.println("That channel does not exist. It must be a cable channel.");
			break;
		}
		
		in.close();
		
	}
}

/*

ORIGINAL PROGRAM

import java.util.Scanner;

public class CableChannels {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int channel;
		
		System.out.println("In this town, there are 5 non-cable TV channels.\nWhich non-cable channel is your favorite (2, 4, 6, 8, 11)?");
		channel = in.nextInt();
		
		if (channel == 2)
			System.out.println("Channel 2 got top ratings last week!");
		else if (channel == 4)
			System.out.println("Channel 4 shows primarily news!");
		else if (channel == 6)
			System.out.println("Channel 6 shows old movies!");
		else if (channel == 8)
			System.out.println("Channel 8 covers local events!");
		else if (channel == 11)
			System.out.println("Channel 11 is public broadcasting!");
		else
			System.out.println("That channel does not exist. It must be a cable channel.");
		
		in.close();
		
	}
}

*/


