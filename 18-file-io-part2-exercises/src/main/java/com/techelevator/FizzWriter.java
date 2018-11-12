package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
  
		int number = 0;
		final int MAX_NUMBER = 300;

		PrintWriter outputFile = new PrintWriter("fizz_buzz.txt");

		for (int i = 1; i <= MAX_NUMBER; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				outputFile.println("FizzBuzz");
			} else if (i % 3 == 0) {
				outputFile.println("Fizz");
			} else if (i % 5 == 0) {
				outputFile.println("Buzz");
			} else {
				outputFile.println(i);
			}
		}
		outputFile.close();
	}
}
