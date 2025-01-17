package com.springcore;

import java.util.Map;

public class SomeClass {
	private Map<String, Float> accounts;

	public Map<String, Float> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, Float> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "SomeClass [accounts=" + accounts + "]";
	}
	
}
