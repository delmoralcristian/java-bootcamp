package com.cris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_course;
	
	@Column
	private String name;
	
	@Column
	private int id_teacher;
	
	@Column
	private int hoursWeek;
	
	@Column
	private int scheduleTime;
	
	public Course(int id_course, String name, int id_teacher, int hoursWeek,
			int scheduleTime) {
		super();
		this.id_course = id_course;
		this.name = name;
		this.id_teacher = id_teacher;
		this.hoursWeek = hoursWeek;
		this.scheduleTime = scheduleTime;
	}
	
	protected Course(){}

	public int getId_course() {
		return id_course;
	}

	public void setId_course(int id_course) {
		this.id_course = id_course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}

	public int getHoursWeek() {
		return hoursWeek;
	}

	public void setHoursWeek(int hoursWeek) {
		this.hoursWeek = hoursWeek;
	}

	public int getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(int scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

}
