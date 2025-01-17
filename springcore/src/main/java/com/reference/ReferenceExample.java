package com.reference;

public class ReferenceExample {
	private int x ;
	private b obj;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public b getObj() {
		return obj;
	}
	public void setObj(b obj) {
		this.obj = obj;
	}
	public ReferenceExample() {
		super();
	}
	@Override
	public String toString() {
		return "ReferenceExample [x=" + x + ", obj=" + obj + "]";
	}

	
}
