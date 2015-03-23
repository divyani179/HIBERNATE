package com.onetoone;

public class Student {
String name,department;
Address Address;
int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Address getAddress() {
	return Address;
}
public void setAddress(Address address) {
	Address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Student [name=" + name + ", department=" + department
			+ ", Address=" + Address + ", id=" + id + "]";
}

}
