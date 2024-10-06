package com.nt.entity;

public class Customer {
	private String name;
	private String Location;
	
	public Customer(String name, String location) {
		super();
		this.name = name;
		Location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", Location=" + Location + "]";
	}
	
  }
