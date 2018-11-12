package com.techelevator.dog;

public class Dog {

	private boolean sleeping = false;

	public boolean isSleeping() {
		return this.sleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}

	public Dog() {
	}

	public String makeSound() {
		if (this.sleeping) {
			return "Zzzzz...";
		} else {
			return "Woof!";
		}
	}

	public void sleep() {
		this.sleeping = true;
	}

	public void wakeUp() {
		this.sleeping = false;
	}
}
