package com.springcore.configuration.Pratice;

public class School {
	private String name;
	
	public School(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void schoolInfo() {
		System.out.println("This is school information");
	}

	public void schoolName() {
		System.out.println("This is school name");
	}

}
