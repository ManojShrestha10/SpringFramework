package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.*;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiringAnnotation.xml");
		
		Student student = (Student) context.getBean("stu");
		
		System.out.print(student);

	}

}
