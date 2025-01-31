package com.springcore.configuration.Pratice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration	// This annotation is used to tell the spring container that this is a configuration class
public class SchoolConfig {

	// This method is used to create a bean
	// This method name is the name of the bean
	// This method returns the object that should be registered as a bean
	@Bean
	public School school() {
		return new School("DPS");  
	}

}
