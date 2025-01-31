package com.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {
	@Bean
	public Player getPlayer() {
		return new Player();
	}
	@Bean
	public test gettest() {
		test t = new test(getPlayer());
		return t;
		
	}

}
