package com.tablepersubclass;

public class Employee {
String Name;
String city;
int salary;
int id;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [Name=" + Name + ", city=" + city + ", salary=" + salary
			+ ", id=" + id + "]";
}

}
