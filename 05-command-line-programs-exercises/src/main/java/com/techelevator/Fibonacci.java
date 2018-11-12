package com.techelevator;

import javax.swing.JOptionPane;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		String temp = "";   //temporary holds the ending number of the series as string that we are getting from the user
		
		int tempNumber = 0;   	//temporary holds the value when we switch it between 3 numbers
		int firstNumber = 0;		//first number in the sequence that we use to add to second number to find the third number 
		int secondNumber = 1;	//second number in the sequence that we use to add to first number to find the third number
		int thirdNumber = 1;		//current number in the sequence that we are printing in the console
		
		int finalNumber = 0;		//number at which we will stop the sequence
		
		//getting the final number in sequence from the user
		temp = JOptionPane.showInputDialog("Enter a whole positive number that will be the last number of Fibonacci sequence. Example: 45");
		finalNumber = Integer.parseInt(temp);
		
		//using a while loop to check that we didn't reach the final number in the sequence
		while(finalNumber > thirdNumber) {
			//this if statement is executed only once to print the first 2 number in the sequence
			if(thirdNumber == 1) {
				System.out.print(firstNumber + " " + secondNumber + " ");
				firstNumber++;
			}
			//keep printing the current number in the sequence and adding the previous 2 numbers together after, as long as the final number is the sequence is not reached
			System.out.print(thirdNumber + " ");
			thirdNumber = firstNumber + secondNumber;
			tempNumber = secondNumber;
			secondNumber = thirdNumber;
			firstNumber = tempNumber;
		}		
	}

}
