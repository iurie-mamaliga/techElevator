package com.techelevator;

import java.util.Random;

public class Truck implements Vehicle {

	private String typeOfVehicle = "Truck";
	private double toll; // holds the tall paid by the truck
	// those are rates for different types of truck
	private final double FOUR_AXLES_TRUCK_RATE = 0.04;
	private final double SIX_AXLES_TRUCK_RATE = 0.045;
	private final double EIGHT_PLUS_AXLES_TRUCK_RATE = 0.048;
	// number of axles the truck has(randomly generated)
	private int numberOfAxles;

	// constructor that makes a new truck object and randomly dives it a 4, 6 or 8
	// axles
	public Truck() {
		Random random = new Random();
		int axles = random.nextInt(3) + 1;

		if (axles == 1) {
			numberOfAxles = 4;
		} else if (axles == 2) {
			numberOfAxles = 6;
		} else if (axles == 3) {
			numberOfAxles = 8;
		}
	}

	// calculates the tall amount based on how many axles the truck has
	@Override
	public void calculateToll(int distance) {
		if (numberOfAxles == 4) {
			toll = FOUR_AXLES_TRUCK_RATE * distance;
		} else if (numberOfAxles == 6) {
			toll = SIX_AXLES_TRUCK_RATE * distance;
		} else if (numberOfAxles == 8) {
			toll = EIGHT_PLUS_AXLES_TRUCK_RATE * distance;
		}
		// gets the type of truck we have (4, 6 or 8 axles)
	}

	@Override
	public String getTypeOfVehicle() {
		if (numberOfAxles == 4) {
			return this.typeOfVehicle + " (4 axles)";
		} else if (numberOfAxles == 6) {
			return this.typeOfVehicle + " (6 axles)";
		} else {
			return this.typeOfVehicle + " (8+ axles)";
		}
		// gets the toll paid by the truck
	}

	@Override
	public double getToll() {
		return this.toll;
	}

}