package com.tablepersubclass;

public class Director extends Employee {
String benefits;

public String getBenefits() {
	return benefits;
}

public void setBenefits(String benefits) {
	this.benefits = benefits;
}

@Override
public String toString() {
	return "Director [benefits=" + benefits + ", Name=" + Name + ", city="
			+ city + ", salary=" + salary + ", id=" + id + "]";
}



}
