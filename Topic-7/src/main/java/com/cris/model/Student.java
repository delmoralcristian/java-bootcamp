package com.cris.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_student;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private Date dateOfBirth;
	
	
	public Student(int id_student, String firstName, String lastName,
			Date dateOfBirth) {
		super();
		this.id_student = id_student;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	protected Student(){}
	
	public int getId_student() {
		return id_student;
	}
	public void setId_student(int id_student) {
		this.id_student = id_student;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
