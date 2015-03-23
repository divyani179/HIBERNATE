package com.tableperconcrete;

public class ElectronicItem extends Item{
String features;
String model;
public String getFeatures() {
	return features;
}
public void setFeatures(String features) {
	this.features = features;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
@Override
public String toString() {
	return "ElectronicItem [features=" + features + ", model=" + model
			+ ", name=" + name + ", id=" + id + ", cost=" + cost + "]";
}

}
