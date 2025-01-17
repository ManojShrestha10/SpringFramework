package com.contructor.c.namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("c.xml");
		cExample cexample = (cExample) context.getBean("simple");
		System.out.println(cexample);

	}
}
