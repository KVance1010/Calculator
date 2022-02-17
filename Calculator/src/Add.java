
import java.util.Scanner;

public class Add {
	Add() {
	}

	Add(int[] correctAnswers) {
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
			System.out.print(numOne + " + " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne + numTwo;
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
			System.out.print(numOne + " + " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne + numTwo;
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
			System.out.print(numOne + " + " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne + numTwo;
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
			System.out.print("Please enter your first whole number to add:  ");
			numOne = scnr.nextInt();
			System.out.println();
			System.out.print("Please enter your second whole number to add:  ");
			numTwo = scnr.nextInt();
			System.out.println();
			System.out.println("Problem");
			System.out.print(numOne + " + " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne + numTwo;
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
		//scnr.close();
	}
}
