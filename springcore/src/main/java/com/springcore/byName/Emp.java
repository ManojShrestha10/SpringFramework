package com.springcore.byName;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Emp() {
		super();
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.print("This value is injected");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
