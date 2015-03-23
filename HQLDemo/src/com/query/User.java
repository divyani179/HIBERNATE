package com.query;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="users")
/*@NamedQueries({
	@NamedQuery(
			name="findUserBySalary",
			query="from User i where i.salary like:salary"
			)
})*/
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class User {
String name;
@GeneratedValue(strategy=GenerationType.SEQUENCE,
generator="userseq")
@SequenceGenerator(name="userseq",sequenceName="user_sequence")
@Id
int id;
String city;
int salary;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "User [name=" + name + ", id=" + id + ", city=" + city + ", salary="
			+ salary + "]";
}

}
