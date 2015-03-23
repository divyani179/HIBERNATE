package com.component;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
String name;
@Embedded
PersonAddress address;
@GeneratedValue(strategy=GenerationType.SEQUENCE,
generator="pseq")
@SequenceGenerator(name="pseq",sequenceName="person_sequence")
@Id
long personid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public PersonAddress getAddress() {
	return address;
}
public void setAddress(PersonAddress address) {
	this.address = address;
}
public long getPersonid() {
	return personid;
}
public void setPersonid(long personid) {
	this.personid = personid;
}
@Override
public String toString() {
	return "Person [name=" + name + ", sddress=" + address + ", personid="
			+ personid + "]";
}

}
