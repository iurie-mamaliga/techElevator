package com.techelevator;

import java.util.Random;

public class Car implements Vehicle {

	private String typeOfVehicle = "Car"; // holds the type of object
	private double toll; // holds the toll amount paid by Car object
	// hold the toll rate for cars with trailers and without
	private final double TOLL_RATE = 0.02;
	private final double TOLL_TRAILER_ADD_ON = 1.00;
	// flag to indicate if the car is pulling a trailer or not
	private boolean pullingTrailer;

	// constructor that randomly makes a car with trailer or without
	public Car() {
		Random random = new Random();
		pullingTrailer = random.nextBoolean();
	}

	// calculates toll based on if the car has a trailer or not
	@Override
	public void calculateToll(int distance) {
		if (!pullingTrailer) {
			this.toll = distance * TOLL_RATE;
		} else {
			this.toll = distance * TOLL_RATE + TOLL_TRAILER_ADD_ON;
		}
	}

	// gets the type of object and if it pullss a trailer or not
	@Override
	public String getTypeOfVehicle() {
		if (pullingTrailer) {
			return this.typeOfVehicle + " (with trailer)";
		} else
			return this.typeOfVehicle + " (no trailer)";
	}

	// gets the toll paid by the car object
	@Override
	public double getToll() {
		return this.toll;
	}
}
