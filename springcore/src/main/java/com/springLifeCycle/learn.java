package com.springLifeCycle;

public class learn {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public learn() {
		super();
	
	}

	@Override
	public String toString() {
		return "learn [price=" + price + "]";
	}

	//Initializing method
	public void hey() {
		System.out.println("It is initializing");
	}
	
	//Destroying method
	public void bye() {
		System.out.println("It is destroying it is cleaning code");
	}

}
