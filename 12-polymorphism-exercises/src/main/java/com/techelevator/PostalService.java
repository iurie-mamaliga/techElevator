package com.techelevator;

import java.text.DecimalFormat;

public class PostalService implements DeliveryDriver{
	
	//constants that hold flat rates for different types of delivery
	final double FIRST_CLASS_0_2_OUNCE = 0.035;
	final double FIRST_CLASS_3_8_OUNCE = 0.040;
	final double FIRST_CLASS_9_15_OUNCE = 0.047;
	final double FIRST_CLASS_1_3_POUNDS = 0.195;
	final double FIRST_CLASS_4_8_POUNDS = 0.450;
	final double FIRST_CLASS_9_PLUS_POUNDS = 0.500;
	
	final double SECOND_CLASS_0_2_OUNCE = 0.0035;
	final double SECOND_CLASS_3_8_OUNCE = 0.0040;
	final double SECOND_CLASS_9_15_OUNCE = 0.0047;
	final double SECOND_CLASS_1_3_POUNDS = 0.0195;
	final double SECOND_CLASS_4_8_POUNDS = 0.0450;
	final double SECOND_CLASS_9_PLUS_POUNDS = 0.0500;
	
	final double THIRD_CLASS_0_2_OUNCE = 0.0020;
	final double THIRD_CLASS_3_8_OUNCE = 0.0022;
	final double THIRD_CLASS_9_15_OUNCE = 0.0024;
	final double THIRD_CLASS_1_3_POUNDS = 0.0150;
	final double THIRD_CLASS_4_8_POUNDS = 0.0160;
	final double THIRD_CLASS_9_PLUS_POUNDS = 0.0170;
	
	String ouncesOrPounds;		//flag to indicate if the weight is in ounces or pounds
	
	DecimalFormat formatter = new DecimalFormat("#,##0.00");	//to format currency and display it to the user
	
	//constructor that creates the object and indicates that weight is in ounces or pounds
	public PostalService(String ouncesOrPounds){
		this.ouncesOrPounds = ouncesOrPounds;
	}
	
	//calculates and displays the rate of delivery based on weight and distance
	@Override
	public void calculateRate(int distance, int weight) {
	
		//System.out.printf("%-30s %-1s %-1s   \n", "FexEd", "$",(formatter.format(FLAT_RATE)));	
		if((weight >=0 && weight <= 2) && (ouncesOrPounds.equals("O") || ouncesOrPounds.equalsIgnoreCase("o"))) {
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (1st Class)", "$",
					(formatter.format(FIRST_CLASS_0_2_OUNCE * distance)));	
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (2nd Class)", "$",(formatter.format(SECOND_CLASS_0_2_OUNCE * distance)));
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (3rd Class)", "$",(formatter.format(THIRD_CLASS_0_2_OUNCE * distance)));		
		}else if((weight >=3 && weight <= 8) && (ouncesOrPounds.equals("O") || ouncesOrPounds.equalsIgnoreCase("o"))) {
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (1st Class)", "$",(formatter.format(FIRST_CLASS_3_8_OUNCE * distance)));	
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (2nd Class)", "$",(formatter.format(SECOND_CLASS_3_8_OUNCE * distance)));
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (3rd Class)", "$",(formatter.format(THIRD_CLASS_3_8_OUNCE * distance)));	
		}else if((weight >=9 && weight <= 15) && (ouncesOrPounds.equals("O") || ouncesOrPounds.equalsIgnoreCase("o"))) {
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (1st Class)", "$",(formatter.format(FIRST_CLASS_9_15_OUNCE * distance)));	
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (2nd Class)", "$",(formatter.format(SECOND_CLASS_9_15_OUNCE * distance)));
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (3rd Class)", "$",(formatter.format(THIRD_CLASS_9_15_OUNCE * distance)));	
		}else if((weight >=0 && weight <= 3) && (ouncesOrPounds.equals("P") || ouncesOrPounds.equalsIgnoreCase("p"))) {
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (1st Class)", "$",(formatter.format(FIRST_CLASS_1_3_POUNDS * distance)));	
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (2nd Class)", "$",(formatter.format(SECOND_CLASS_1_3_POUNDS * distance)));
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (3rd Class)", "$",(formatter.format(THIRD_CLASS_1_3_POUNDS * distance)));	
		}else if((weight >=4 && weight <= 8) && (ouncesOrPounds.equals("P") || ouncesOrPounds.equalsIgnoreCase("p"))) {
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (1st Class)", "$",(formatter.format(FIRST_CLASS_4_8_POUNDS * distance)));	
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (2nd Class)", "$",(formatter.format(SECOND_CLASS_4_8_POUNDS * distance)));
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (3rd Class)", "$",(formatter.format(THIRD_CLASS_4_8_POUNDS * distance)));	
		}else if((weight >= 9) && (ouncesOrPounds.equals("P") || ouncesOrPounds.equalsIgnoreCase("p"))) {
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (1st Class)", "$",(formatter.format(FIRST_CLASS_9_PLUS_POUNDS * distance)));	
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (2nd Class)", "$",(formatter.format(SECOND_CLASS_9_PLUS_POUNDS * distance)));
			System.out.printf("%-30s %-1s %-1s   \n", "Postal Service (3rd Class)", "$",(formatter.format(THIRD_CLASS_9_PLUS_POUNDS * distance)));	
		}	
	}
}
