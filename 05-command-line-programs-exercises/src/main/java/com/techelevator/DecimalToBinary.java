package com.techelevator;

import javax.swing.JOptionPane;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {

		String temporaryVar;		//temporary string to get the input numbers from user
		
		//getting input from user using Option Pane
		temporaryVar = JOptionPane.showInputDialog("Please enter in a series of decimal values (separated by spaces, up to 100 numbers) Exmple: 460 8218 1 31313 987654321");
		//Spliting the string in substrings and saving them in a array
		String[] allDecimalNumbersAsString = temporaryVar.split(" ", 100);
		
		//scrolling thru the array and displaying the original decimal numberer and then the binary  number 
		for(int i = 0; i < allDecimalNumbersAsString.length; i++) 
			System.out.printf("%10s %-10s %-10s\n", allDecimalNumbersAsString[i], " in binary is ", Integer.toBinaryString(Integer.parseInt(allDecimalNumbersAsString[i] )));

	}
}