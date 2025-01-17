package com.springcore;

public class Teacher {
	private int teacherId;
	private String teacherName;
	private String teacherAddress;
	
	public Teacher(int teacherId, String teacherName, String teacherAddress) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherAddress = teacherAddress;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherAddress=" + teacherAddress
				+ "]";
	}
}
