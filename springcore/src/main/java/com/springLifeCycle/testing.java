package com.springLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.*;

public class testing {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		learn learn2 = (learn) context.getBean("l1");

		System.out.println(learn2);
		//registering shutdown hook
		context.registerShutdownHook();
	}

}
