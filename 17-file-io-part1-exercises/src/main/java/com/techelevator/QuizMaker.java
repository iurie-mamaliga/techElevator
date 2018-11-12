package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) throws FileNotFoundException {

		int numberOfCorectAnswers = 0;
		int totalAnswers = 0;
		int correctAnswer = 0;
		int userAnswer;

		File inputFile = getFileFromUser();
		try (Scanner sc = new Scanner(inputFile)) {
			while (sc.hasNextLine()) {
				String[] questions;
				String line = sc.nextLine();

				questions = line.split("[|]");

				for (int i = 0; i < questions.length; i++) {
					if (questions[i].contains("*")) {
						questions[i] = questions[i].replace("*", "");
						correctAnswer = i + 1;
					}
					if (i != 0) {
						System.out.println("     " + i + ". " + questions[i]);
					} else {
						System.out.println("\n" + questions[i] + " ");
					}

					if (i == 4) {
						userAnswer = getAnswerFromUser();
						if (userAnswer == correctAnswer) {
							System.out.println("\nYour answer: " + userAnswer);
							System.out.println("Correct!");
							numberOfCorectAnswers += 1;
							totalAnswers += 1;
						} else {
							System.out.println("\nYour answer: " + userAnswer);
							System.out.println("Sorry that isn't Correct!");
							totalAnswers += 1;
						}
					}
				}
			}
			// print the final quiz result to the user
			System.out.println("\nYou got " + numberOfCorectAnswers + " answer(s) correct out of the total "
					+ totalAnswers + " questions asked.");
		}
	}

	// get the answer to the question from the user
	private static int getAnswerFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("\nPlease enter the answer 1, 2, 3 or 4 >>> ");
		int input = userInput.nextInt();

		if (input < 1 || input > 4) {
			System.out.println("\nWrong value entered, accepted values are: 1 2 3 4");
			System.exit(1); // Ends the program
		}
		return input + 1;
	}

	// get the file directory/name from the user
	private static File getFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		File inputFile = new File(path);

		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path + " directory does not exist");
			System.exit(1); // Ends the program

		} else if (inputFile.isFile() == false) {
			System.out.println(path + " is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}
}
