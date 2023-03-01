import java.util.Scanner;

public class LotterySwitch {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter lottery points: ");
		int userInput = input.nextInt();

		switch (userInput / 100) {
		case 1:
			System.out.print("\nYou won a free cup of teh tarik!");
			break;
		case 2:
			System.out.print("\nYou won a free cup of teh tarik and a regular sized Doughnut!");
			break;
		case 3:
			System.out.print("\nYou won a free cup of Teh Tarik, a regular sized Doughnut, and a 12-oz Orange juice!"):
			break;
		default:
			System.out.print("Git gud scrub lmao.");
		}
	}
}