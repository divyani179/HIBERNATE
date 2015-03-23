package com.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="category")
public class Category {
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="catseq")
@SequenceGenerator(name="catseq",sequenceName="cate_sequence")
@Id
private long categoryId;
private String categoryName;
@OneToMany(cascade={CascadeType.ALL})
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
