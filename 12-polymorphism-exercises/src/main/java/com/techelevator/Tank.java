package com.techelevator;

public class Tank implements Vehicle {

	private String typeOfVehicle = "Tank"; // holds the vehicle type of tank
	private final double TOLL_RATE = 0; // toll rate for the tank
	private double toll; // holds the toll amount for tank(for the future if tolls change from 0)

	// default constructor
	public Tank() {

	}

	// calculates the toll for the tank
	@Override
	public void calculateToll(int distance) {
		toll = TOLL_RATE;
	}

	// gets the type of the vehicle represented by this object
	@Override
	public String getTypeOfVehicle() {
		return this.typeOfVehicle;
	}

	// gets the toll paid by tank object
	@Override
	public double getToll() {
		return this.toll;
	}

}
