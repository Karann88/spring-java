package com.karan.beans;

public class Student {
	private int rollno;
	private String name;
	private Address address;
	
	public void setRollno(int rollno) {
		System.out.println("Setter method rollno");
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		System.out.println("Setter method name");
		this.name = name;
	} 
	
	public void setAddress(Address address) {
		System.out.println("Setter method address");
		this.address = address;
	}
	
	public void display() {
		System.out.println("Roll no. : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
