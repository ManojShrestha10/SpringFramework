package com.springcore.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiringByName.xml");
		
		Emp emp = (Emp) context.getBean("auto");
		
		System.out.println(emp);

	}
}
