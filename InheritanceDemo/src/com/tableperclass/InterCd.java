package com.tableperclass;

public class InterCd extends CdClass {
String language;
String region;
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
@Override
public String toString() {
	return "InterCd [language=" + language + ", region=" + region + "]";
}

}
