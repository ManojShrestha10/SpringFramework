package com.autowiringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.autowiring2;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring2.xml");
		
		Autowiring2 autoWiring2 = (Autowiring2) context.getBean("autowiring");
				
		autoWiring2.pratice();
		
		
	}

}
