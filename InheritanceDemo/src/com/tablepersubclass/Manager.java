package com.tablepersubclass;

public class Manager extends Employee{
int allowance;

public int getAllowance() {
	return allowance;
}

public void setAllowance(int allowance) {
	this.allowance = allowance;
}

@Override
public String toString() {
	return "Manager [allowance=" + allowance + ", Name=" + Name + ", city="
			+ city + ", salary=" + salary + ", id=" + id + "]";
}


}
