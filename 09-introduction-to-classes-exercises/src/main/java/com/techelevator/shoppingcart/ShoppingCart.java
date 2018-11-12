package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;

	public ShoppingCart() {

	}

	public int getTotalNumberOfItems() {
		return this.totalNumberOfItems;
	}

	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}

	public double getTotalAmountOwed() {
		return this.totalAmountOwed;
	}

	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}

	public double getAveragePricePerItem() {
		if (this.totalNumberOfItems == 0) {
			return 0.0;
		} else {
			return (this.totalAmountOwed / this.totalNumberOfItems);
		}
	}

	public void addItems(int numberOfItems, double pricePerItem) {
		this.totalNumberOfItems += numberOfItems;
		this.totalAmountOwed += (pricePerItem * numberOfItems);
	}

	public void empty() {
		this.totalNumberOfItems = 0;
		this.totalAmountOwed = 0.0;
	}

}
