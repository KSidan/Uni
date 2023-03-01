import java.util.Scanner;

public class CaseSwitch {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a case: ");

		int userInput = input.nextInt();
		switch (userInput) {
			case 1:
				System.out.print("Blue");
				break;
			case 2:
				System.out.print("\nGreen");
				break;
			case 3:
				System.out.print("\nRed");
				break;
			case 4:
				System.out.print("\nYellow");
				break;
			default:
				System.out.print("\nInvalid selection.");
		}
	}
}