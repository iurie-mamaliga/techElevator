package com.techelevator;

public class Airplane {

	private String planeNumber;
	private int totalFirstClassSeats;
	private int totalCoachSeats;
	private int bookedFirstClassSeats;
	private int bookedCoachSeats;
	private int availableFirstClassSeats;
	private int availableCoachSeats;

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		this.bookedCoachSeats = 0;
		this.bookedFirstClassSeats = 0;
		this.availableFirstClassSeats = totalFirstClassSeats - this.bookedFirstClassSeats;
		this.availableCoachSeats = totalCoachSeats - this.bookedCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if(forFirstClass && availableFirstClassSeats >= totalNumberOfSeats) {
			this.bookedFirstClassSeats = totalNumberOfSeats;
			this.availableFirstClassSeats -= bookedFirstClassSeats;
			return true;
		}else if(!forFirstClass && availableCoachSeats >= totalNumberOfSeats) {
			this.bookedCoachSeats = totalNumberOfSeats;
			this.availableCoachSeats -= bookedCoachSeats;
			return true;
		}else {
			return false;
		}
	}
	
	public String getPlaneNumber() {
		return this.getPlaneNumber();
	}
	
	public int getBookedFirstClassSeats() {
		return this.bookedFirstClassSeats;
	}
	
	public int getAvailableFirstClassSeats() {
		return this.availableFirstClassSeats;
	}
	
	public int getTotalFirstClassSeats() {
		return this.totalFirstClassSeats;
	}
	
	public int getBookedCoachSeats() {
		return this.bookedCoachSeats;
	}
	
	public int getAvailableCoachSeats() {
		return this.availableCoachSeats;
	}
	
	public int getTotalCoachSeats() {
		return this.totalCoachSeats;
	}
}

