package com.techelevator;

import javax.swing.JOptionPane;

public class DeliveryMainProgram {

	public static void main(String[] args) {

		int distance; // holds the distance the package will travel
		int weight; // holds the weight of the package
		String ouncesOrPounds; // flag to hold if the package is in ounces or pounds

		String input = ""; // temporary holds the input from the user

		// getting the weight of the package from the user
		input = JOptionPane.showInputDialog("Please enter the weight of the package?");
		weight = Integer.parseInt(input);

		// asking if the weight was in ounces or pounds
		input = JOptionPane.showInputDialog("(P)ounds or (O)unces?");
		ouncesOrPounds = input.toLowerCase();

		// getting the amount of miles the package will be traveling to
		input = JOptionPane.showInputDialog("What distance will it be traveling to?");
		distance = Integer.parseInt(input);

		// creating an array that holds 3 different delivery company
		DeliveryDriver[] deliveryOptions = new DeliveryDriver[] { new PostalService(ouncesOrPounds),
				new FexEd(ouncesOrPounds), new SPU(ouncesOrPounds) };

		System.out.println("Distance of delivery " + distance + " miles.");
		if (ouncesOrPounds.equals("p")) {
			System.out.println("Weight of the package " + weight + " pounds.");
		} else {
			System.out.println("Weight of the package " + weight + " ounces.");
		}
		System.out.printf("--------------------------------------\n\n");
		System.out.printf("%-30s %-20s   \n", "Delivery Method", "$ cost");
		System.out.printf("--------------------------------------\n");
		// calculating the rate for each company
		deliveryOptions[0].calculateRate(distance, weight);
		deliveryOptions[1].calculateRate(distance, weight);
		deliveryOptions[2].calculateRate(distance, weight);
	}
}
