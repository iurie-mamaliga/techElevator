package com.techelevator;

public class Elevator {

	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public Elevator(int totalNumberOffloors) {
		this.numberOfFloors = totalNumberOffloors;	
		this.currentFloor = 1;
	}
	
	public int getCurrentFloor() {
		return this.currentFloor;
	}
	
	public int getNumberOfFloors() {
		return this.numberOfFloors;
	}
	
	public boolean isDoorOpen() {
		return this.doorOpen;
	}
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if(desiredFloor <= this.numberOfFloors && desiredFloor > this.currentFloor && !this.doorOpen) {
			this.currentFloor = desiredFloor;
		}
	}
	
	public void goDown(int desiredFloor) {
		if(desiredFloor >= 1 && desiredFloor < currentFloor && !this.doorOpen) {
			this.currentFloor = desiredFloor;
		}
	}
}