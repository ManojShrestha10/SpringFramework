package com.sprincore.stereotype.pratice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
			try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("stereoConfig.xml")){
				Person person = (Person) context.getBean("person");
				
				System.out.println(person);
				
		}catch (Exception e) {
            System.out.println("exception occured");
	}
}
}
