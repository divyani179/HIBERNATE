package com.onetomany;

public class Book {
int bookid;
String bookname,author;
int bookprice;

public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getBookprice() {
	return bookprice;
}
public void setBookprice(int bookprice) {
	this.bookprice = bookprice;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author="
			+ author + ", bookprice=" + bookprice + "]";
}

}
