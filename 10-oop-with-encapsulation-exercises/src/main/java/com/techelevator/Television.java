package com.techelevator;

public class Television {

	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	public void turnOff() {
		this.isOn = false;	
	}
	
	public void turnOn() {
		this.isOn = true;
		this.currentChannel = 3;
		this.currentVolume = 2;
	}
	
	public void changeChannel(int newChannel) {
		if(this.isOn && newChannel >= 3 && newChannel <= 18) {
		this.currentChannel = newChannel;
		}
	}
	
	public void channelUp() {
		if(this.isOn && this.currentChannel < 18) {
			this.currentChannel = this.currentChannel + 1;
		}
		if(this.isOn && this.currentChannel == 18) {
			this.currentChannel = 3;
		}
	}
	
	public void channelDown() {
		if(this.isOn && this.currentChannel > 3) {
			this.currentChannel = this.currentChannel - 1;
		}
		if(this.isOn && this.currentChannel == 3) {
			this.currentChannel = 18;
		}
	
	}
	
	public void raiseVolume() {
		if(this.isOn && this.currentVolume < 10) {
			this.currentVolume++;
		}
		if(this.isOn && this.currentVolume == 10) {
			this.currentVolume = 10;
		}
	}
	
	public void lowerVolume() {
		if(this.isOn && this.currentVolume > 0) {
			this.currentVolume--;
		}
		if(this.isOn && this.currentVolume == 0) {
			this.currentVolume = 0;
		}
	}
	
	public boolean isOn() {
		return this.isOn;
	}
	
	public int getCurrentChannel() {
		return this.currentChannel;
	}
	
	public int getCurrentVolume() {
		return this.currentVolume;
	}
}