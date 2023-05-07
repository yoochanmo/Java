package com.lec.ex07_inheritance;

public class ChildProduct<K, M, C> extends Product<K, M> {

	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
