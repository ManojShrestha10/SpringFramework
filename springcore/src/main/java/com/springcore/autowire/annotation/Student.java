package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("subject1")
	private Subject subject;

	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		System.out.print("inside setter");	
		this.subject = subject;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Subject subject) {
		super();
		this.subject = subject;
		System.out.println("Inside constructor");
	}
	
	@Override
	public String toString() {
		return "Student [subject=" + subject + "]";
	}
}
