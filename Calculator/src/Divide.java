
import java.util.Scanner;

public class Divide {
	Divide() {
	}

	Divide(int[] correctAnswers) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		int numOne;
		int numTwo;
		RandomNum rNum = new RandomNum();
		DifficultyMenu difficultyMenu = new DifficultyMenu();
		int difficulty = difficultyMenu.difficultyLevel();

		if (difficulty == 1) {
			numOne = rNum.easyRandomNum();
			numTwo = rNum.easyRandomNum();
			for (int i = 0; i < 3; ++i) {
				System.out.println();
			}
			System.out.println("Problem");
			System.out.print(numOne + " / " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne / numTwo;
			if (userAmount == correctAmount) {
				System.out.println();
				System.out.println("You are correct!");
				correctAnswers[0] = correctAnswers[0] + 1;
				correctAnswers[1] = correctAnswers[1] + 1;
				for (int i = 0; i < 3; ++i) {
					System.out.println();
				}
			} else {
				System.out.println();
				System.out.println("The correct answer is " + correctAmount);
				correctAnswers[1] = correctAnswers[1] + 1;

				for (int i = 0; i < 3; ++i) {
					System.out.println();
				}
			}
		}

		else if (difficulty == 2) {
			numOne = rNum.medRandomNum();
			numTwo = rNum.medRandomNum();
			for (int i = 0; i < 3; ++i) {
				System.out.println();
			}
			System.out.println("Problem");
			System.out.print(numOne + " / " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne / numTwo;
			if (userAmount == correctAmount) {
				System.out.println("You are correct!");
				correctAnswers[0] = correctAnswers[0] + 1;
				correctAnswers[1] = correctAnswers[1] + 1;

				for (int i = 0; i < 3; ++i) {
					System.out.println();
				}
			} else {
				System.out.println("The correct answer is " + correctAmount);
				correctAnswers[1] = correctAnswers[1] + 1;

				for (int i = 0; i < 3; ++i) {
					System.out.println();
				}
			}
		}

		else if (difficulty == 3) {
			numOne = rNum.hardRandomNum();
			numTwo = rNum.hardRandomNum();

			for (int i = 0; i < 3; ++i) {
				System.out.println();
			}

			System.out.println("Problem");
			System.out.print(numOne + " / " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne / numTwo;
			if (userAmount == correctAmount) {
				System.out.println("You are correct!");
				correctAnswers[0] = correctAnswers[0] + 1;
				correctAnswers[1] = correctAnswers[1] + 1;

				for (int i = 0; i < 3; ++i) {
					System.out.println();
				}
			} else {
				System.out.println("The correct answer is " + correctAmount);
				correctAnswers[1] = correctAnswers[1] + 1;

				for (int i = 0; i < 3; ++i) {
					System.out.println();
				}
			}
		}

		else if (difficulty == 4) {
			for (int i = 0; i < 3; ++i) {
				System.out.println();
			}
			System.out.print("Please enter your first whole number to divide:  ");
			numOne = scnr.nextInt();
			System.out.println();
			System.out.print("Please enter your second whole number to divide:  ");
			numTwo = scnr.nextInt();
			if (numTwo == 0) {
				while (numTwo == 0) {
					System.out.println("Can not divide by zero.");
					System.out.println("Please enter a number that is great than zero");
					numTwo = scnr.nextInt();
				}
			}
			System.out.println();
			System.out.println("Problem");
			System.out.print(numOne + " / " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne / numTwo;
			if (userAmount == correctAmount) {
				System.out.println("You are correct!");
				correctAnswers[0] = correctAnswers[0] + 1;
				correctAnswers[1] = correctAnswers[1] + 1;

				for (int i = 0; i < 3; ++i) {
					System.out.println();
				}
			} else {
				System.out.println("The correct answer is " + correctAmount);
				correctAnswers[1] = correctAnswers[1] + 1;

				for (int i = 0; i < 3; ++i) {
					System.out.println();
				}
			}
		}

	}
}
