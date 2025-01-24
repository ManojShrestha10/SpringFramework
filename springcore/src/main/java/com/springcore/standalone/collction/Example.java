package com.springcore.standalone.collction;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Example {
	private List<String> friends;
	private Map<String, Integer> feeStructure;
	private Set<String> phoneNumber;
	private Properties props;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	

	public Set<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Example [friends=" + friends + ", feeStructure=" + feeStructure + ", phoneNumber=" + phoneNumber
				+ ", props=" + props + "]";
	}    
	
}
