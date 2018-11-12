package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

		String searchedWord = getSearchedWordFromUser();
		boolean caseSensitive = getCaseSensitiveFromUser();
		File inputFile = getInputFileFromUser();

		try (Scanner fileScanner = new Scanner(inputFile)) {
			int counter = 0;
			while (fileScanner.hasNextLine()) {

				counter += 1;
				String line = fileScanner.nextLine();
				if (caseSensitive) {
					if (line.contains(searchedWord)) {
						System.out.println(counter + ") " + line);
					}
				}
				if (!caseSensitive) {
					if (line.toLowerCase().contains(searchedWord.toLowerCase())) {
						System.out.println(counter + ") " + line);
					}
				}
			}
		}
	}

	private static boolean getCaseSensitiveFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Will the search be case sensitive Y/N >>> ");
		String answer = userInput.nextLine();

		if (answer.length() == 0 || answer.equals(null)) {
			System.out.println("You didn't specify if the search will be case sensitive.");
			System.exit(1); // Ends the program
		}
		if (answer.equalsIgnoreCase("y")) {
			return true;
		} else if (answer.equalsIgnoreCase("n")) {
			return false;
		} else {
			System.out
					.println("You entered wrong values, press Y for case sensitive and N for case insensitive search.");
			System.exit(1); // Ends the program
		}
		return false;
	}

	private static String getSearchedWordFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the word you want to search >>> ");
		String searchedWord = userInput.nextLine();

		if (searchedWord.length() == 0 || searchedWord.equals(null)) {
			System.out.println("You didn't entered any word to search for.");
			System.exit(1); // Ends the program
		}
		return searchedWord;
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();

		File inputFile = new File(path);
		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path + " Such file does not exist");
			System.exit(1); // Ends the program
		} else if (inputFile.isFile() == false) {
			System.out.println(path + " This is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

}
