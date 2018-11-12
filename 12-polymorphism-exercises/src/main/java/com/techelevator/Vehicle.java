package com.techelevator;

//this interface is used to group three different type of vehicles in one list
public interface Vehicle {

	void calculateToll(int distance); // calculates the toll based on distance traveled and type of vehicle

	String getTypeOfVehicle(); // gets the type of vehicle

	double getToll(); // gets amount of tall paid by each vehicle
}
