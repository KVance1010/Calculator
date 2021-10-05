import java.util.Scanner;
public class DifficultyMenu {
	private int usersChoice;
	Scanner scnr = new Scanner(System.in);
	
	public int difficultyLevel() {
		
		do {
			for (int i = 0; i < 5; ++i) {
				System.out.println();
			}

			System.out.println("Pick the dificulty level you would like");
			System.out.println("\t\t Options");
			System.out.println("1. Easy");
			System.out.println("2. Medium");
			System.out.println("3. Hard");
			System.out.println("4. Users own numbers");
			System.out.println("5. Return to the previous menu");
			System.out.print("Enter the number that corresponds with your choice:  ");
			usersChoice = scnr.nextInt();
			if ((usersChoice != 1) || (usersChoice != 2) || (usersChoice != 3) || (usersChoice != 4)
					|| (usersChoice != 5)) {
				System.out.println("Please enter an number that is 1-5");
			}
		} while ((usersChoice != 1) && (usersChoice != 2) && (usersChoice != 3) && (usersChoice != 4)
				&& (usersChoice != 5));

		return usersChoice;
	}

}
