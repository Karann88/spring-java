package com.karan.beans;

public class Address {
	private int houseno;
	private String city;
	private int pincode;
	
	public void setHouseno(int houseno) {
		System.out.println("Setter method houseno");
		this.houseno = houseno;
	}
	public void setCity(String city) {
		System.out.println("Setter method city");
		this.city = city;
	}
	public void setPincode(int pincode) {
		System.out.println("Setter method pincode");
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		
		return "#"+ houseno + ","+ city+" - "+ pincode;
	}
}
