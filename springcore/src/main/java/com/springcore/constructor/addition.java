package com.springcore.constructor;

public class addition {
	private int x;
	private int y;
	
	public addition(double x, double y){
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("Contructor: double, double");
	}
	
	public addition(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Contructor: int, int");
	}
	
	public addition(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("Constructor: String, String");
	}
	
	public void doSum() {
		System.out.println("the first parameter" + this.x);
		System.out.println("the second parameter" + this.y);
		System.out.println("The sum is:" + (this.x + this.y));
	}

}
