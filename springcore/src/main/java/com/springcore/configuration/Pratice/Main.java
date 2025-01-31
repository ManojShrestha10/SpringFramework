package com.springcore.configuration.Pratice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(SchoolConfig.class);
		School school = context.getBean("school", School.class);
		school.schoolInfo();
		school.schoolName();
		System.out.println(school.getName());

	}

}
