package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) throws FileNotFoundException {

		// this argument is "alices_adventures_in_wonderland.txt" by default (I included
		// in the source folder)
		String fileName = args[0];
		// this argument is 1000 by default, so each new file will have 1000 lines
		int linesInEachNewFile = Integer.parseInt(args[1]);

		// creating an variable for input file
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);

		// creating a post-fix that will be appended to the new files
		int outputFilePostfix = 0; 

		while (inputFile.hasNextLine()) {

			// each time we iterate thru the loop we create a new post-fix
			outputFilePostfix = outputFilePostfix + 1;
			PrintWriter outputFile = new PrintWriter(
					fileName.replaceAll(".txt", "") + "-" + outputFilePostfix + ".txt");

			// this loop iterates for the amount of lines we have in each file
			for (int i = 0; i < linesInEachNewFile; i++) {
				String line;
				if (inputFile.hasNextLine()) {
					line = inputFile.nextLine();
					outputFile.println(line);
				}
			}
			outputFile.close();
		}
		System.out.println("All done!");
	}
}
