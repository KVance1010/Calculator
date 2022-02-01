
import java.util.Scanner;
public class Main {                   
	 
	
	public static void main(String[] args) {
		try (Scanner scnr = new Scanner(System.in)) {
			int usersChoice = 1;
			int[] correctAnswers = new int[2];

			Menu mainMenu = new Menu();

			do {

				usersChoice = mainMenu.menuOptions();
				switch (usersChoice) {
				case 1:
					new Add(correctAnswers);
					break;
				case 2:
					new Subtract(correctAnswers);
					break;
				case 3:
					new Multiply(correctAnswers);
					break;
				case 4:
					new Divide(correctAnswers);
					break;
				case 5:
					break;
				default:
					while ((usersChoice != 1) && (usersChoice != 2) && (usersChoice != 3) && (usersChoice != 4)
							&& (usersChoice != 5)) {
						System.out.print("Please enter a valid option of 1-5:   ");
						usersChoice = scnr.nextInt();
					}
					break;

				}
			} while ((usersChoice == 1) || (usersChoice == 2) || (usersChoice == 3) || (usersChoice == 4));

			for (int i = 0; i < 5; ++i) {
				System.out.println();
			}
			System.out.println("You have chosen to leave the program.");
			if (correctAnswers[1] > 0) {
				System.out.println("You answered " + correctAnswers[0] + " correct out of " + correctAnswers[1] + ".");
				double percentage = (correctAnswers[0] / (correctAnswers[1] * 1.0)) * 100;
				System.out.print("Your percectage correct is ");
				System.out.printf("%.2f", percentage);
				System.out.println("%");
			}
		}
		System.out.println("Good Bye.");

	}

}
