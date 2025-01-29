package com.springcore.stereotype.pratice1;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// @Component is used to create object of this class in the spring container

@Component
public class Class {
	@Value("Manoj")
	private String name;
	@Value("24")
	private int age;
	@Value("Kathmandu")
	private String city;
	@Value("Bagmati")
	private String state;
	@Value("Nepal")
	private String country;
	@Value("#{list}")
	private List<String> number;
	
	public List<String> getNumber() {
		return number;
	}
	public void setNumber(List<String> number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Class [name=" + name + ", age=" + age + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", number=" + number + "]";
	}
	
}
