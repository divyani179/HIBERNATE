package com.onetoone;

public class Address {
String city;
String state;
int id;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Address [city=" + city + ", street=" + ", state=" + state
			+ ", id=" + id + "]";
}

}
