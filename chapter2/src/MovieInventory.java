import java.util.Scanner;

public class MovieInventory {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double lordCost, menaceCost, kidsCost, totalCost;
		int lordNumber, menaceNumber, kidsNumber, totalNumber; // Number of copies owned by store.
		
	 // Asking about the move "Lord of the Ringdings"
		System.out.print("How much is Lord?  "); // Asking for price
		lordCost = in.nextDouble();
		System.out.print("How many Lords does the store own?  "); // Asking for number of copies
		lordNumber = in.nextInt();
		
	 // Asking about the movie "Dennis the Dentist Menace"
		System.out.print("How much is Menace?  ");
		menaceCost = in.nextDouble();
		System.out.print("How many Menace does the store own?  ");
		menaceNumber = in.nextInt();
		
	 // Asking about the movie "Spy Kids Aged 52"
		System.out.print("How much is Kids?  ");
		kidsCost = in.nextDouble();
		System.out.print("How many Kids does the store own?  ");
		kidsNumber = in.nextInt();
		
		totalCost = lordCost*lordNumber + menaceCost*menaceNumber + kidsCost*kidsNumber;
		totalNumber = lordNumber + menaceNumber + kidsNumber;
		
	 // Prints a table of cost and quantity
		System.out.printf("%n%n%n\t\t%-29s %-13s %-10s %n %n", "Video Title", "Cost", "# in Stock");
		System.out.printf("\t\t%-29s $%-12.2f %-10d %n %n", "Lord of the Ringdings", lordCost, lordNumber);
		System.out.printf("\t\t%-29s $%-12.2f %-10d %n %n", "Dennis the Dentist Menace", menaceCost, menaceNumber);
		System.out.printf("\t\t%-29s $%-12.2f %-10d %n %n %n %n", "Spy Kids Aged 52", kidsCost, kidsNumber);
		System.out.printf("\t\tThe total value of all tapes is: $%.2f %n", totalCost);
		System.out.printf("\t\tThe average value is: $%.2f", totalCost/totalNumber);
		
		in.close();
		
	}
	
}
