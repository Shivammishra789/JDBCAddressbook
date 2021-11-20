package com.jdbc;

public class PersonInformation {
	
	String first_name;
	String last_name;
	String address;
	String city;
	String state;
	int zip;
	long phoneNumber;
	String email;

	public PersonInformation() {
	}

	public PersonInformation(String first_name, String last_name, String address, String city, String state, int zip, long phoneNumber, String email) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		return "PersonInformation [ first_name=" + first_name + ", last_name=" + last_name + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}


}