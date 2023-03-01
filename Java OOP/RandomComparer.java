import java.util.Random;
import java.util.Scanner;

public class RandomComparer {
	public static void main (String[] args) {
		Random rng = new Random();
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a value: ");
		int userInput = input.nextInt();

		int challenger = rng.nextInt(101);
		System.out.print("\nValue: " + userInput);
		System.out.print("\nRNG Generated :" + challenger);

		if (userInput < challenger) {
			System.out.print("\nYour value is smaller than the RNG.");
		}
		else if (userInput > challenger) {
			System.out.print("\nYour value is larger than RNG.");
		}
		else {
			System.out.print("\nBingo!");
		}
	}
}