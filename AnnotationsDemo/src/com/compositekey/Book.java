package com.compositekey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="compositebook")
public class Book {
	@EmbeddedId
	private BookPk bookpk;
	
	
public BookPk getBookpk() {
		return bookpk;
	}
	public void setBookpk(BookPk bookpk) {
		this.bookpk = bookpk;
	}
String title;
int price;
String author;


public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [title=" + title + ", price=" + price + ", author=" + author
			+ "]";
}

}
