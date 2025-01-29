package com.springcore.stereotype.pratice1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stereoConfig.xml");
		/*
		 * Class class1 = context.getBean("class",Class.class);
		 * System.out.println(class1.hashCode()); Class class2 =
		 * context.getBean("class",Class.class); System.out.println(class2.hashCode());
		 */
		
		D d = context.getBean("d",D.class);
		System.out.println(d.hashCode());
		
		D d1 = context.getBean("d",D.class);
		System.out.println(d1.hashCode());
		
	}

}
