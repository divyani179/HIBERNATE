package manytoone;

import java.util.Set;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee") 
public class Item {
	@Column(name="ITEM_NAME")
	String name;
	@Id
	@GeneratedValue
	@Column(name="ITEM_ID")
	int id;
	@Column(name="ITEM_PRICE")
	float price;
	@ManyToMany(cascade=CascadeType.ALL)
	Set<MyCategory> category;
	

	public Set<MyCategory> getCategory() {
		return category;
	}
	public void setCategory(Set<MyCategory> category) {
		this.category = category;
	}
	public Item(String name, float price) {
		super();
		this.name = name;
		this.price = price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
