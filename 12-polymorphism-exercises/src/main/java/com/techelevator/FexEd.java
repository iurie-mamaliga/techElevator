package com.techelevator;

import java.text.DecimalFormat;
public class FexEd implements DeliveryDriver {

	final double FLAT_RATE = 20.00;		//flat rate to deliver a package
	final double OVER_500_MILES_RATE = 5.00;		//add on to the flat rate if the distance is over 500 miles
	final double OVER_48_OUNCES_RATE = 3.00;		//add on to the flat rate if the weight is over 48 ounce
	final int MAX_MILES_FOR_FLAT_RATE = 500;		//amount of mile we deliver at flat rate
	final int MAX_OUNCES_FOR_FLAT_RATE = 48;		//amount of ounces we deliver at flat rate
	final int OUNCES_IN_ONE_POUND = 16;
	
	DecimalFormat formatter = new DecimalFormat("#,##0.00"); // to format currency and display it to the user
	
	String ouncesOrPounds;	//flag to indicate that weight is in ounces or pounds
	int weight;
	
	//creating a object and indicating that it will hold the weight in ounces or pounds
	public FexEd(String ouncesOrPounds) {
		this.ouncesOrPounds = ouncesOrPounds.toLowerCase();
	}
	
	//sets the weight of the package in ounces
	public void setWeight(int weight) {
		if(ouncesOrPounds.equals("p")) {
			this.weight = weight * OUNCES_IN_ONE_POUND;
		}else {
			this.weight = weight;
		}		
	}
	
	//calculates and displays the rate based on the distance and the weight of the package
	@Override
	public void calculateRate(int distance, int weight) {
	
		setWeight(weight);
		
		if(distance <= MAX_MILES_FOR_FLAT_RATE && this.weight <= MAX_OUNCES_FOR_FLAT_RATE) {	
			System.out.printf("%-30s %-1s %-1s   \n", "FexEd", "$",(formatter.format(FLAT_RATE)));	
		}else if(distance > MAX_MILES_FOR_FLAT_RATE && this.weight <= MAX_OUNCES_FOR_FLAT_RATE) {
			System.out.printf("%-30s %-1s %-1s   \n", "FexEd", "$",(formatter.format(FLAT_RATE + OVER_500_MILES_RATE)));
		}else if(distance <= MAX_MILES_FOR_FLAT_RATE && this.weight > MAX_OUNCES_FOR_FLAT_RATE) {
			System.out.printf("%-30s %-1s %-1s   \n", "FexEd", "$",(formatter.format(FLAT_RATE + OVER_48_OUNCES_RATE)));
		}else if(distance > MAX_MILES_FOR_FLAT_RATE && this.weight > MAX_OUNCES_FOR_FLAT_RATE) {
			System.out.printf("%-30s %-1s %-1s   \n", "FexEd", "$",(formatter.format(FLAT_RATE + OVER_48_OUNCES_RATE + OVER_500_MILES_RATE)));
		}		
	}
}
