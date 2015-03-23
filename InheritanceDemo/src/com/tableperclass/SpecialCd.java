package com.tableperclass;

public class SpecialCd extends CdClass{
String genre;

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

@Override
public String toString() {
	return "SpecialCd [genre=" + genre + "]";
}



}
