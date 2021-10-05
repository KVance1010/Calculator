import java.util.Scanner;

public class Menu {

	Scanner scnr = new Scanner(System.in);

	public int menuOptions() {

		int usersChoice;

		System.out.println("Welcome to the simple math Calulator");
		System.out.println("\t\tMenu");
		System.out.println("Please enter one of the menu options");
		System.out.println("\tEnter 1 for Addition");
		System.out.println("\tEnter 2 for Subtraction");
		System.out.println("\tEnter 3 for Muliplaction");
		System.out.println("\tEnter 4 for Division");
		System.out.println("\tEnter 5 to quit");
		System.out.print("Please enter here: ");
		usersChoice = scnr.nextInt();

		for (int i = 0; i < 5; ++i) {
			System.out.println();
		}

		return usersChoice;
	}
}
