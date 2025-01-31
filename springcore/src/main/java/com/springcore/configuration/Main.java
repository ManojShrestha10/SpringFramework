package com.springcore.configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
		test t = context.getBean("gettest",test.class);
		System.out.println(t);
		t.School();
		t.Student();
		
	}

}
