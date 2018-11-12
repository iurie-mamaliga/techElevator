package com.techelevator;

import javax.swing.JOptionPane;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		
		final double TO_METERS_CONVERSION = 0.3048;		//constant for conversion from feet to meters
		final double TO_FEET_CONVERSION = 3.2808399;		//constant for conversion from meters to feet
		
		int enteredLength = 0;							//holds original length entered by the user
		int convertedLength = 0;							//holds the converted length
		String temp;										//temporary variable to gather input from user
		
		//getting the length as integer
		temp = JOptionPane.showInputDialog("Enter the length you want to convert, example: 454");
		enteredLength = Integer.parseInt(temp);
		//getting the flag variable to decide which conversion to perform
		temp = JOptionPane.showInputDialog("Enter 'm' if measurment you entered is in meters or enter 'f' if the mesurment you entered is in feet.");
		
		if(temp.equals("f") || temp.equals("F") || temp.equals("'f'") ||temp.equals("'F'")) {
			convertedLength = (int)(enteredLength * TO_METERS_CONVERSION);
			JOptionPane.showMessageDialog(null, enteredLength + " feet is " + convertedLength + " meters.");
		}
		else if(temp.equals("m") || temp.equals("M") || temp.equals("'m'") ||temp.equals("'M'")) {
			convertedLength = (int)(enteredLength * TO_FEET_CONVERSION);
			JOptionPane.showMessageDialog(null, enteredLength + " meters is " + convertedLength + " feet.");
		}	
		else
			JOptionPane.showMessageDialog(null,"You entered wrong values, try again");
	}

}
