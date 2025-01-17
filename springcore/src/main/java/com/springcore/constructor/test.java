package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.collection;

public class test {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
		
		Person person = (Person) context.getBean("person");
		
		System.out.print(person);
		
		addition add = (addition) context.getBean("addition");
		
		add.doSum();

	}

}
