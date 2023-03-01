import java.util.Scanner;

public class Lottery {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter lottery points: ");
		int userInput = input.nextInt();

		if (userInput >= 300) {
    		System.out.print("\nYou won a free cup of Teh Tarik, a regular sized Doughnut, and a 12-oz Orange juice!");
		} 
		else if (userInput >= 200) {
    		System.out.print("\nYou won a free cup of teh tarik and a regular sized Doughnut!");
		} 
		else if (userInput >= 100) {
    		System.out.print("\nYou won a free cup of teh tarik!");
		}

	}
}