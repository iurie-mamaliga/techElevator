package com.techelevator;

import java.text.DecimalFormat;

import javax.swing.JLabel;

public class SPU implements DeliveryDriver {
	// rates for delivery based on the time
	final double FOUR_DAY_DELIVERY_RATE = 0.0050;
	final double TWO_DAY_DELIVERY_RATE = 0.050;
	final double NEXT_DAY_DELIVERY_RATE = 0.075;
	final double OUNCES_IN_ONE_POUND = 16.0;

	String ouncesOrPounds; // flag that indicates if the weight is in pounds or ounces

	DecimalFormat formatter = new DecimalFormat("#,##0.00"); // to format currency and display it to the user

	// constructor
	public SPU(String ouncesOrPounds) {
		this.ouncesOrPounds = ouncesOrPounds;
	}

	// calculates and displays the delivery cost based on weight and distance
	@Override
	public void calculateRate(int distance, int weight) {
		if (ouncesOrPounds.equals("P") || ouncesOrPounds.equals("p")) {
			System.out.printf("%-30s %-1s %-1s   \n", "SPU (4-day ground)", "$",
					formatter.format(weight * FOUR_DAY_DELIVERY_RATE * distance));
			System.out.printf("%-30s %-1s %-1s   \n", "SPU (2-day business)", "$",
					formatter.format(weight * TWO_DAY_DELIVERY_RATE * distance));
			System.out.printf("%-30s %-1s %-1s   \n", "SPU (next-day)", "$",
					formatter.format(weight * NEXT_DAY_DELIVERY_RATE * distance));
		} else {
			System.out.printf("%-30s %-1s %-1s   \n", "SPU (4-day ground)", "$",
					formatter.format(((weight / OUNCES_IN_ONE_POUND) * FOUR_DAY_DELIVERY_RATE) * distance));
			System.out.printf("%-30s %-1s %-1s   \n", "SPU (2-day business)", "$",
					formatter.format(((weight / OUNCES_IN_ONE_POUND) * TWO_DAY_DELIVERY_RATE) * distance));
			System.out.printf("%-30s %-1s %-1s   \n", "SPU (next-day)", "$",
					formatter.format(((weight / OUNCES_IN_ONE_POUND) * NEXT_DAY_DELIVERY_RATE) * distance));
		}
	}
}
