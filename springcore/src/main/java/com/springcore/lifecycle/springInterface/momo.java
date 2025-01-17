package com.springcore.lifecycle.springInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class momo implements InitializingBean,DisposableBean {
	
	private double price;
	private String name;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public momo() {
		super();
		
	}
	@Override
	public String toString() {
		return "momo [price=" + price + ", name=" + name + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		//this method works as Init in spring interface
		System.out.println("IT is initializing");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Going to throw momo plate");
		
	}
}
