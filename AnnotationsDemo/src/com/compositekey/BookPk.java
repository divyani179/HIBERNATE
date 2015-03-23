package com.compositekey;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class BookPk implements Serializable {
int bookid;
int isbn_no;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + bookid;
	result = prime * result + isbn_no;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BookPk other = (BookPk) obj;
	if (bookid != other.bookid)
		return false;
	if (isbn_no != other.isbn_no)
		return false;
	return true;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public int getIsbn_no() {
	return isbn_no;
}
public void setIsbn_no(int isbn_no) {
	this.isbn_no = isbn_no;
}

}
