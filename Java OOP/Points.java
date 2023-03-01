import java.util.Scanner;

public class Points {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Points: ");
		int userInput = input.nextInt();

		if (userInput >= 50 && userInput <= 59) {
			System.out.print("\nSatisfactory.");
		}
		else if (userInput >= 60 && userInput <= 69) {
			System.out.print("\nFairly good");
		}
		else if (userInput >= 70 && userInput <= 79) {
			System.out.print("\nGood");
		}
		else if (userInput >= 80 && userInput <= 89) {
			System.out.print("\nVery good");
		}
		else if (userInput >= 90 && userInput <= 100)
			System.out.print("\nExcellent");
	}
}