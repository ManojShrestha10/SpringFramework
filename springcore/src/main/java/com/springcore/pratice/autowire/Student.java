package com.springcore.pratice.autowire;

public class Student {
	private Subject subject;

	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Subject subject) {
		super();
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Student [subject=" + subject + "]";
	}
}
