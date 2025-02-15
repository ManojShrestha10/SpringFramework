package com.springcore.constructor;

import java.util.List;

import com.springcore.collection.Certificate;

public class Person {
	private String name;
	private int personId;
	private Certificate certificate;
	private List<String> list;
	public Person(String name, int personId, Certificate certificate, List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.certificate = certificate;
		this.list = list;
		
	}
	@Override
	public String toString() {
		return this.name + " : " + this.personId + " : " + this.certificate + " :" + this.list;
	}
	

}
