package com.springcore.lifecycle.springInterface;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class annotaion {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public annotaion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "annotaion [subject=" + subject + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Starting");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending");
	}
	
	
}
