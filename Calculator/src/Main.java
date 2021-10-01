import java.util.Scanner;
import java.util.Random;

public class Main {

	public static int difficultyLevel(Scanner scnr) {
		int usersChoice;
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

	public static void addOption(int[] correctAnswers, Scanner scnr, Random randG) {
		int numOne;
		int numTwo;
		int difficulty = difficultyLevel(scnr);
		if (difficulty == 1) {
			numOne = easyRandomNum(randG);
			numTwo = easyRandomNum(randG);
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
			numOne = medRandomNum(randG);
			numTwo = medRandomNum(randG);
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
			numOne = hardRandomNum(randG);
			numTwo = hardRandomNum(randG);

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

	public static void subtractOption(int[] correctAnswers, Scanner scnr, Random randG) {
		int numOne;
		int numTwo;
		int difficulty = difficultyLevel(scnr);
		if (difficulty == 1) {
			numOne = easyRandomNum(randG);
			numTwo = easyRandomNum(randG);
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
			numOne = medRandomNum(randG);
			numTwo = medRandomNum(randG);
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
			numOne = hardRandomNum(randG);
			numTwo = hardRandomNum(randG);

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

	public static void multiplyOption(int[] correctAnswers, Scanner scnr, Random randG) {
		int numOne;
		int numTwo;
		int difficulty = difficultyLevel(scnr);
		if (difficulty == 1) {
			numOne = easyRandomNum(randG);
			numTwo = easyRandomNum(randG);
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
			numOne = medRandomNum(randG);
			numTwo = medRandomNum(randG);
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
			numOne = hardRandomNum(randG);
			numTwo = hardRandomNum(randG);

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

	public static void divideOption(int[] correctAnswers, Scanner scnr, Random randG) { // FIXME "NEED TO ADD DIVID BY
																						// ZERO"
		int numOne;
		int numTwo;
		int userAmountD;
		int correctAmountD;

		int difficulty = difficultyLevel(scnr);
		if (difficulty == 1) {
			numOne = easyRandomNum(randG);
			numTwo = easyRandomNum(randG);
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
			numOne = medRandomNum(randG);
			numTwo = medRandomNum(randG);
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
			numOne = hardRandomNum(randG);
			numTwo = hardRandomNum(randG);

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

	public static int easyRandomNum(Random randG) {
		int easyint = randG.nextInt(10);
		return easyint;
	}

	public static int medRandomNum(Random randG) {
		int medint = randG.nextInt(100);
		return medint;
	}

	public static int hardRandomNum(Random randG) {
		int hardint = randG.nextInt(1000);
		randG.nextInt();
		return hardint;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int usersChoice = 1;
		int[] correctAnswers = new int[2];
		Random rand = new Random();

		do {
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

			switch (usersChoice) {
			case 1:
				addOption(correctAnswers, scnr, rand);
				break;
			case 2:
				subtractOption(correctAnswers, scnr, rand);
				break;
			case 3:
				multiplyOption(correctAnswers, scnr, rand);
				break;
			case 4:
				divideOption(correctAnswers, scnr, rand);
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
