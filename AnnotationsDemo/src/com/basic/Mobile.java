package com.basic;

import javax.persistence.*;


@Entity
@Table(name="HiberMobile")
public class Mobile {
@Column(name="m_model")
String model;
int price;
@Column(name="mobile_id")
@GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="mobseq")
@SequenceGenerator(name="mobseq",sequenceName="m_seq")
@Id
int id;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Mobile [model=" + model + ", price=" + price + ", id=" + id + "]";
}

}
