package com.tableperconcrete;

public class Item {
String name;
int id;
int cost;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Item [name=" + name + ", id=" + id + ", cost=" + cost + "]";
}

}
