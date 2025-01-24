package com.springcore.pratice.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.*;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiringPratice.xml");
		
		Student student = (Student) context.getBean("stu");
		
		System.out.print(student);

	}

}
