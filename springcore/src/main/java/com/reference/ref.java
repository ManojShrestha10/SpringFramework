package com.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class ref {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");
		ReferenceExample referenceExample = (ReferenceExample) context.getBean("ReferenceExample");
		System.out.println(referenceExample.getX());
		System.out.println(referenceExample.getObj().getY());
		System.out.println(referenceExample);
	}

}
