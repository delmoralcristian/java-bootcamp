package com.cris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assistant {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id_assistant;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	public Assistant(){}
	
	public String getId_assistant() {
		return id_assistant;
	}

	public void setId_assistant(String id_assistant) {
		this.id_assistant = id_assistant;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Assistant(String id_assistant, String first_name, String last_name) {
		super();
		this.id_assistant = id_assistant;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
}
