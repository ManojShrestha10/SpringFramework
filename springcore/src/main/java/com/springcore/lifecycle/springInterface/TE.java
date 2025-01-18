package com.springcore.lifecycle.springInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TE {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("instance.xml");
//		
//		//registering shutdown hook
		context.registerShutdownHook(); 
//		
		momo m1 = (momo) context.getBean("momo");
		
		System.out.println(m1);
		
		annotaion a11 = (annotaion) context.getBean("a1");
		
		System.out.println(a11);
	}
}
