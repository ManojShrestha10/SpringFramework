package com.springcore.collection;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		
		collection collect = (collection) context.getBean("collection");
		 
		System.out.println(collect.getName());
		System.out.println(collect.getPhones());
		System.out.println(collect.getAddress());
		System.out.println(collect.getCourses());
		System.out.println(collect.getProps());
	}
}
