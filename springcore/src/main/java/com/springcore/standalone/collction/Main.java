package com.springcore.standalone.collction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.pratice.autowire.Student;

public class Main {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
		
		Example example = (Example) context.getBean("frn");
		System.out.println(example.getFriends());
		System.out.println(example.getFriends().getClass().getName());
		System.out.println(example.getFeeStructure());
		System.out.println(example.getPhoneNumber());
		System.out.println(example.getProps());
	}

}
