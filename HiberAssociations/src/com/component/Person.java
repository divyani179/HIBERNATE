package com.component;

public class Person {
String name;
PersonAddress address;
long personid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public PersonAddress getAddress() {
	return address;
}
public void setAddress(PersonAddress address) {
	this.address = address;
}
public long getPersonid() {
	return personid;
}
public void setPersonid(long personid) {
	this.personid = personid;
}
@Override
public String toString() {
	return "Person [name=" + name + ", sddress=" + address + ", personid="
			+ personid + "]";
}

}
