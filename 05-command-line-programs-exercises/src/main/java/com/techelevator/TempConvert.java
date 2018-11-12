package com.techelevator;

import javax.swing.JOptionPane;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		
		int enteredTemperature = 0;			//holds the original temperature entered by user
		int convertedTemperature = 0;			//holds the converted temperature 
		String temp;								//holds user input before is converted to a corresponding variable
		
		//getting input from user using Option Pane
		temp = JOptionPane.showInputDialog("Enter the temperature you wish to convert, example: 72");
		enteredTemperature = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("Enter 'c' if the temperature you entered is in Celsius or enter 'f' if the temperature you entered is in Farenheit");

		//converting the temperature depending if user entered celsius or fahrenheit
		if(temp.equals("c") || temp.equals("C") || temp.equals("'c'") ||temp.equals("'C'")) {
			convertedTemperature = (int)(enteredTemperature * 1.8 + 32);			
			JOptionPane.showMessageDialog(null, enteredTemperature + " degrees Celcius equals to " + convertedTemperature +" degrees Fahrenheit");
		}
		else if(temp.equals("f") || temp.equals("F") || temp.equals("'f'") ||temp.equals("'F'")) {
			convertedTemperature = (int)((enteredTemperature - 32) / 1.8);
			JOptionPane.showMessageDialog(null, enteredTemperature + " degrees Fahrenheit equals to " + convertedTemperature +" degrees Celsius");
		}
		else
			JOptionPane.showMessageDialog(null, "You entered wrong values try again.");		
	}
}
