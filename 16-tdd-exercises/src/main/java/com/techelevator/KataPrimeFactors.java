package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class KataPrimeFactors {

	public static void main(String[] args) {
	}

	public static List<Integer> factorize(int input) {

		List<Integer> factors = new ArrayList<Integer>();

		int factor = 2;

		while (factor <= input) {
			if (input % factor == 0) {
				factors.add(factor);
				input /= factor;
			} else {
				factor++;
			}
		}

		for (int i = 0; i < factors.size(); i++) {
			System.out.println("Factor number:" + (i + 1) + " is   " + factors.get(i));
		}
		return factors;
	}
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * package com.techelevator;
 * 
 * public class KataStringCalculator { public static void main(String[] args) {
 * add("1,2\n3@ht");
 * 
 * }
 * 
 * public static int add(String numbers) {
 * 
 * int sum = 0;
 * 
 * if (numbers.length() == 0 || numbers.equals(null)) { return 0; }
 * 
 * for (int i = 0; i < numbers.length(); i++) { Character currentCharacter =
 * numbers.charAt(i);
 * 
 * if (currentCharacter.isDigit(numbers.charAt(i))) { sum += (int)
 * currentCharacter.getNumericValue(currentCharacter); }
 * 
 * } System.out.println(sum); return sum; } }
 */
