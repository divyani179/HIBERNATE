package com.component;

public class PersonAddress {

	String city;
	String state;
	int zipcode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "PersonAddress [city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
}
