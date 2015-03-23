package manytoone;

import javax.persistence.*;

@Entity
@Table(name="BOOK1")
public class Book {
	@Column(name="BOOK_NAME")
	String name;
	@Column(name="BOOK_ID")
	@Id
	@GeneratedValue
	int id;
	@Column(name="BOOK_AUTHOR")
	String author;
	
	@ManyToOne(cascade={CascadeType.ALL})
	Category book_category;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Category getBook_category() {
		return book_category;
	}
	public void setBook_category(Category bookCategory) {
		book_category = bookCategory;
	}
	public Book(String name, String author, Category bookCategory) {
		super();
		this.name = name;
		this.author = author;
		book_category = bookCategory;
	}

}
