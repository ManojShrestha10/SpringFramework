package com.springcore;

import java.util.List;

public class list {
	private List<String> nameList;

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	@Override
	public String toString() {
		return "list [nameList=" + nameList + "]";
	}



}
