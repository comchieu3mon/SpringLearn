package com.learn.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int id;
	
	@Column(name = "first_name", length = 60, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 60, nullable = false)
	private String lastName;
	
	@Column(name = "email", length = 60, nullable = false)
	private String email;
	
	@Column(name = "creation_date")
	private Date creationDate;
	
	public Person() {}

	public Person(int id, String firstName, String lastName, String email, Date creationDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@Override
	public String toString() {
		return "Person[ id = " + id + ", firstname = " + firstName + ", lastname = " + lastName 
				+ ", Date = " + creationDate + "]";
	}
}
