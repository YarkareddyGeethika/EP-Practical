package com.klu.Student.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
//student table---->@Table(name="")
public class Student {

@Id
private int regno;//To make this as primarykey we use @Id
@Column
private String name;//If we donot write @Column also..it will be getting in columns automatically.
@Column
private String email;
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
