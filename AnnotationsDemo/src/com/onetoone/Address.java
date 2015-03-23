package com.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="address1")
public class Address {
String city;
String state;
@Column(name="stud_id")
@GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="studseq")
@SequenceGenerator(name="studseq",sequenceName="s_seq")
@Id
int id;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Address [city=" + city + ", street=" + ", state=" + state
			+ ", id=" + id + "]";
}

}
