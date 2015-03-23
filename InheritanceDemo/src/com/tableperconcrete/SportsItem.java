package com.tableperconcrete;

public class SportsItem extends Item {
String sportstype;

public String getSportstype() {
	return sportstype;
}

public void setSportstype(String sportstype) {
	this.sportstype = sportstype;
}

@Override
public String toString() {
	return "SportsItem [sportstype=" + sportstype + ", name=" + name + ", id="
			+ id + ", cost=" + cost + "]";
}

}
