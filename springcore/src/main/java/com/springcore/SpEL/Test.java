package com.springcore.SpEL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpEL.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1);
		
		SpelExpressionParser sp = new SpelExpressionParser();
		System.out.println(sp.parseExpression("22+11").getValue());

	}

}
