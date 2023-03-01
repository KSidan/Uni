import java.util.Scanner;

public class PointsSwitch {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Points: ");
		int userInput = input.nextInt();

		switch (userInput / 10) {
		case 5:
			System.out.print("\nSatisfactory");
			break;
		case 6:
			System.out.print("\nFairly Good");
			break;
		case 7:
			System.out.print("\nGood");
			break;
		case 8:
			System.out.print("\nVery Good");
			break;
		case 9:
			System.out.print("\nExcellent");
		default:
			System.out.print("\n Please enter a value between 50 and 100.");
		}
	}
}
