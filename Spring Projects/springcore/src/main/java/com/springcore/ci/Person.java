package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Address address;
	public Person(String name, int personId, Address address) {
		super();
		this.name = name;
		this.personId = personId;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", address=" + address + "]";
	}
	
	
	
}
