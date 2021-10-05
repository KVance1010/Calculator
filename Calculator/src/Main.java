import java.util.Scanner;

public class Main {

	public static void addOption(int[] correctAnswers, Scanner scnr) {
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

	}

	public static void subtractOption(int[] correctAnswers, Scanner scnr) {
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
			System.out.print(numOne + " - " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne - numTwo;
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
			System.out.print(numOne + " - " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne - numTwo;
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
			System.out.print(numOne + " - " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne - numTwo;
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
			System.out.print("Please enter your first whole number to subtract:  ");
			numOne = scnr.nextInt();
			System.out.println();
			System.out.print("Please enter your second whole number to subtract:  ");
			numTwo = scnr.nextInt();
			System.out.println();
			System.out.println("Problem");
			System.out.print(numOne + " - " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne - numTwo;
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

	public static void multiplyOption(int[] correctAnswers, Scanner scnr) {
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
			System.out.print(numOne + " * " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne * numTwo;
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
			System.out.print(numOne + " * " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne * numTwo;
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
			System.out.print(numOne + " * " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne * numTwo;
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
			System.out.print("Please enter your first whole number to multiply:  ");
			numOne = scnr.nextInt();
			System.out.println();
			System.out.print("Please enter your second whole number to multiply:  ");
			numTwo = scnr.nextInt();
			System.out.println();
			System.out.println("Problem");
			System.out.print(numOne + " x " + numTwo + "=   ");
			int userAmount = scnr.nextInt();
			int correctAmount = numOne * numTwo;
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

	public static void divideOption(int[] correctAnswers, Scanner scnr) { // FIXME "NEED TO ADD DIVID BY
																			// ZERO"
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

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int usersChoice = 1;
		int[] correctAnswers = new int[2];

		Menu mainMenu = new Menu();

		do {

			usersChoice = mainMenu.menuOptions();
			switch (usersChoice) {
			case 1:
				addOption(correctAnswers, scnr);
				break;
			case 2:
				subtractOption(correctAnswers, scnr);
				break;
			case 3:
				multiplyOption(correctAnswers, scnr);
				break;
			case 4:
				divideOption(correctAnswers, scnr);
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
		System.out.println("Good Bye.");

	}

}
