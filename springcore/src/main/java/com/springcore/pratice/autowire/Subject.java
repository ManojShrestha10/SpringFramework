package com.springcore.pratice.autowire;

public class Subject {
	private String mathMarks;
	private double scienceMarks;
	
	public String getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(String mathMarks) {
		this.mathMarks = mathMarks;
	}
	public double getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(double scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public Subject() {
		super();
	}
	public Subject(String mathMarks, double scienceMarks) {
		super();
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
	}
	@Override
	public String toString() {
		return "Subject [mathMarks=" + mathMarks + ", scienceMarks=" + scienceMarks + "]";
	}
}
