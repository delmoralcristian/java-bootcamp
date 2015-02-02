package com.cris.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Meeting {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int id_meeting;
	
	@Column
	private int id_room;
	
	@Column
	private String start_time;
	
	@Column
	private String end_time;
	

	public List<Assistant> getAssistants() {
		return assistants;
	}

	public void setAssistants(List<Assistant> assistants) {
		this.assistants = assistants;
	}

	private List<Assistant> assistants;
	
	public Meeting(){}
	
	public int getId_meeting() {
		return id_meeting;
	}

	public void setId_meeting(int id_meeting) {
		this.id_meeting = id_meeting;
	}

	public int getId_room() {
		return id_room;
	}

	public void setId_room(int id_room) {
		this.id_room = id_room;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public Meeting(int id_meeting, int id_room, String start_time, String end_time) {
		this.id_meeting = id_meeting;
		this.id_room = id_room;
		this.start_time = start_time;
		this.end_time = end_time;
		this.assistants= new ArrayList<Assistant>();
	}

}
