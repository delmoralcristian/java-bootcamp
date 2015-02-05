package com.cris.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_teacher;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private Date dateOfBirth;
	
	public Teacher(int id_teacher, String firstName, String lastName,
			Date dateOfBirth) {
		super();
		this.id_teacher = id_teacher;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	protected Teacher(){}
	
	public int getId_student() {
		return id_teacher;
	}
	public void setId_student(int id_student) {
		this.id_teacher = id_student;
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
