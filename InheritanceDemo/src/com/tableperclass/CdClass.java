package com.tableperclass;

public class CdClass {
String title;
int id;
double cost;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "CdClass [title=" + title + ", id=" + id + ", cost=" + cost + "]";
}

}
