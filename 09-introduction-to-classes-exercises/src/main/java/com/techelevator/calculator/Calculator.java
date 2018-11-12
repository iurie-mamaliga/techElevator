package com.techelevator.calculator;

public class Calculator {

	private int currentValue;
	
	public Calculator(){

	}
	
	public int add(int addend) {
		//currentValue = 0;
		;;currentValue = currentValue + addend;
		return this.currentValue;
	}
	
	public int multiply(int multiplier) {
		currentValue = currentValue * multiplier;
		return this.currentValue;
	}
	
	public int subtract(int subtrahend) {
		currentValue = currentValue - subtrahend;
		return currentValue;
	}
	
	public int power(int exponent) {
		int temp = currentValue;
		for(int i = 1; i < exponent; i++) {
			currentValue *= temp;
		}	
		return currentValue;
	}
	
	public void reset() {
		currentValue = 0;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
	
	
}
	/*- `add(int addend)` returns the new `currentValue` after performing the addition.
	- `multiply(int multiplier)` returns the new `currentValue` after performing the multiplication.
	- `subtract(int subtrahend)` returns the new `currentValue` after performing the subtraction.
	- `power(int exponent)` returns the new `currentValue` after raising the `currentValue` by the exponent.
	- `void reset()` resets the `currentValue` to 0.
}*/
