package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.collection;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student student = (Student) context.getBean("student");
    	Teacher teacher = (Teacher) context.getBean("teacher");
    	Teacher teacher1 = (Teacher) context.getBean("teacher1");
    	Student student1 = (Student) context.getBean("student1");
    	SomeClass someClass = (SomeClass) context.getBean("email");
    	
    	list listing = (list) context.getBean("listed");
    	System.out.println(student);
    	System.out.println(teacher);
    	System.out.println(teacher1);
    	System.out.println(student1);
    	System.out.println(someClass);
    	System.out.println(listing);
    	
    }
}
