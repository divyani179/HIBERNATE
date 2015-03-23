package manytoone;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class MyCategory {
	@Column(name="MYCATEGORY_NAME")
	String name;
	@Id
	@GeneratedValue
	@Column(name="MYCATEGORY_ID")
	int id;
	@ManyToMany(cascade=CascadeType.ALL)
	Set<Item> items ;
	
	public MyCategory(String name, Set<Item> items) {
		super();
		this.name = name;
		this.items = items;
	}
	public MyCategory() {
		items = new HashSet<Item>();
	
	}
	
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
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
}
