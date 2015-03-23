package com.onetomany;

import java.util.HashSet;
import java.util.Set;

public class Category {
private long categoryId;
private String categoryName;
private Set<Book> bookNames =new HashSet<Book>(0);
public long getCategoryId() {
	return categoryId;
}
public void setCategoryId(long categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public Set<Book> getBookNames() {
	return bookNames;
}
public void setBookNames(Set<Book> bookNames) {
	this.bookNames = bookNames;
}
@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", categoryName="
			+ categoryName + ", bookNames=" + bookNames + "]";
}


}
