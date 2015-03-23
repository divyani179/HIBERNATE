package com.onetoone;

import javax.persistence.*;

@Entity
@Table(name="student1")
public class Student {
	@Column(name="stud_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	            generator="studseq")
	@SequenceGenerator(name="studseq",sequenceName="s_seq")
	@Id
	int id;
String name,department;
@OneToOne(cascade={CascadeType.ALL})
Address Address;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Address getAddress() {
	return Address;
}
public void setAddress(Address address) {
	Address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Student [name=" + name + ", department=" + department
			+ ", Address=" + Address + ", id=" + id + "]";
}

}
